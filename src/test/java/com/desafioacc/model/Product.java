package com.desafioacc.model;

public class Product {

    private String startDate;
    private String insuranceSum;
    private String meritRating;
    private String damageInsurance;
    private String optionalProduct;
    private String courtesyCar;

    public Product(String startDate, String insuranceSum, String meritRating, String damageInsurance, String optionalProduct, String courtesyCar) {
        this.startDate = startDate;
        this.insuranceSum = insuranceSum;
        this.meritRating = meritRating;
        this.damageInsurance = damageInsurance;
        this.optionalProduct = optionalProduct;
        this.courtesyCar = courtesyCar;
    }

    public Product() {
    }

    public String getStartDate() {
        return startDate;
    }

    public void setStartDate(String startDate) {
        this.startDate = startDate;
    }

    public String getInsuranceSum() {
        return insuranceSum;
    }

    public void setInsuranceSum(String insuranceSum) {
        this.insuranceSum = insuranceSum;
    }

    public String getMeritRating() {
        return meritRating;
    }

    public void setMeritRating(String meritRating) {
        this.meritRating = meritRating;
    }

    public String getDamageInsurance() {
        return damageInsurance;
    }

    public void setDamageInsurance(String damageInsurance) {
        this.damageInsurance = damageInsurance;
    }

    public String getOptionalProduct() {
        return optionalProduct;
    }

    public void setOptionalProduct(String optionalProduct) {
        this.optionalProduct = optionalProduct;
    }

    public String getCourtesyCar() {
        return courtesyCar;
    }

    public void setCourtesyCar(String courtesyCar) {
        this.courtesyCar = courtesyCar;
    }
}
