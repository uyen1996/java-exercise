package baiTap.practice.algorithm;

import java.util.Scanner;

import static java.lang.Math.random;

public class Array {
    public static void main(String[] args) {
        int row, column;
        Scanner kb = new Scanner(System.in);
        System.out.println("Input row: ");
        row = kb.nextInt();
        System.out.println("Input column: ");
        column = kb.nextInt();
        System.out.println("Output:");
        int[][] array = new int[row][column];
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < column; j++) {
                array[i][j] = (int) (Math.random() * 100);
            }
        }
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < column; j++) {
                System.out.print("  " + array[i][j]);
            }
            System.out.print("\n");
        }
        int count = 0;
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < column; j++) {
                if (array[i][j] % 2 == 0) {
                    count++;
                }

            }
        }
        System.out.print("Count Number: " + count);
    }




}





