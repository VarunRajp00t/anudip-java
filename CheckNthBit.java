package com.basicJava;

import java.util.Scanner;

public class CheckNthBit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number: ");
        int num = sc.nextInt();

        System.out.print("Enter the bit position (n): ");
        int n = sc.nextInt();

        // Shift 1 to the nth position and perform bitwise AND with the number
        boolean isBitSet = (num & (1 << n)) != 0;

        // Output whether the nth bit is set or not
        if (isBitSet) {
            System.out.println("The " + n + "th bit is set (1).");
        } else {
            System.out.println("The " + n + "th bit is not set (0).");
        }
    }
}
