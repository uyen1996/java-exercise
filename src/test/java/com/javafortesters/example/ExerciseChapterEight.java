package com.javafortesters.example;

import org.junit.Test;

import static org.junit.Assert.*;


public class ExerciseChapterEight {
    @Test
    public void Cat() {
        assertEquals("1 is a cat", "cat", catOrCats(3));
    }

    private String catOrCats(int number) {
        if (number == 1)
            return "cat";
        {
            return "cats";

        }
    }

    @Test
    public void assertTrueIfTrue() {
        assertEquals("truthy = true", true, trueOrFalse(false));
    }

    private boolean trueOrFalse(boolean truthy) {
        if (truthy = true)
            return true;

        return truthy;
    }
}





