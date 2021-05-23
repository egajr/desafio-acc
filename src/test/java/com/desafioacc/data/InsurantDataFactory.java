package com.desafioacc.data;

import com.desafioacc.model.Insurant;
import com.desafioacc.model.InsurantBuilder;
import com.github.javafaker.Faker;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.Locale;
import java.util.Random;

import static com.desafioacc.driver.ConfigurationManager.configuration;

public class InsurantDataFactory {

    private final Faker faker;
    private static final Logger logger = LogManager.getLogger(InsurantDataFactory.class);

    public InsurantDataFactory() {
        faker = new Faker(new Locale(configuration().faker()));
    }

    public Insurant createInsurantData() {
        Insurant insurant = new InsurantBuilder().
                fisrtName(faker.name().firstName()).
                lastName(faker.name().lastName()).
                dateBirth("10 / 10 / 1976").
                gender(returnRandomGender()).
                street(faker.address().streetAddress()).
                country(faker.address().country()).
                zipCode(faker.number().numberBetween(1000,99999999)).
                city(faker.address().city()).
                occupation(returnRandomOccupation()).
                hobbies(returnRandomHobbies()).
                website(faker.internet().url()).
                picture(faker.internet().image()).
                build();

        logger.info(insurant);
        return insurant;
    }

    private String returnRandomOccupation() {
        return returnRandomItemOnArray(new String[]{"Employee", "Public Official", "Farmer", "Unemployed", "Selfemployed"});
    }

    private String returnRandomHobbies() {
        return returnRandomItemOnArray(new String[]{
                " Speeding", " Bungee Jumping", " Cliff Diving", " Skydiving", " Other"});
    }

    private String returnRandomGender() {
        return returnRandomItemOnArray(new String[]{"Male", "Female"});
    }


    private String returnRandomItemOnArray(String[] array) {
        return array[(new Random().nextInt(array.length))];
    }
}
