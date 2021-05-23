package com.desafioacc.model;

public class Veichle {

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
    private int payload;
    private int totalWeight;
    private int cylinder;


    public Veichle(String make, int enginePerformance, String dateManufacture, int numberSeats, int numberSeatsMotorcycle,
                   String fuel, int listPrice, String licensePlate, int annualMileage, String model,
                   int payload, int totalWeight, int cylinder) {
        this.make = make;
        this.enginePerformance = enginePerformance;
        this.dateManufacture = dateManufacture;
        this.numberSeats = numberSeats;
        this.numberSeatsMotorcycle = numberSeatsMotorcycle;
        this.fuel = fuel;
        this.listPrice = listPrice;
        this.licensePlate = licensePlate;
        this.annualMileage = annualMileage;
        this.model = model;
        this.payload = payload;
        this.cylinder = cylinder;
        this.totalWeight = totalWeight;
    }

    public Veichle() {

    }

    public String getMake() {
        return this.make;
    }

    public void setMake(String make) {
        this.make = make;
    }

    public int getEnginePerformance() {
        return this.enginePerformance;
    }

    public void setEnginePerformance(int enginePerformance) {
        this.enginePerformance = enginePerformance;
    }

    public String getDateManufacture() {
        return this.dateManufacture;
    }

    public void setDateManufacture(String dateManufacture) {
        this.dateManufacture = dateManufacture;
    }

    public int getNumberSeats() {
        return this.numberSeats;
    }

    public void setNumberSeats(int numberSeats) {
        this.numberSeats = numberSeats;
    }

    public int getNumberSeatsMotorcycle() {
        return this.numberSeatsMotorcycle;
    }

    public void setNumberSeatsMotorcycle(int numberSeatsMotorcycle) {
        this.numberSeatsMotorcycle = numberSeatsMotorcycle;
    }

    public String getFuel() {
        return this.fuel;
    }

    public void setFuel(String fuel) {
        this.fuel = fuel;
    }

    public int getListPrice() {
        return this.listPrice;
    }

    public void setListPrice(int listPrice) {
        this.listPrice = listPrice;
    }

    public String getLicensePlate() {
        return this.licensePlate;
    }

    public void setLicensePlate(String licensePlate) {
        this.licensePlate = licensePlate;
    }

    public int getAnnualMileage() {
        return this.annualMileage;
    }

    public void setAnnualMileage(int annualMileage) {
        this.annualMileage = annualMileage;
    }

    public String getModel() {
        return this.model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getPayload() {
        return this.payload;
    }

    public void setPayload(int payload) {
        this.payload = payload;
    }

    public int getTotalWeight() {
        return this.totalWeight;
    }

    public void setTotalWeight(int totalWeight) {
        this.totalWeight = totalWeight;
    }

    public int getCylinder() {
        return this.cylinder;
    }

    public void setCylinder(int cylinder) {
        this.cylinder = cylinder;
    }
}
