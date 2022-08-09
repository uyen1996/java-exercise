package baiTap.practice.algorithm;

import java.util.Scanner;


public class oddOrEven {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        int input;
        while (true) {

            System.out.print("Please enter : ");
            String tmp = kb.nextLine();
            input = isInteger01(tmp);
//            if  (0 >= input && input >= 0) break;
                        if  ( input > -2147483648) break;

            System.out.println(tmp + " is invalid input, please try again");
        }
        addNumber(input);
    }

    public static void addNumber(int num) {
            if (num % 2 != 0) {
                System.out.println(num + " is odd - Weird");
            } else if ((num % 2 == 0) && 2 <= num && num <= 5) {
                System.out.println(num + " is even - Not Weird");
            } else if ((num % 2 == 0) && 6 <= num && num <= 20) {
                System.out.println(num + " is even - Weird");
            } else if ((num % 2 == 0) && num > 20) {
                System.out.println(num + " is even - Not Weird");
            }

    }




    private static final String NUMBER = "[(-2147483648) - 2147483647]";

    public static int isInteger01(String str) {
        try {
            if (str != NUMBER) {
                int x = Integer.parseInt(str);
                return x;
            }
        } catch (NumberFormatException e) {
            return 0;
        }
        return 0;
    }


//        public static int isInteger01(String str) {
//        try {
//            int x = Integer.parseInt(str);
//            return x;
//        } catch (NumberFormatException e) {
//            return 1;
//        }
//    }
}



