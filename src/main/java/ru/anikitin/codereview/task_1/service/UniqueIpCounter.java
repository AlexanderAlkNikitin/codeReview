package ru.anikitin.codereview.task_1.service;

import ru.anikitin.codereview.task_1.app.Counter;

import java.util.BitSet;

public class UniqueIpCounter implements Counter<Integer> {

    private final BitSet bitSet = new BitSet(Integer.MAX_VALUE);

    private int counter;

    public void add(Integer s) {
        if (s != null && s > 0 && !bitSet.get(s)) {
            counter++;
            bitSet.set(s);
        }
    }

    public int getCount() {
        return counter;
    }
}
