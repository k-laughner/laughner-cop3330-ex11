/*
 *  UCF COP3330 Fall 2021 Assignment 1 Solution
 *  Copyright 2021 Kaylee Laughner
 */
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("How many euros are you exchanging?");
        Scanner input = new Scanner(System.in);
        float euros = input.nextFloat();

        System.out.println("What is the exchange rate?");
        Scanner input2 = new Scanner(System.in);
        float rate = input2.nextFloat();

        float conversion = euros*rate;

        System.out.printf("%.2f euros at an exchange rate of %f is %.2f U.S. Dollars", euros, rate, conversion);
    }
}