package com.ubs.opsit.interviews.model;

public enum Color {

    RED("R"),
    YELLOW("Y");

    private String color;

    Color(String color) {
     this.color = color;
    }

    public String getColor() {
        return color;
    }

    @Override
    public String toString() {
        return color;
    }
}
