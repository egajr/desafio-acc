package com.desafioacc.model;

public class ProductBuilder {

    private String startDate;
    private String insuranceSum;
    private String meritRating;
    private String damageInsurance;
    private String optionalProduct;
    private String courtesyCar;

    public ProductBuilder startDate(String startDate) {
        this.startDate = startDate;
        return this;
    }

    public ProductBuilder insuranceSum(String insuranceSum) {
        this.insuranceSum = insuranceSum;
        return this;
    }

    public ProductBuilder meritRating(String meritRating) {
        this.meritRating = meritRating;
        return this;
    }

    public ProductBuilder damageInsurance(String damageInsurance) {
        this.damageInsurance = damageInsurance;
        return this;
    }

    public ProductBuilder optionalProduct(String optionalProduct) {
        this.optionalProduct = optionalProduct;
        return this;
    }

    public ProductBuilder courtesyCar(String courtesyCar) {
        this.courtesyCar = courtesyCar;
        return this;
    }

    public Product build() {
        return new Product(startDate, insuranceSum, meritRating, damageInsurance, optionalProduct, courtesyCar);
    }
}
