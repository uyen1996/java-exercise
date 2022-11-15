package com.javafortesters.example.chapter14;

import org.junit.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;
import static org.hamcrest.core.IsEqual.equalTo;
import static org.hamcrest.core.IsNot.not;
import static org.hamcrest.core.IsNull.nullValue;
import static org.hamcrest.core.StringContains.containsString;
import static org.hamcrest.core.StringEndsWith.endsWith;
import static org.hamcrest.core.StringStartsWith.startsWith;

public class Hamcrest {
    @Test
    public void Test01(){
        assertThat("3 + 3 = 6", 3 + 3, is(6));
    }
    @Test
    public void Test02(){
        assertThat("3 + 3 = 6", 3 + 3, equalTo(6));
    }

    @Test
    public void Test03(){
        assertThat("3 + 3 = 6", 3 + 3, is(not(7)));
    }

    @Test
    public void Test04(){
        assertThat("Uyen", "Uyen", containsString("y"));
    }

    @Test
    public void Test05(){
        assertThat("Uyen", "Uyen", endsWith("n"));
    }

    @Test
    public void Test06(){
        assertThat("Uyen", "Uyen", startsWith("U"));
    }

    @Test
    public void Test07(){
        assertThat("Uyen", "Uyen", nullValue());
    }

}



