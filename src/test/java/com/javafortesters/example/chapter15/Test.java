package com.javafortesters.example.chapter15;

import java.util.Scanner;

public class Test {
    public static void main (String [] args){
Scanner kb = new Scanner(System.in);
        QE qe = new QE();
        qe.inputInfoMember();
        String result = qe.printInfoMember();
        System.out.println(result);
//        String result = a.printInfoMember();
//        System.out.println(result);
       String input = kb.nextLine();
        qe.findStaff(input);

    }
}
