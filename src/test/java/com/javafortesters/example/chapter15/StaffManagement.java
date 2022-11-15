//package com.javafortesters.example.chapter15;
//import com.javafortesters.example.chapter15.Profile;
//
//import java.util.ArrayList;
//import java.util.Scanner;
//import java.util.Collections;
//
//
//public class StaffManagement {
//    private ArrayList listStaff;
//
//    public StaffManagement() {
//        listStaff = new ArrayList(10);
//    }
//
//    public void addStaff(Profile staff) {
//        listStaff.add(staff);
//    }
//
//    public void inputListStaff(Scanner kb) {
//        Profile staff;
//        System.out.print("Input amount Staff: ");
//        int n = kb.nextInt();
//        System.out.println("Enter list staff: ");
//        for (int i = 0; i < n; i++) {
//            System.out.println("Staff " + (i + 1) + " is:");
//            staff = new Profile();
//            staff.inputInfoMember();
//            // Them sv vao danh sach
//            addStaff(staff);
//        }
//    }
//
//    public void displayList() {
//        Profile staff;
//
//
//        int i = 1;
//        for (Profile staff  : listStaff) {
//            System.out.println("Staff " + i + " is:");
//            staff.printInfoMember();
//            i++;
//        }
//    }
//
//    public void findStaff(String name) {
//        for (Profile staff : listStaff) {
//            if (name.equals(staff.getName())) {
//                staff.di;
//            }
////        Profile a = new Profile();
////
////        System.out.println("Enter name staff : ");
////        if (name.equals(a.getName())) {
////                a.printInfoMember();
////            }
//        }
//    }
//
