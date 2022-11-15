package com.javafortesters.example.chapter15;
import java.util.Scanner;

public class Dev extends Profile {
    private int chooseDevType;
    private String DevSkill;

    public Dev() {
        super();
    }

    public void displayDev() {
        System.out.println("Is a Dev");
    }

    public String addDevType() {
        Scanner kb = new Scanner(System.in);
        System.out.print("Enter skill (1 is BE, 2 is FE) : ");
        chooseDevType = kb.nextInt();
        switch (chooseDevType) {
            case 1:
                DevSkill = "BE";
                break;

            case 2:
                DevSkill = "FE";
                break;
            default:
                System.out.println("Invalid skill");
                break;
        }
        return DevSkill;
    }

    public void inputInfoMember() {
        super.inputInfoMember();
    }


    @Override
    public String printInfoMember() {
        return super.printInfoMember() + "\nQE Skill : " + addDevType();
    }
}
