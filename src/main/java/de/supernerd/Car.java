package de.supernerd;

public class Car {
    private String brand;
    private String model;
    private String color;
    private int yearOfManufacture;
    private int numberOfDoors;
    private String engine;
    private boolean caprio;
    private int speed;

    public void startEngine() {
        System.out.println("Motor wurde gestartet!");
    }

    public void accelerates(int value) {
        this.speed = value;
        System.out.println(String.format("Auto fährt mit %s km/h", this.speed));
    }
}
