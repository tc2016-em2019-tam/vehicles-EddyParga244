package com.eddyparga;

public class Vehicle {
    private String name;
    private int maxPassangers;
    private double maxSpeed;

    public Vehicle(String name, int maxPassangers, double maxSpeed) {
        this.name = name;
        this.maxPassangers = maxPassangers;
        this.maxSpeed = maxSpeed;
    }

    public Vehicle(String name){
        this.name = name;
        this.maxPassangers = 0;
        this.maxSpeed = 0;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getMaxPassangers() {
        return maxPassangers;
    }

    public void setMaxPassangers(int maxPassangers) {
        this.maxPassangers = maxPassangers;
    }

    public double getMaxSpeed() {
        return maxSpeed;
    }

    public void setMaxSpeed(double maxSpeed) {
        this.maxSpeed = maxSpeed;
    }
}
