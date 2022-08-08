package com.javafortesters.example.chapter8;

import org.junit.Test;

import static org.junit.Assert.*;


public class ExerciseChapterEight {
    @Test
    public void Cat() {
        assertEquals("1 is a cat", "cat", catOrCats(1));
    }

    private String catOrCats(int number) {
        if (number == 1)
            return "cat";
        {
            return "cats";

        }
    }

    @Test
    public void ifTrue(){
        boolean truthy = false;
        if(!truthy){
            assertFalse("truthy is not true", truthy);
        }
        else{
            assertTrue("truthy is true", truthy);
        }
        assertEquals("truthy = true", true, truthy);

    }
}





