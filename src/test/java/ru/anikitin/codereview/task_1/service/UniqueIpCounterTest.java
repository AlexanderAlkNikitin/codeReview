package ru.anikitin.codereview.task_1.service;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class UniqueIpCounterTest {

    UniqueIpCounter uniqueIpCounter = new UniqueIpCounter();

    @Test
    void addOneNotUniqueTest() {
        uniqueIpCounter.add(1);
        uniqueIpCounter.add(2);
        uniqueIpCounter.add(3);
        uniqueIpCounter.add(3);
        assertEquals(3, uniqueIpCounter.getCount());
    }

    @Test
    void addAllUniqueTest() {
        uniqueIpCounter.add(1);
        uniqueIpCounter.add(2);
        uniqueIpCounter.add(3);
        uniqueIpCounter.add(4);
        assertEquals(4, uniqueIpCounter.getCount());
    }

    @Test
    void addNullTest() {
        uniqueIpCounter.add(null);
        uniqueIpCounter.add(2);
        uniqueIpCounter.add(3);
        uniqueIpCounter.add(4);
        assertEquals(3, uniqueIpCounter.getCount());
    }

    @Test
    void addNegativeTest() {
        uniqueIpCounter.add(-3);
        uniqueIpCounter.add(2);
        uniqueIpCounter.add(3);
        uniqueIpCounter.add(4);
        assertEquals(3, uniqueIpCounter.getCount());
    }


}