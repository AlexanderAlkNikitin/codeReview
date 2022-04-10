package ru.anikitin.codereview.task_1;

import ru.anikitin.codereview.task_1.adapter.FileByLineReader;
import ru.anikitin.codereview.task_1.app.IpCounterApp;
import ru.anikitin.codereview.task_1.service.UniqueIpCounter;

import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        FileByLineReader fileByLineReader = new FileByLineReader();
        UniqueIpCounter uniqueIpCounter = new UniqueIpCounter();
        IpCounterApp ipCounterApp = new IpCounterApp(fileByLineReader, uniqueIpCounter);
        Scanner scanner = new Scanner(System.in);
        System.out.println(ipCounterApp.getUniqueIpCount(scanner.nextLine()));
        scanner.close();
    }
}
