package ru.anikitin.codereview.task_1.app;


import org.junit.jupiter.api.Test;
import ru.anikitin.codereview.task_1.adapter.FileByLineReader;
import ru.anikitin.codereview.task_1.service.UniqueIpCounter;

import java.io.IOException;

import static org.junit.jupiter.api.Assertions.assertEquals;


class IpCounterAppTest {

    private final Counter counter = new UniqueIpCounter();
    private final FileByLineReader fileByLineReader = new FileByLineReader();
    private final IpCounterApp ipCounterApp = new IpCounterApp(fileByLineReader, counter);

    @Test
    void correct() throws IOException {
        assertEquals(5, ipCounterApp.getUniqueIpCount("src/main/resources/ips.txt"));
    }

    @Test
    void incorrectLine() throws IOException {
        assertEquals(5, ipCounterApp.getUniqueIpCount("src/main/resources/ips_zero.txt"));
    }
}