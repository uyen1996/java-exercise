package baiTap.practice.algorithm;
import java.util.Scanner;
public class ElectricityBill {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        System.out.print(" Please ennter the units  : ");
        int units;
        int total_amount;
        units = kb.nextInt();
        total_amount = ElectricityConsume(units);
        System.out.println("Electricity Bill  =  " + total_amount + "VND");
    }
    public static int ElectricityConsume(int units) {
        int amount = 0;
        if (units < 8) {
            amount = units * 1250;
        }
        else if (units >= 8 && units <= 15) {

            amount = ((8 * 1250) + (units - 8) * 1500);
        }
        else if (units > 15 && units <= 22) {
            amount = 8 * 1250 + 7 * 1500 + (units - 15) * 1800;
        }
        else if (units >22) {
            amount = 8 * 1250 + 7 * 1500 + 7 * 1800 +  (units -22) * 2100;
        }
        return amount;
    }
}
