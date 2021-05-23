package com.desafioacc.page;

//import org.junit.Assert;
import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

public class PriceOptionPage extends BasePage{

    public PriceOptionPage(WebDriver driver, WebDriverWait wait) {
        super(driver, wait);
        PageFactory.initElements(driver, this);
    }

    @FindBy(css = "#selectplatinum")
    private WebElement selectplatinum;

    @FindBy(css = "#nextsendquote")
    private WebElement nextsendquote;

    @FindBy(xpath = "//a[@id='selectpriceoption']/span")
    private WebElement countFieldsInvalid;

    public void selectPriceOption () {
        clickJS(selectplatinum);
    }

    public void clickNextStage(){
        WaitUntilElementIsVisible(10, nextsendquote);
        this.nextsendquote.click();
    }

    public void validateCompletedForm() {
        WaitUntilElementIsVisible(5,countFieldsInvalid);
        String count = this.countFieldsInvalid.getText();
        Assertions.assertEquals("0", count, "There is an invalid or unfilled field");
    }

}
