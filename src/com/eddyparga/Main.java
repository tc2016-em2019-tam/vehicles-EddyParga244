package com.eddyparga;

import java.util.LinkedList;

public class Main {

    public static void main(String[] args) {
        Vehicle[] myArray = new Vehicle[5];

        myArray[0] = new Jeep("Fred's Jeep",4);
        myArray[1] = new Jeep("Frank's Jeep",4);
        myArray[2] = new Hovercraft("Sue's Hover-craft",8,0.0);
        myArray[3] = new Frigate("Money Waster",0.0);
        myArray[4] = new PoliceCar("Thief Chaser", 4);

        for (int i=0; i<myArray.length; i++) {

            System.out.println(myArray[i].getName());

            if (myArray[i] instanceof Emergency) {
                Emergency em = (Emergency) myArray[i];
                em.soundSiren();
            }
            if (myArray[i] instanceof LandVehicle) {
                LandVehicle lv = (LandVehicle)myArray[i];
                lv.drive();
            } else if (myArray[i] instanceof SeaVessel) {
                SeaVessel vessel = (SeaVessel) myArray[i];
                vessel.launch();
            }
        }

        System.out.println("");
        System.out.println("-----List method-----");
        System.out.println("");

        LinkedList<Vehicle> MyVehicles = new LinkedList<Vehicle>();

        MyVehicles.add(new Jeep("Fred's Jeep",4));
        MyVehicles.add(new Jeep("Frank's Jeep",4));
        MyVehicles.add(new Hovercraft("Sue's Hover-craft",8,0.0));
        MyVehicles.add(new Frigate("Money Waster",0.0));
        MyVehicles.add(new PoliceCar("Thief Chaser", 4));

        for (int i=0; i<MyVehicles.size(); i++) {

            System.out.println(MyVehicles.get(i).getName());

            if (MyVehicles.get(i) instanceof Emergency) {
                Emergency em = (Emergency) MyVehicles.get(i);
                em.soundSiren();
            }
            if (MyVehicles.get(i) instanceof LandVehicle) {
                LandVehicle lv = (LandVehicle) MyVehicles.get(i);
                lv.drive();
            } else if (MyVehicles.get(i) instanceof SeaVessel) {
                SeaVessel vessel = (SeaVessel) MyVehicles.get(i);
                vessel.launch();
            }
        }
    }
}
