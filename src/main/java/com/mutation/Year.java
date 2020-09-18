package com.mutation;

import java.util.Scanner;

public class Year {

    String isLeapYear(int year) {
        return (year % 4 == 0) && ((year % 100 != 0) || (year % 400 == 0)) ? "Leap Year" : "Not a Leap Year";
    }

    int findCentury(int year) {
        if (year % 100 == 0)
            return year / 100;
        else
            return (year / 100 + 1);
    }

    public static void main(String[] args) {
        System.out.println("Enter an year");
        Scanner scanner = new Scanner(System.in);
        int input = scanner.nextInt();
        Year year = new Year();
        System.out.println(year.isLeapYear(input));
        System.out.println(year.findCentury(input) + "Century");
    }
}