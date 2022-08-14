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
    public void ifTrue() {
        boolean truthy = false;
        if (!truthy) {
            assertFalse("truthy is not true", truthy);
        } else {
            assertTrue("truthy is true", truthy);
        }
        assertEquals("truthy = true", true, truthy);

    }

    public String sortCode(String title) {
        String sortCode;

        switch (title.toLowerCase().toUpperCase()) {
            case "UK":
                sortCode = "United Kingdom";
                break;
            case "US":
                sortCode = "United State";
                break;
            case "USA":
                sortCode = "United States";
                break;
            case "FR":
                sortCode = "France";
                break;
            case "SE":
                sortCode = "Sweden";
                break;

            default:
                sortCode = "Rest Of World";
                break;
        }
        return sortCode;
    }

    @Test
    public void testSortCode() {
        assertEquals("Rest Of World", sortCode("abc"));
    }


    public String intReturnString(int title) {
        String intReturnString;

        switch (title) {
            case 1:
                intReturnString = "One";
                break;
            case 2:
                intReturnString = "Two";
                break;
            case 3:
                intReturnString = "Three";
                break;

            default:
                throw new IllegalStateException("Unexpected value: " + title);
        }
        return intReturnString;

    }

    @Test

        public void testIntReturnString () {
            assertEquals("One", intReturnString(3));

        }

    }










