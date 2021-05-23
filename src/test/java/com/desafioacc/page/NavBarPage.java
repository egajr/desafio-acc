package com.desafioacc.page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

public class NavBarPage extends BasePage{

    public NavBarPage(WebDriver driver, WebDriverWait wait) {
        super(driver, wait);
        PageFactory.initElements(driver, this);
    }

    public void selectVeichle(String veichle) {
        driver.findElement(By.cssSelector("#nav_" + veichle)).click();
    }

}
