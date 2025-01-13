package org.example;

import static org.junit.jupiter.api.Assertions.*;

class KalkulatorTest {

    @org.junit.jupiter.api.Test
    void nasobic() {
        Kalkulator kalkulator = new Kalkulator(3,4);
        assertTrue(kalkulator.nasobic()==12);
    }

    @org.junit.jupiter.api.Test
    void scitanec() {
        Kalkulator kalkulator = new Kalkulator(13,4);
        assertTrue(kalkulator.scitanec()==7);
    }
}