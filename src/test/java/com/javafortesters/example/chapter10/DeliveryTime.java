package com.javafortesters.example.chapter10;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.DayOfWeek;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;
import java.time.LocalDate;

import static java.time.LocalDate.*;


public class DeliveryTime {
    private static int day, month;

    public static void main(String[] args) {
        String sourceDate = "";
        Scanner kb = new Scanner(System.in);
        System.out.println("Insert order day: " + sourceDate);
        sourceDate = kb.nextLine();
        SimpleDateFormat formattedDate = new SimpleDateFormat("yyyy-MM-dd");
        Calendar c = Calendar.getInstance();
        try {
            c.setTime(formattedDate.parse(sourceDate));
        } catch (ParseException e) {
            e.printStackTrace();
        }
        c.add(Calendar.DATE, 4);  // number of days to add
        String delivery = (String)(formattedDate.format(c.getTime()));
        System.out.println("Delivery date is " + delivery);

    }
    public static LocalDate addDaysSkippingWeekends(LocalDate date, int days) {
        LocalDate result = date;
        int addedDays = 0;
        while (addedDays < days) {
            result = result.plusDays(1);
            if (!(result.getDayOfWeek() == DayOfWeek.SATURDAY || result.getDayOfWeek() == DayOfWeek.SUNDAY)) {
                ++addedDays;
            }
        }
        return result;
    }

    }


