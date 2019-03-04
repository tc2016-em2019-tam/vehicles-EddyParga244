package com.eddyparga;

public class PoliceCar extends Vehicle implements Emergency, LandVehicle {
    private int numWheels;

    public PoliceCar(String name, int maxPassangers, double maxSpeed, int numWheels) {
        super(name, maxPassangers, maxSpeed);
        this.numWheels = numWheels;
    }

    public PoliceCar(String name, int numWheels) {
        super(name);
        this.numWheels = numWheels;
    }

    @Override
    public void soundSiren() {
        System.out.println("Weee wooo, weee woooo");
    }

    @Override
    public int getNumWheels() {
        return numWheels;
    }

    @Override
    public void setNumWheels(int numWheels) {
        this.numWheels = numWheels;
    }

    @Override
    public void drive() {
        System.out.println("Calling drive() method!");
    }

    public void patrol(){
        System.out.println("Calling patrol() method!");
    }
}
