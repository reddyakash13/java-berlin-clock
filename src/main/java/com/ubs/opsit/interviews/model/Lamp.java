package com.ubs.opsit.interviews.model;

public class Lamp {

    private boolean on;
    private Color color;

    public Lamp(Color color) {
        this.color = color;
    }

    public void turnOn() {
        this.on = true;
    }

    public void turnOff() {
        this.on = false;
    }

    @Override
    public String toString() {
        if (this.isOn()) {
            return color.toString();
        } else {
            return "O";
        }
    }

    public boolean isOn() {
        return on;
    }

    public void setOn(boolean on) {
        this.on = on;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }
}
