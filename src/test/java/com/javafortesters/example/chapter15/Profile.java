package com.javafortesters.example.chapter15;
import java.util.ArrayList;
import java.util.Scanner;

public class Profile {
    private String name;
    private String email;
    private String level;
    private String squad;
    private int choosesquad;

    public Profile(String name, String email, String level, String squad) {
        this.name = name;
        this.email = email;
        this.level = level;
        this.squad = squad;
    }

    public Profile() {

    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public String getLevel() {
        return level;
    }


    public void setName(String name) {
        this.name = name;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setLevel(String level) {
        this.level = level;
    }


    public String addSquad(){
        Scanner kb = new Scanner(System.in);
        System.out.print("Enter squad (1 is PCTCS, 2 is PCTMT) : ");
        choosesquad = kb.nextInt();
        switch (choosesquad) {
            case 1:
                squad = "PCTCS";
//                System.out.println("is" + squad);
                break;

            case 2:
                squad = "PCTMT";
                break;
            default:
                System.out.println("Invalid squad");
                break;
        }
        return squad;
    }


    public  void inputInfoMember(){
        Scanner kb = new Scanner(System.in);
        System.out.print("Enter name: ");
        name = kb.nextLine();
        System.out.print("Enter email: ");
        email = kb.nextLine();
        System.out.print("Enter level: ");
        level = kb.nextLine();

    }

        public String printInfoMember() {
            return "Name : " + this.name + "\nEmail: " + this.email + "\nLevel: "
                    + this.level  + "\nSquad: " + addSquad();
    }
    }



