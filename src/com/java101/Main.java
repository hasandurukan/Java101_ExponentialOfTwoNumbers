package com.java101;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int firstNumber, secondNumber, exponentialResult;
        Scanner input = new Scanner(System.in);

        System.out.print("Please type a base number :");
        firstNumber = input.nextInt();

        System.out.print("Please type a power number :");
        secondNumber = input.nextInt();
        exponentialResult = firstNumber;

        for (int i = 0; i < secondNumber; i++) {
            exponentialResult *= firstNumber;
        }

        System.out.print("Result is " + exponentialResult);
    }
}
