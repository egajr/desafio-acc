package com.desafioacc.data;


import com.desafioacc.model.SendQuote;
import com.desafioacc.model.SendQuoteBuilder;
import com.github.javafaker.Faker;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.Locale;
import java.util.Random;

import static com.desafioacc.driver.ConfigurationManager.configuration;

public class SendQuoteFactory {

    private final Faker faker;
    private static final Logger logger = LogManager.getLogger(SendQuoteFactory.class);

    public SendQuoteFactory() {
        faker = new Faker(new Locale(configuration().faker()));
    }

    public SendQuote createSendQuoteData() {
        SendQuote sendQuote = new SendQuoteBuilder().
                email(faker.internet().emailAddress()).
                phone("3132344355").
                user("egajr").
                pass("A1b2c3d4e5f").
                comments("Desafio Acc").
                build();

        logger.info(sendQuote);
        return sendQuote;
    }

    private String returnRandomItemOnArray(String[] array) {
        return array[(new Random().nextInt(array.length))];
    }
}
