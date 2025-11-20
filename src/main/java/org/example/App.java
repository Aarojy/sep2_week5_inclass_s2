package org.example;

import java.util.Scanner;
import java.util.logging.Logger;

public class App {
    final public static Logger log = Logger.getLogger(App.class.getName());

    public static void main(String[] args) {
        final int userInput = askInteger();
        runLoop(userInput);
    }

    public static int askInteger() {
        final Scanner input = new Scanner(System.in);
        App.log.info("Please enter an integer:");
        int userInput = input.nextInt();
        return userInput;
    }

    public static int runLoop(int n) {
        for (int i = 1; i <= n; i++) {
            App.log.info("i = " + i);
        }
        return n;
    }
}