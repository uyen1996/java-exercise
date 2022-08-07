package com.javafortesters;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.Result;


import static java.lang.Integer.toHexString;
import static org.junit.Assert.assertEquals;

public class MyFirstTest {
    @Test
    public void canAddTwoPlusTwo() {
        int answer = 2 + 2;
        assertEquals("2+2=4", 4, answer);
    }

    @Test
    public void canAddFourDivideTwo() {
        int answer = 4 / 2;
        assertEquals("4/2=2", 2, answer);
    }

    @Test
    public void canAddTwoMultipleTwo() {
        int answer = 2 * 2;
        assertEquals("2*2 = 4", 4, answer);
    }

    @Test
    public void someStringMethods() {
        String aString = "abcdef";
        assertEquals(6, aString.length());
    }
}
