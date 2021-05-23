package com.desafioacc.data;

import com.github.javafaker.Faker;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import com.desafioacc.model.Veichle;
import com.desafioacc.model.VeichleBuilder;

import java.util.Locale;
import java.util.Random;

import static com.desafioacc.driver.ConfigurationManager.configuration;

public class VeichleDataFactory {

    private final Faker faker;
    private static final Logger logger = LogManager.getLogger(VeichleDataFactory.class);

    public VeichleDataFactory() {
        faker = new Faker(new Locale(configuration().faker()));
    }

    public Veichle createVeichleData() {
        Veichle veichle = new VeichleBuilder().
                make(returnRandomMake()).
                enginePerformance(faker.number().numberBetween(1,2000)).
                dateManufacture("12 / 05 / 2020").
                numberSeats(faker.number().numberBetween(1,9)).
                numberSeatsMotorcycle(faker.number().numberBetween(1,3)).
                fuel(returnRandomFuel()).
                listPrice(faker.number().numberBetween(500,100000)).
                licensePlate("HMO" + faker.number().digits(4)).
                annualMileage(faker.number().numberBetween(100,100000)).
                model(returnRandomModel()).
                payload(faker.number().numberBetween(1,1000)).
                totalWeight(faker.number().numberBetween(100,50000)).
                cylinder(faker.number().numberBetween(1,2000)).
                build();

        logger.info(veichle);
        return veichle;
    }

    private String returnRandomFuel() {
        return returnRandomItemOnArray(new String[]{"Petrol", "Diesel", "Eletric Power", "Gas", "Other"});
    }

    private String returnRandomMake() {
        return returnRandomItemOnArray(new String[]{
                "BMW", "Volkswagen", "Renault", "Skoda","Audi","Mercedes Benz","Opel","Porsche","Honda","Nissan",
                "Suzuki","Toyota","Mazda","Volvo","Ford"});
    }

    private String returnRandomModel() {
        return returnRandomItemOnArray(new String[]{"Scooter", "Three-Wheeler", "Moped", "Motorcycle"});
    }

    private String returnRandomItemOnArray(String[] array) {
        return array[(new Random().nextInt(array.length))];
    }
}
