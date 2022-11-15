package com.javafortesters.example.chapter15;

import java.util.Scanner;

public class QE extends Profile {
    private int choosQEType;
    private String QESkill;
    public QE(){
        super();
    }
//    public void displayQE(){
//        System.out.println("Is a QE");
//    }

    public String addQEType(){
        Scanner kb = new Scanner(System.in);
        System.out.print("Enter skill (1 is Automation, 2 is Performance) : ");
        choosQEType = kb.nextInt();
        switch (choosQEType) {
            case 1:
                QESkill = "Automation";
                break;

            case 2:
                QESkill = "Performance";
                break;
            default:
                System.out.println("Invalid skill");
                break;
        }
        return QESkill;
    }

    public void inputInfoMember(){
        super.inputInfoMember();
    }

    public String printInfoMember() {
        return super.printInfoMember() + "\nQE Skill : " + addQEType() + "\nIs a QE";
    }

    public void findStaff(String name) {
        Profile a = new Profile();
        System.out.println("Enter name staff : ");
        if (name.equals(a.getName())) {
            a.printInfoMember();
        }
    }
}
