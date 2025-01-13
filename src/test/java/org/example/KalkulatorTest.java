package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class KalkulatorTest {

    @Test
    void nasobic() {
        Kalkulator kalkulator = new Kalkulator(3,4);
        assertTrue(kalkulator.nasobic()==12);
    }

    @Test
    void scitanec() {
        Kalkulator kalkulator = new Kalkulator(13,4);
        assertTrue(kalkulator.scitanec()==7);
    }
}