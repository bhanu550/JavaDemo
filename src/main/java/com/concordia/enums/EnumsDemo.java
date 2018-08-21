package com.concordia.enums;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import static com.concordia.enums.Color.*;

public class EnumsDemo {
    //    public static final String ANSI_RESET = "\u001B[0m";
//    public static final String ANSI_BLACK = "\u001B[30m";
//    public static final String ANSI_RED = "\u001B[31m";
//    public static final String ANSI_GREEN = "\u001B[32m";
//    public static final String ANSI_YELLOW = "\u001B[33m";
//    public static final String ANSI_BLUE = "\u001B[34m";
//    public static final String ANSI_PURPLE = "\u001B[35m";
//    public static final String ANSI_CYAN = "\u001B[36m";
//    public static final String ANSI_WHITE = "\u001B[37m";
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        while (true) {
            printSelect();
            String input = br.readLine();
            if ("exit".equalsIgnoreCase(input)) break;
            display(Color.valueOf(input.toUpperCase()));
        }

    }

    private static void printSelect() {
        System.out.print("Choose color from ( ");
        for (Color color : Color.values()) {
            System.out.print(color + " ");
        }
        System.out.print("): ");
    }

    public static void display(Color color) {
        switch (color) {
            case RED:
                System.out.println(color.applyColor("Sun is Red"));
                break;

            case BLUE:
                System.out.println(color.applyColor("Sky is Blue"));
                break;

            case GREEN:
                System.out.println(color.applyColor("Grass is Green"));
                break;

            default:
                System.out.println(OTHERS.applyColor("All colors are Beautiful"));
        }
    }
}
