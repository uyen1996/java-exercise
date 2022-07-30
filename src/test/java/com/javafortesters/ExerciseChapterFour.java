package com.javafortesters;

import org.junit.Test;

import static java.lang.Integer.toHexString;
import static org.junit.Assert.assertEquals;

public class ExerciseChapterFour {
    @Test
    public void canConvertEleventToB() {
        Integer eleven = new Integer("11");
        String hex = new String("b");
        assertEquals("11 becomes b", hex , toHexString(eleven));
    }

    @Test
    public void canConvertTenToA() {
        Integer ten = new Integer("10");
        String hex = new String("a");
        assertEquals("10 becomes a", hex , toHexString(ten));
    }

    @Test
    public void canConvertThreeToThree() {
        Integer three = new Integer("3");
        String hex = new String("3");
        assertEquals("3 becomes 3", hex , toHexString(three));
    }

    @Test
    public void canConvert() {
        Integer twentyone = new Integer("21");
        String hex = new String("15");
        assertEquals("21 becomes 15", hex , toHexString(twentyone));
    }

    @Test
    public void canCompareMin(){
        Integer value = new Integer("-2147483648");
        Integer minValue = Integer.MIN_VALUE;
        assertEquals("min value = -2147483648 ", value , minValue);
    }

    @Test
    public void canCompareMax(){
        Integer value = new Integer("2147483647");
        Integer maxValue = Integer.MAX_VALUE;
        assertEquals("max value = 2147483647", value , maxValue);
    }

}

