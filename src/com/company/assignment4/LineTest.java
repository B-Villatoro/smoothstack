package com.company.assignment4;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LineTest {

    @org.junit.jupiter.api.Test
    void getSlope() {
        Line testLine = new Line(1.00, 5.00 ,2.00,2.00);
        assertEquals(-3,testLine.getSlope(),.001);
    }

    @org.junit.jupiter.api.Test
    void getDistance() {
        Line testLine = new Line(1.00, 5.00 ,2.00,2.00);
        assertEquals(3.1622,testLine.getDistance(),.001);
    }

    @org.junit.jupiter.api.Test
    void parallelTo() {
        Line testLine0 = new Line(1.00, 5.00 ,2.00,2.00);
        Line testLine1 = new Line(2.00,6.00,3.00,3.00);
        assertEquals(true,testLine0.parallelTo(testLine1));
    }

}