package ru.anikitin.codereview.task_1.util;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;


class StringConverterTest {

    @Test
    void convertedTest() {
        assertEquals("256", StringConverter.convertStringTo("0000010", 256, 10));
    }

    @Test
    void converted2Test() {
        assertEquals("", StringConverter.convertStringTo("0000000", 256, 10));
    }
}