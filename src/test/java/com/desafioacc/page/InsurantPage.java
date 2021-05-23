package com.desafioacc.page;

//import org.junit.Assert;
import com.desafioacc.data.InsurantDataFactory;
import com.desafioacc.model.Insurant;
import io.cucumber.java.eo.Se;
import io.cucumber.java.it.Date;
import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class InsurantPage extends BasePage{

    public InsurantPage(WebDriver driver, WebDriverWait wait) {
        super(driver, wait);
        PageFactory.initElements(driver, this);
    }

    Insurant insurantInformation = new InsurantDataFactory().createInsurantData();

    @FindBy(css = "#firstname")
    private WebElement firstname;

    @FindBy(css = "#lastname")
    private WebElement lastname;

    @FindBy(css = "#birthdate")
    private WebElement birthdate;

    @FindBy(css = "#streetaddress")
    private WebElement streetaddress;

    @FindBy(css = "#country")
    private WebElement country;

    @FindBy(css = "#zipcode")
    private WebElement zipcode;

    @FindBy(css = "#city")
    private WebElement city;

    @FindBy(css = "#occupation")
    private WebElement occupation;

    @FindBy(css = "#hobbies")
    private WebElement cylinder;

    @FindBy(css = "#website")
    private WebElement website;

    @FindBy(css = "#picture")
    private WebElement picture;

    @FindBy(css = "#nextenterproductdata")
    private WebElement nextenterproductdata;

    @FindBy(xpath = "//a[@id='enterinsurantdata']/span")
    private WebElement countFieldsInvalid;

    public void fillFisrtName(String firstname) {
        this.firstname.sendKeys(firstname);
    }

    public void fillLastName(String lastname) {
        this.lastname.sendKeys(lastname);
    }

    public void fillDateBirth(String birthdate) {
        this.birthdate.sendKeys((CharSequence) birthdate);
    }

    public void selectGender (String gender) {
        driver.findElement(By.xpath("//label[text()='"+gender+"']")).click();
    }

    public void fillStreetAddress(String streetaddress) {
        this.streetaddress.sendKeys(streetaddress);
    }

    public void fillCountry(String country) {
        this.country.sendKeys(country);
    }

    public void fillZipCode(Integer zipcode) {
        this.zipcode.sendKeys(String.valueOf(zipcode));
    }

    public void fillCity(String city) {
        this.city.sendKeys(city);
    }

    public void selectOccupation(String occupation) {
        this.occupation.sendKeys(occupation);
    }

    public void selectHobbie (String hobbie) {
        driver.findElement(By.xpath("//label[text()='"+hobbie+"']")).click();
    }

    public void fillWebsite(String website) {
        this.website.sendKeys(website);
    }

    public void fillPicture(String picture) {
        this.picture.sendKeys(picture);
    }

    public void clickNextStage(){
        this.nextenterproductdata.click();
    }

    public void validateCompletedForm() {
        String count = this.countFieldsInvalid.getText();
        Assertions.assertEquals("0", count, "There is an invalid or unfilled field");
    }

    public void fillSelectedVeichle (){
            fillDataInsurant();
    }

    public void fillDataInsurant(){
        fillFisrtName(insurantInformation.getFisrtName());
        fillLastName(insurantInformation.getLastName());
        fillDateBirth(insurantInformation.getDateBirth());
        selectGender(insurantInformation.getGender());
        fillStreetAddress(insurantInformation.getStreet());
        fillCountry(insurantInformation.getCountry());
        fillZipCode(insurantInformation.getZipCode());
        fillCity(insurantInformation.getCity());
        selectOccupation(insurantInformation.getOccupation());
        selectHobbie(insurantInformation.getHobbies());
        fillWebsite(insurantInformation.getWebsite());
    }
}
