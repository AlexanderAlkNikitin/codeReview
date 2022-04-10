package ru.anikitin.codereview.task_1.adapter;

import ru.anikitin.codereview.task_1.app.Reader;

import java.io.IOException;
import java.nio.file.Path;
import java.util.Scanner;

public class FileByLineReader implements Reader<String> {

    private Scanner scanner;

    public void open(String fileName) throws IOException {
        scanner = new Scanner(Path.of(fileName));
    }

    public String read() {
        if (scanner.hasNextLine()) {
            return scanner.nextLine();
        }
        System.out.println("No line found");
        return "";
    }

    public boolean canRead() {
        return scanner.hasNextLine();
    }
}
