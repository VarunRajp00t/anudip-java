package com.basicJava;

import java.util.Scanner;

public class MaximumNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the first number: ");
        int num1 = sc.nextInt();

        System.out.print("Enter the second number: ");
        int num2 = sc.nextInt();

        // ternary operator
        int max = (num1 > num2) ? num1 : num2;

        System.out.println("The maximum number is: " + max);
    }
}
