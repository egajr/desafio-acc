package com.desafioacc.model;

public class VeichleBuilder {

    private String make;
    private int enginePerformance;
    private String dateManufacture;
    private int numberSeats;
    private int numberSeatsMotorcycle;
    private String fuel;
    private int listPrice;
    private String licensePlate;
    private int annualMileage;
    private String model;
    private int cylinder;
    private int payload;
    private int totalWeight;

    public VeichleBuilder make(String make) {
        this.make = make;
        return this;
    }
    public VeichleBuilder enginePerformance(int enginePerformance) {
        this.enginePerformance = enginePerformance;
        return this;
    }
    public VeichleBuilder dateManufacture(String dateManufacture) {
        this.dateManufacture = dateManufacture;
        return this;
    }
    public VeichleBuilder numberSeats(int numberSeats) {
        this.numberSeats = numberSeats;
        return this;
    }

    public VeichleBuilder numberSeatsMotorcycle(int numberSeatsMotorcycle) {
        this.numberSeatsMotorcycle = numberSeatsMotorcycle;
        return this;
    }

    public VeichleBuilder fuel(String fuel) {
        this.fuel = fuel;
        return this;
    }
    public VeichleBuilder listPrice(int listPrice) {
        this.listPrice = listPrice;
        return this;
    }
    public VeichleBuilder licensePlate(String licensePlate) {
        this.licensePlate = licensePlate;
        return this;
    }
    public VeichleBuilder annualMileage(int annualMileage) {
        this.annualMileage = annualMileage;
        return this;
    }

    public VeichleBuilder model(String model) {
        this.model = model;
        return this;
    }

    public VeichleBuilder totalWeight(int totalWeight) {
        this.totalWeight = totalWeight;
        return this;
    }

    public VeichleBuilder payload(int payload) {
        this.payload = payload;
        return this;
    }

    public VeichleBuilder cylinder(int cylinder) {
        this.cylinder = cylinder;
        return this;
    }

    public Veichle build() {
        return new Veichle(make, enginePerformance, dateManufacture, numberSeats, numberSeatsMotorcycle, fuel, listPrice, licensePlate,
                            annualMileage, model, cylinder, totalWeight, payload);
    }
}
