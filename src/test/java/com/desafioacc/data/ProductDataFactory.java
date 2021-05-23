package com.desafioacc.data;


import com.desafioacc.model.Product;
import com.desafioacc.model.ProductBuilder;
import com.github.javafaker.Faker;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.Locale;
import java.util.Random;

import static com.desafioacc.driver.ConfigurationManager.configuration;

public class ProductDataFactory {

    private final Faker faker;
    private static final Logger logger = LogManager.getLogger(ProductDataFactory.class);

    public ProductDataFactory() {
        faker = new Faker(new Locale(configuration().faker()));
    }

    public Product createProductData() {
        Product product = new ProductBuilder().
                startDate("08 / 01 / 2021").
                insuranceSum(returnRandomInsuranceSum()).
                meritRating(returnRandomMeritRating()).
                damageInsurance(returnRandomCoverage()).
                optionalProduct(returnRandomOprional()).
                courtesyCar(returnRandomCourtesy()).
                build();

        logger.info(product);
        return product;
    }

    private String returnRandomInsuranceSum() {
        return returnRandomItemOnArray(new String[]{"3000000", "5000000", "7000000", "10000000", "15000000", "20000000",
                                            "25000000", "30000000", "35000000"});
    }

    private String returnRandomMeritRating() {
        int num1 = faker.number().numberBetween(1,9);
        int num2 = faker.number().numberBetween(10,17);
        return returnRandomItemOnArray(new String[]{"Super Bonus", "Bonus "+num1, "Malus "+num2});
    }

    private String returnRandomCoverage() {
        return returnRandomItemOnArray(new String[]{"No Coverage", "Partial Coverage", "Full Coverage"});
    }

    private String returnRandomOprional() {
        return returnRandomItemOnArray(new String[]{"Euro Protection", "Legal Defense Insurance"});
    }

    private String returnRandomCourtesy() {
        return returnRandomItemOnArray(new String[]{"Yes", "No"});
    }


    private String returnRandomItemOnArray(String[] array) {
        return array[(new Random().nextInt(array.length))];
    }
}
