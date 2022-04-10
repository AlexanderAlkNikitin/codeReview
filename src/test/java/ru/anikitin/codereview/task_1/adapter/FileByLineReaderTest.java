package ru.anikitin.codereview.task_1.adapter;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.IOException;

import static org.junit.jupiter.api.Assertions.assertTrue;

class FileByLineReaderTest {

    FileByLineReader fileByLineReader = new FileByLineReader();

    @BeforeEach
    void setUp() throws IOException {
        fileByLineReader.open("src/main/resources/ips.txt");
    }

    @Test
    void name() {
        assertTrue(fileByLineReader.canRead());
    }

    @Test
    void name2() {
        int i = 0;
        while (i < 10) {
            fileByLineReader.read();
            i++;
        }

    }
}