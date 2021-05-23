package com.desafioacc.step;


import com.desafioacc.driver.DriverManager;
import com.desafioacc.driver.TargetFactory;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import static com.desafioacc.driver.ConfigurationManager.configuration;

public class BaseStep {

    @Before
    public static void setUp() {
        String browser = configuration().browser();
        WebDriver driver = new TargetFactory().createInstance(browser);
        DriverManager.setDriver(driver);
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(configuration().timeout()));
        DriverManager.getDriver().get(configuration().url());
    }

    @After
    public static void quit(Scenario scenario){
        if (scenario.isFailed()) {
            File file = ((TakesScreenshot) DriverManager.getDriver()).getScreenshotAs(OutputType.FILE);
            try {
                FileUtils.copyFile(file, new File("target/screenshot/" + scenario.getName() + ".png"));
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        DriverManager.quit();
    }
}
