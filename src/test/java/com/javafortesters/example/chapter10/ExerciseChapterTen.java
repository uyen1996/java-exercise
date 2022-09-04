package com.javafortesters.example.chapter10;

import com.javafortesters.User;
import org.apache.commons.collections4.MultiValuedMap;
import org.apache.commons.collections4.multimap.ArrayListValuedHashMap;
import org.junit.Test;
import org.testng.collections.MultiMap;

import java.sql.Wrapper;
import java.util.*;


import static java.lang.String.valueOf;
import static org.junit.Assert.*;

public class ExerciseChapterTen {
    private String username;
    private String password;

    @Test
    public void collectionOfUsers() {
        Collection firstcollection;
        firstcollection = new ArrayList();
        assertEquals(0, firstcollection.size());
        assertTrue(firstcollection.isEmpty());
        firstcollection.add("user1");
        firstcollection.add("user2");
        assertEquals(2, firstcollection.size());
        assertFalse(firstcollection.isEmpty());
        Collection secondcollection;
        secondcollection = new ArrayList();
        firstcollection.add("usersdef1");
        firstcollection.add("usersdef2");
        secondcollection.addAll(firstcollection);
        assertTrue(secondcollection.containsAll(firstcollection));
//        Scanner kb = new Scanner(System.in);
//        System.out.print(users);
        secondcollection.removeAll(secondcollection);
        assertTrue(secondcollection.isEmpty());
        firstcollection.clear();
        assertTrue(firstcollection.isEmpty());
    }


    @Test
    public void listOfUsers() {
        List<String> userList = new ArrayList<String>();
        List<String> user1 = new ArrayList<String>();
        List<String> user2 = new ArrayList<String>();
        user1.add("A");
        user2.add("B");
        userList.addAll(0 , user1);
        userList.addAll(0 , user2);
        assertEquals("B",userList.get(0));
        assertEquals("A",userList.get(1));
    }

    @Test
    public void setOfUsers() {
        Scanner kb = new Scanner(System.in);
        Set users = new HashSet();
        for (int i = 1; i <= 10; i++){
            users.add("Emily");
            System.out.println(users);
        }
        assertEquals(1, users.size());
    }


    @Test
    public void mapOfUsers() {
        Scanner kb = new Scanner(System.in);
        MultiValuedMap<String, User> map = new ArrayListValuedHashMap<>();

        assertTrue(map.isEmpty());
        User user1 = new User();
        user1.setUsername("John");
        System.out.println(user1.setUsername("John"));
        User user2 = new User();
        System.out.println(user2.setUsername("Emily"));
        map.put("key1", user1);
        map.put("key1", user2);
        assertEquals(2, map.size());
    }

    }



