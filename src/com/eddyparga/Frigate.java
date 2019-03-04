package com.eddyparga;

public class Frigate extends Vehicle implements SeaVessel {
    private double displacement;

    public Frigate(String name, int maxPassangers, double maxSpeed, double displacement) {
        super(name, maxPassangers, maxSpeed);
        this.displacement = displacement;
    }

    public Frigate(String name, double displacement) {
        super(name);
        this.displacement = displacement;
    }

    @Override
    public double getDisplacement() {
        return displacement;
    }

    @Override
    public void setDisplacement(double displacement) {
        this.displacement = displacement;
    }

    @Override
    public void launch() {
        System.out.println("Calling launch() method!");
    }

    public void fireGun(){
        System.out.println("Fum, fum, fum!");
    }
}
