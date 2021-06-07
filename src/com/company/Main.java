/*
 *  UCF COP3330 Summer 2021 Assignment 1 Solution
 *  Copyright 2021 Jeremy Bouhadana
 */
package com.company;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner jb = new Scanner(System.in);

        System.out.print("What is the principal amount? ");
        double principal = jb.nextDouble();

        System.out.print("What is the rate? ");
        double rate = jb.nextDouble();

        System.out.print("What is the number of years? ");
        int years = jb.nextInt();

        System.out.print("What is the number of times the interest is compounded per year? ");
        int j = jb.nextInt();

        double interestRateDec = rate / 100;
        double Final = principal * Math.pow((1 + interestRateDec / j), j*years);


        System.out.printf("$%.2f invested at %.2f%% for %d years compounded %d times per year is $%.2f",
                principal, rate, years, j, Final);
    }
}
