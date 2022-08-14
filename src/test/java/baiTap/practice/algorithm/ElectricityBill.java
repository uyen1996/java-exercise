package baiTap.practice.algorithm;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;
public class ElectricityBill {
    public static void main(String[] args) {
        int units;
        Scanner kb = new Scanner(System.in);
        while (true) {
            System.out.print(" Please enter the units  : ");
            String tmp = kb.nextLine();
            units = isInteger(tmp);
            if (units > 0 & units <= 1000000) break;
            System.out.println(tmp + " is invalid input, please try again");
        }
        int total_amount = ElectricityConsume(units);
        System.out.println("Electricity Bill  =  " + total_amount + "VND");
    }

    public static int ElectricityConsume(int units) {
        int amount = 0;
        if (units < 8) {
            amount = units * 1250;
        } else if (units >= 8 && units <= 15) {

            amount = ((8 * 1250) + (units - 8) * 1500);
        } else if (units > 15 && units <= 22) {
            amount = 8 * 1250 + 7 * 1500 + (units - 15) * 1800;
        } else if (units > 22 && units <= 1000000) {
            amount = 8 * 1250 + 7 * 1500 + 7 * 1800 + (units - 22) * 2100;
        }
        return amount;
    }

    private static final String NUMBER = "[0-9]";
    public static int isInteger(String str) {
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
}