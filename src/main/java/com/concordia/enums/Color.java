package com.concordia.enums;

public enum Color {
    RED("\u001B[31m"), BLUE("\u001B[34m"), GREEN("\u001B[32m"), OTHERS("\u001B[33m");

    public static final String ANSI_RESET = "\u001B[0m";
    private final String code;

    Color(String code) {
        this.code = code;
    }

    public String applyColor(String text) {
        return this.code + text + ANSI_RESET;
    }
}
