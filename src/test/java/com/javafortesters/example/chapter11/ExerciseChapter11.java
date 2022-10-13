package com.javafortesters.example.chapter11;
import org.junit.Test;
import org.testng.collections.MultiMap;
import java.sql.Wrapper;
import java.util.*;
import static java.lang.String.valueOf;
import static org.junit.Assert.*;

public class ExerciseChapter11 {
    @Test
    public void throwANullPointerException() {
        Integer age = null;
        String ageAsString;
        try{
            ageAsString = age.toString();
        }
        catch(NullPointerException e){
            age = 18;
            ageAsString = age.toString();
        }
        String yourAge = "You are " + age.toString() + " years old";
        assertEquals("You are 18 years old", yourAge);
    }

    @Test
    public void throwANullPointerException02() {
    Integer age=null;
    String ageAsString;
    try{
        ageAsString = age.toString();
    }
    catch(NullPointerException e){ age = 18;
        ageAsString = age.toString();
    }
    catch(IllegalArgumentException e){
        System.out.println("Illegal Argument: " + e.getMessage());
    }
    }

    @Test(expected = NullPointerException.class)
    public void nullPointerExceptionExpected(){
        Integer age=null;
        age.toString();
    }

    @Test public void tryCatchFinallyANullPointerException(){
        Integer age=null;
        String ageAsString;
        String yourAge="";
        try{
            ageAsString = age.toString();
        }
        catch(NullPointerException e){
            age = 18;
            ageAsString = age.toString();
        }finally
        {
            yourAge = "You are " + age.toString() + " years old";
        }
        assertEquals("You are 18 years old", yourAge);
    }

    @Test(expected = IllegalArgumentException.class)
    public void exampleTryCatchFinally(){
        Integer age=null;
        try{
            System.out.println("1. generate a null pointer exception");
            System.out.println(age.toString());
        }
        catch(NullPointerException e){
            System.out.println("2. handle null pointer exception");
//            throw new IllegalArgumentException ("Null pointer became Illegal", e);
        }
        finally
        {
            System.out.println("3. run code in finally section");
        }
    }
    }




