package com.company;

import java.text.NumberFormat;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

     Scanner input = new Scanner(System.in);

     byte months = 12;
     byte percentage = 100;

     System.out.print("Principal: ");
     int principal = input.nextInt();

        System.out.print("Annual Interest Rate: ");
        float rate = input.nextFloat();

        float rateA = (rate / percentage) / months;

        System.out.print("Period (Years): ");
        byte years = input.nextByte();

        int monthYears = years * months;

        double mortgage = principal* (rateA * (Math.pow(1 + rateA, monthYears)))/
                ((Math.pow(1+rateA, monthYears))-1);

        System.out.println("Mortgage: " + NumberFormat.getCurrencyInstance().format(mortgage));
    }
}
