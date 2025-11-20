package org.example;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        int userInput = askInteger();
        runLoop(userInput);
    }

    public static int askInteger() {
        Scanner input = new Scanner(System.in);
        System.out.print("Please enter an integer: ");
        int userInput = input.nextInt();
        return userInput;
    }

    public static void runLoop(int n ) {
        for (int i = 1; i <= n; i++) {
            System.out.println("i = " + i);
        }
    }
}