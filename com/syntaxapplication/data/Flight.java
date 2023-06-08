package com.syntaxapplication.data;

public class Flight {
    private int duration;

    public Flight(int duration) {
        this.duration = duration;
    }

    public int getDuration() {
        return duration;
    }

    public void setDuration(int duration) {
        this.duration = duration;
    }

    @Override
    public String toString() {
        return "Flight{" +
                "duration=" + duration +
                '}';
    }
}
