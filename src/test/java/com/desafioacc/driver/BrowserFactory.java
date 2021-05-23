package com.desafioacc.driver;

import io.github.bonigarcia.wdm.WebDriverManager;
import io.github.bonigarcia.wdm.config.DriverManagerType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.ie.InternetExplorerOptions;
import org.openqa.selenium.opera.OperaDriver;
import org.openqa.selenium.opera.OperaOptions;
import org.openqa.selenium.remote.AbstractDriverOptions;
import org.openqa.selenium.safari.SafariDriver;
import org.openqa.selenium.safari.SafariOptions;

import static com.desafioacc.driver.ConfigurationManager.configuration;
import static java.lang.Boolean.TRUE;

public enum BrowserFactory {

    CHROME {
        @Override
        public WebDriver createDriver() {
            WebDriverManager.getInstance(DriverManagerType.CHROME).setup();

            return new ChromeDriver(getOptions());
        }

        public ChromeOptions getOptions() {
            ChromeOptions chromeOptions = new ChromeOptions();
            chromeOptions.addArguments(START_MAXIMIZED);
            chromeOptions.addArguments("--disable-infobars");
            chromeOptions.addArguments("--disable-notifications");
            chromeOptions.setHeadless(configuration().headless());

            return chromeOptions;
        }
    }, FIREFOX {
        @Override
        public WebDriver createDriver() {
            WebDriverManager.getInstance(DriverManagerType.FIREFOX).setup();

            return new FirefoxDriver(getOptions());
        }

        public FirefoxOptions getOptions() {
            FirefoxOptions firefoxOptions = new FirefoxOptions();
            firefoxOptions.addArguments(START_MAXIMIZED);
            firefoxOptions.setHeadless(configuration().headless());

            return firefoxOptions;
        }
    }, EDGE {
        @Override
        public WebDriver createDriver() {
            WebDriverManager.getInstance(DriverManagerType.EDGE).setup();

            return new EdgeDriver(getOptions());
        }

        public EdgeOptions getOptions() {
            EdgeOptions edgeOptions = new EdgeOptions();
            edgeOptions.addArguments(START_MAXIMIZED);
            edgeOptions.setHeadless(configuration().headless());

            return edgeOptions;
        }
    }, SAFARI {
        @Override
        public WebDriver createDriver() {
            WebDriverManager.getInstance(DriverManagerType.SAFARI).setup();

            return new SafariDriver(getOptions());
        }

        public SafariOptions getOptions() {
            SafariOptions safariOptions = new SafariOptions();
            safariOptions.setAutomaticInspection(false);

            if (TRUE.equals(configuration().headless()))
                System.out.println("Headless not supported for browser");

            return safariOptions;
        }
    }, OPERA {
        @Override
        public WebDriver createDriver() {
            WebDriverManager.getInstance(DriverManagerType.OPERA).setup();

            return new OperaDriver(getOptions());
        }

        public OperaOptions getOptions() {
            OperaOptions operaOptions = new OperaOptions();
            operaOptions.addArguments(START_MAXIMIZED);
            operaOptions.addArguments("--disable-infobars");
            operaOptions.addArguments("--disable-notifications");

            if (TRUE.equals(configuration().headless()))
                System.out.println("Headless not supported for browser");

            return operaOptions;
        }
    }, IE {
        @Override
        public WebDriver createDriver() {
            WebDriverManager.getInstance(DriverManagerType.IEXPLORER).setup();

            return new InternetExplorerDriver(getOptions());
        }

        public InternetExplorerOptions getOptions() {
            InternetExplorerOptions internetExplorerOptions = new InternetExplorerOptions();
            internetExplorerOptions.ignoreZoomSettings();
            internetExplorerOptions.takeFullPageScreenshot();
            internetExplorerOptions.introduceFlakinessByIgnoringSecurityDomains();

            if (TRUE.equals(configuration().headless()))
                System.out.println("Headless not supported for browser");

            return internetExplorerOptions;
        }
    };

    private static final String START_MAXIMIZED = "[--start-maximized]";

    public abstract WebDriver createDriver();

    public abstract AbstractDriverOptions<?> getOptions();

}