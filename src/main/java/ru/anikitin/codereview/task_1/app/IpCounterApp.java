package ru.anikitin.codereview.task_1.app;

import ru.anikitin.codereview.task_1.util.StringConverter;

import java.io.IOException;

/**
 * Счетчик уникальных IPv4 адресов
 */
public class IpCounterApp {
    private static final String REGEX = "\\.";
    private static final String REPLACEMENT = "0";
    private static final int FROM = 256;
    private static final int TO = 10;
    private final Reader<String> fileByLineReader;
    private final Counter<Integer> ipCounter;

    public IpCounterApp(Reader<String> fileByLineReader, Counter<Integer> ipCounter) {
        this.fileByLineReader = fileByLineReader;
        this.ipCounter = ipCounter;
    }

    /**
     * Получение кол-ва уникальных IP адресов
     *
     * @return кол-во IP
     */
    public int getUniqueIpCount(String fileName) throws IOException {
        fileByLineReader.open(fileName);

        while (fileByLineReader.canRead()) {
            try {
                String line = fileByLineReader.read();
                if (line != null) {
                    String zeroInsteadPoint = line.trim().replaceAll(REGEX, REPLACEMENT);
                    int ip = getConvertedIp(zeroInsteadPoint);
                    ipCounter.add(ip);
                }

            } catch (IllegalArgumentException e) {
                System.out.println("Не корректная строка " + e.getMessage());
            }
        }
        return ipCounter.getCount();
    }

    private int getConvertedIp(String zeroInsteadPoint) {
        var converted = StringConverter.convertStringTo(zeroInsteadPoint, FROM, TO);
        if (converted != null && !converted.isEmpty() && !converted.isBlank()) {
            return Integer.parseInt(converted);
        } else {
            throw new IllegalArgumentException(zeroInsteadPoint);
        }

    }
}
