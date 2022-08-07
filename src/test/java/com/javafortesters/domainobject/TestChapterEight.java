package com.javafortesters.domainobject;

public class TestChapterEight {
    public static String addCat(String cat) {
        return cat + "s";
    }

    public static String numberOfCat(int number, String cat) {
        if (number == 1)
            return cat;
        {
            return cat + "cats";

        }
    }
}
