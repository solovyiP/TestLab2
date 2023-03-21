package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;


class MainTest {
    @Test
    public void testYearFalse(){
        int year = 2003;
        assertEquals(366, Main.year(year));
    }

    @Test
    public void testYearTrue(){
        int year = 2400;
        assertEquals(366, Main.year(year));
    }

}