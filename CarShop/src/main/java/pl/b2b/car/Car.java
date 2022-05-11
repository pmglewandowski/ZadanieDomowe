package pl.b2b.car;

public class Car {
    private String name;
    private int power;
    private int fuelCapacity;
    private double fuelUsage;
    private int topSpeed;

    public Car(String name, int power, int fuelCapacity, double fuelUsage, int topSpeed) {
        this.name = name;
        this.power = power;
        this.fuelCapacity = fuelCapacity;
        this.fuelUsage = fuelUsage;
        this.topSpeed = topSpeed;
    }

    public int getPower() {
        return power;
    }

    public int getFuelCapacity() {
        return fuelCapacity;
    }

    public double getFuelUsage() {
        return fuelUsage;
    }

    public String getName() {
        return name;
    }

    public int getTopSpeed() {
        return topSpeed;
    }
}
