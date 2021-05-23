package com.desafioacc.page;

//import org.junit.Assert;
import com.desafioacc.data.ProductDataFactory;
import com.desafioacc.model.Product;
import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ProductPage extends BasePage{

    public ProductPage(WebDriver driver, WebDriverWait wait) {
        super(driver, wait);
        PageFactory.initElements(driver, this);
    }

    Product productInformation = new ProductDataFactory().createProductData();

    @FindBy(css = "#startdate")
    private WebElement startdate;

    @FindBy(css = "#nextselectpriceoption")
    private WebElement nextselectpriceoption;

    @FindBy(xpath = "//a[@id='enterproductdata']/span")
    private WebElement countFieldsInvalid;

    public void fillStarDate(String startdate) {
        this.startdate.sendKeys(startdate);
    }

    public void selectInsuranceSum (String insuranceSum) {
        driver.findElement(By.xpath("//select[@id='insurancesum']/option[@value='"+insuranceSum+"']")).click();
    }

    public void selectMeritRating (String meritRating) {
        driver.findElement(By.xpath("//select[@id='meritrating']/option[@value='"+meritRating+"']")).click();
    }

    public void selectDamageInsurance (String coverage) {
        driver.findElement(By.xpath("//select[@id='damageinsurance']/option[@value='"+coverage+"']")).click();
    }

    public void selectOprionalProduct (String optional) {
        driver.findElement(By.xpath("//label[text()='"+optional+"']")).click();
    }

    public void selectCourtesy (String courtesy) {
        driver.findElement(By.xpath("//select[@id='courtesycar']/option[@value='"+courtesy+"']")).click();
    }

    public void clickNextStage(){
        this.nextselectpriceoption.click();
    }

    public void validateCompletedForm() {
        String count = this.countFieldsInvalid.getText();
        Assertions.assertEquals("0", count, "There is an invalid or unfilled field");
    }

    public void fillDataProduct(String veichleType) {

        switch (veichleType) {
            case "automobile":
                fillDataProductAuto();
                break;
            default:
                fillDataProductOthers();
                break;
        }
    }

    public void fillDataProductAuto() {
        fillStarDate(productInformation.getStartDate());
        selectInsuranceSum(productInformation.getInsuranceSum());
        selectMeritRating(productInformation.getMeritRating());
        selectDamageInsurance(productInformation.getDamageInsurance());
        selectOprionalProduct(productInformation.getOptionalProduct());
        selectCourtesy(productInformation.getCourtesyCar());
    }

    public void fillDataProductOthers() {
        fillStarDate(productInformation.getStartDate());
        selectInsuranceSum(productInformation.getInsuranceSum());
        selectDamageInsurance(productInformation.getDamageInsurance());
        selectOprionalProduct(productInformation.getOptionalProduct());
    }
}
