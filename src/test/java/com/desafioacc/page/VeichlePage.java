package com.desafioacc.page;

//import org.junit.Assert;
import com.desafioacc.data.VeichleDataFactory;
import com.desafioacc.model.Veichle;
import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

public class VeichlePage extends BasePage{

    public VeichlePage(WebDriver driver, WebDriverWait wait) {
        super(driver, wait);
        PageFactory.initElements(driver, this);
    }

    Veichle veichleInformation = new VeichleDataFactory().createVeichleData();

    @FindBy(css = "#make")
    private WebElement make;

    @FindBy(css = "#engineperformance")
    private WebElement engineperformance;

    @FindBy(css = "#dateofmanufacture")
    private WebElement dateofmanufacture;

    @FindBy(css = "#numberofseats")
    private WebElement numberofseats;

    @FindBy(css = "#numberofseatsmotorcycle")
    private WebElement numberofseatsmotorcycle;

    @FindBy(css = "#fuel")
    private WebElement fuel;

    @FindBy(css = "#listprice")
    private WebElement listprice;

    @FindBy(css = "#licenseplatenumber")
    private WebElement licenseplatenumber;

    @FindBy(css = "#annualmileage")
    private WebElement annualmileage;

    @FindBy(css = "#nextenterinsurantdata")
    private WebElement nextenterinsurantdata;

    @FindBy(css = "#cylindercapacity")
    private WebElement cylinder;

    @FindBy(css = "#model")
    private WebElement model;

    @FindBy(css = "#payload")
    private WebElement payload;

    @FindBy(css = "#totalweight")
    private WebElement totalweight;

    @FindBy(xpath = "//a[@id='entervehicledata']/span")
    private WebElement countFieldsInvalid;

    public void selectMake(String make) {
        this.make.sendKeys(make);
    }

    public void fillEnginePerformance(Integer engineperformance) {
        this.engineperformance.sendKeys(String.valueOf(engineperformance));
    }

    public void fillDateManufacture(String dateofmanufacture) {
        this.dateofmanufacture.sendKeys(dateofmanufacture);
    }

    public void selectNumberSeats(Integer numberofseats) {
        this.numberofseats.sendKeys(String.valueOf(numberofseats));
    }

    public void selectNumberSeatsMotorcycle(Integer numberofseatsmotorcycle) {
        this.numberofseatsmotorcycle.sendKeys(String.valueOf(numberofseatsmotorcycle));
    }

    public void selectFuel(String fuel) {
        this.fuel.sendKeys(fuel);
    }

    public void fillListPrice(Integer listprice) {
        this.listprice.sendKeys(String.valueOf(listprice));
    }

    public void fillLicensePlateNumber(String licenseplatenumber) {
        this.licenseplatenumber.sendKeys(licenseplatenumber);
    }

    public void fillAnnualMileage(Integer annualmileage) {
        this.annualmileage.sendKeys(String.valueOf(annualmileage));
    }

    public void selectModel(String model) {
        this.model.sendKeys(model);
    }

    public void fillPayload(Integer payload) {
        this.payload.sendKeys(String.valueOf(payload));
    }

    public void fillCylinder(Integer cylinder) {
        this.cylinder.sendKeys(String.valueOf(cylinder));
    }

    public void fillTotalWeight(Integer totalweight) {
        this.totalweight.sendKeys(String.valueOf(totalweight));
    }

    public void clickNextStage(){
        this.nextenterinsurantdata.click();
    }

    public void validateCompletedForm() {
        String count = this.countFieldsInvalid.getText();
        Assertions.assertEquals("0", count, "There is an invalid or unfilled field");
    }

    public void fillDataVeichle (String veichleType){

        switch (veichleType){
            case "automobile":
                fillDataAutomobile();
                break;
            case "truck":
                fillDataTruck();
                break;
            case "motorcycle":
                fillDataMotorcycle();
                break;
            case "camper":
                fillDataCamper();
                break;
        }
    }

    public void fillDataAutomobile(){
        selectMake(veichleInformation.getMake());
        fillEnginePerformance(veichleInformation.getEnginePerformance());
        fillDateManufacture(veichleInformation.getDateManufacture());
        selectNumberSeats(veichleInformation.getNumberSeats());
        selectFuel(veichleInformation.getFuel());
        fillListPrice(veichleInformation.getListPrice());
        fillLicensePlateNumber(veichleInformation.getLicensePlate());
        fillAnnualMileage(veichleInformation.getAnnualMileage());
    }

    public void fillDataTruck(){
        selectMake(veichleInformation.getMake());
        fillEnginePerformance(veichleInformation.getEnginePerformance());
        fillDateManufacture(veichleInformation.getDateManufacture());
        selectNumberSeats(veichleInformation.getNumberSeats());
        selectFuel(veichleInformation.getFuel());
        fillPayload(veichleInformation.getPayload());
        fillTotalWeight(veichleInformation.getTotalWeight());
        fillListPrice(veichleInformation.getListPrice());
        fillLicensePlateNumber(veichleInformation.getLicensePlate());
        fillAnnualMileage(veichleInformation.getAnnualMileage());
    }

    public void fillDataMotorcycle(){
        selectMake(veichleInformation.getMake());
        selectModel(veichleInformation.getModel());
        fillCylinder(veichleInformation.getCylinder());
        fillEnginePerformance(veichleInformation.getEnginePerformance());
        fillDateManufacture(veichleInformation.getDateManufacture());
        selectNumberSeatsMotorcycle(veichleInformation.getNumberSeatsMotorcycle());
        fillListPrice(veichleInformation.getListPrice());
        fillAnnualMileage(veichleInformation.getAnnualMileage());
    }

    public void fillDataCamper(){
        selectMake(veichleInformation.getMake());
        fillEnginePerformance(veichleInformation.getEnginePerformance());
        fillDateManufacture(veichleInformation.getDateManufacture());
        selectNumberSeats(veichleInformation.getNumberSeats());
        selectFuel(veichleInformation.getFuel());
        fillPayload(veichleInformation.getPayload());
        fillTotalWeight(veichleInformation.getTotalWeight());
        fillListPrice(veichleInformation.getListPrice());
        fillLicensePlateNumber(veichleInformation.getLicensePlate());
        fillAnnualMileage(veichleInformation.getAnnualMileage());
    }
}
