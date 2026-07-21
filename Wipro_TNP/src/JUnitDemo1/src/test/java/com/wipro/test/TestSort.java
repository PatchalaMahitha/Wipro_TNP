package com.wipro.test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

import org.junit.jupiter.api.Test;

import com.wipro.task.DailyTasks;

public class TestSort {

    DailyTasks dt = new DailyTasks();

    @Test
    void testSortValues() {

        int[] input = {5, 2, 8, 1, 4};
        int[] expected = {1, 2, 4, 5, 8};

        assertArrayEquals(expected, dt.sortValues(input));
    }
}