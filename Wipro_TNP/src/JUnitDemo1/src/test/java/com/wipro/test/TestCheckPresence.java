package com.wipro.test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

import com.wipro.task.DailyTasks;

public class TestCheckPresence {

    DailyTasks dt = new DailyTasks();

    @Test
    void testCheckPresenceTrue() {
        assertTrue(dt.checkPresence("Hello World", "World"));
    }

    @Test
    void testCheckPresenceFalse() {
        assertFalse(dt.checkPresence("Hello World", "Java"));
    }
}