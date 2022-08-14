package baiTap.practice.algorithm;

import com.sun.tools.javac.util.StringUtils;

import java.util.Scanner;


public class oddOrEven {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        int input = 0;
        while (true) {

            System.out.print("Please enter integer : ");
            String tmp = kb.nextLine();
//            String input = isStringInteger(tmp);
                break;
//            System.out.println(input + " Exceeded maximum number");
        }
        addNumber(input);
    }

//            if  ( input >=0) break;
//            if(input <= 2147483647)
//            {
//                System.out.println(tmp + " Exceeded maximum number");
//            }
//            System.out.println(tmp + " is invalid input, please try again");
//        }
//        addNumber(input);


    public static int addNumber(int num) {

            if (num % 2 != 0 && num >=0)  {
                System.out.println(num + " is odd - Weird");
            } else if ((num % 2 == 0) && 2 <= num && num <= 5) {
                System.out.println(num + " is even - Not Weird");
            } else if ((num % 2 == 0) && 6 <= num && num <= 20) {
                System.out.println(num + " is even - Weird");
            } else if ((num % 2 == 0)  && num > 20 && num <=2147483647) {
                System.out.println(num + " is even - Not Weird");
            }
//            else if(num == 0 && num % 2 == 0){
//                System.out.println(num + " is even - but out of scope");
//            }
        return num;
    }

//    private static final String NUMBER = "[0-9]";

    public static String isStringInteger(String str ){
        try {
            int x = Integer.parseInt(str);
        } catch (NumberFormatException e) {
            System.out.println("Input String cannot be parsed to Integer.");
        }
        return str;
    }
    }


//        public static int isInteger01(String str) {
//        try {
//            int x = Integer.parseInt(str);
//            return x;
//        } catch (NumberFormatException e) {
//            return 1;
//        }
//    }




