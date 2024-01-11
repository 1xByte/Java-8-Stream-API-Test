package org.example;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Player {

    private String name;
    private double battingAverage;
    private LocalDate dateOfBirth;

    public String name() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double battingAverage() {
        return battingAverage;
    }

    public void setBattingAverage(double battingAverage) {
        this.battingAverage = battingAverage;
    }

    public LocalDate dateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(LocalDate dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public Player(String name, double battingAverage, LocalDate dateOfBirth) {
        this.name = name;
        this.battingAverage = battingAverage;
        this.dateOfBirth = dateOfBirth;
    }

    @Override
    public String toString() {
        return "Player{" +
                "name='" + name + '\'' +
                ", battingAverage=" + battingAverage +
                ", dateOfBirth=" + dateOfBirth +
                '}';
    }
}
