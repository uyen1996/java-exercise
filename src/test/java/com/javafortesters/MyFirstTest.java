package com.javafortesters;
import org.junit.Test;


import static java.lang.Integer.toHexString;
import static org.junit.Assert.assertEquals;

public class MyFirstTest {
    @Test
    public void canAddTwoPlusTwo123() {
        int answer = 2 + 2;
        assertEquals("2+2=4", 4, answer);
    }
    @Test
    public void canAddFourDivideTwo123() {
        int answer = 4 / 2;
        assertEquals("4/2=2", 2, answer);
    }
    @Test
    public void canAddTwoMultipleTwo() {
        int answer = 2 * 2;
        assertEquals("2*2 = 4", 4, answer);
    }
    @Test
    public void canConvertIntToHex() {
        Integer eleven = new Integer("11");
        String hex = new String("b");
        assertEquals("11 returns b", hex , toHexString(eleven));    }
}