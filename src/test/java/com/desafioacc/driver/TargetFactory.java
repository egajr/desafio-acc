package com.desafioacc.driver;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.MutableCapabilities;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import java.net.URL;
import static com.desafioacc.driver.ConfigurationManager.configuration;

public class TargetFactory {

    public static final String USERNAME = configuration().user();
    public static final String AUTOMATE_KEY = configuration().key();
    public static final String URL = "https://" + USERNAME + ":" + AUTOMATE_KEY + "@hub-cloud.browserstack.com/wd/hub";

    private static final Logger logger = LogManager.getLogger(TargetFactory.class);

    public WebDriver createInstance(String browser) {
        Target target = Target.valueOf(configuration().target().toUpperCase());
        WebDriver webdriver = null;

        switch (target) {
            case LOCAL:
                webdriver = BrowserFactory.valueOf(browser.toUpperCase()).createDriver();
                break;
            case REMOTE:
                webdriver = createRemoteInstance(BrowserFactory.valueOf(browser.toUpperCase()).getOptions());
                break;
            default:
                logger.error(String.format("Target %s not valid", target));
        }
        return webdriver;
    }

    public RemoteWebDriver createRemoteInstance(MutableCapabilities capability) {

        DesiredCapabilities caps = new DesiredCapabilities();
        caps.setCapability("browser", capability.getBrowserName());
        caps.setCapability("browserstack.debug", "true");

        RemoteWebDriver remoteWebDriver = null;

        try {
            remoteWebDriver = new RemoteWebDriver(new URL(URL), caps);
        } catch (java.net.MalformedURLException e) {
            logger.error(String.format("Browser: %s", capability.getBrowserName()), e);
        } catch (IllegalArgumentException e) {
            logger.error(String.format("Browser %s is not valid or recognized", capability.getBrowserName()), e);
        }
        return remoteWebDriver;
    }
    enum Target {
        LOCAL, REMOTE
    }
}
