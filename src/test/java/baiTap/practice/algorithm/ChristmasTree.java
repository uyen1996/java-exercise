package baiTap.practice.algorithm;

import java.util.Scanner;

public class ChristmasTree {
    public static void main(String[] args) {
//        int input;
//        Scanner kb = new Scanner(System.in);
//        System.out.println("Input row: ");
//        input = kb.nextInt();
//        for (int i = 0; i <= input; i++) {
//                System.out.println("*" + i);
//            }
        int rows = 5;

        for (int i = 1; i <= rows; i++) {
            for (int j = 1; j <=i; j++) {
                System.out.print("*" + " ");
            }
            System.out.println();
        }
    }
}

