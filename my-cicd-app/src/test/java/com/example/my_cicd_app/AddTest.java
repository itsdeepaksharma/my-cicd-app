package com.example.my_cicd_app;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class AddTest {

    @Test
    public void testAdd() {
        Add app = new Add();
        assertEquals(5, app.add(2, 3)); // Checks if 2+3 equals 5
    }
}
