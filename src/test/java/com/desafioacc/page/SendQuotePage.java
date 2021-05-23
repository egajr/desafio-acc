package com.desafioacc.page;


import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

public class SendQuotePage extends BasePage{

    public SendQuotePage(WebDriver driver, WebDriverWait wait) {
        super(driver, wait);
        PageFactory.initElements(driver, this);
    }

    @FindBy(css = "#email")
    private WebElement email;

    @FindBy(css = "#phone")
    private WebElement phone;

    @FindBy(css = "#username")
    private WebElement username;

    @FindBy(css = "#password")
    private WebElement password;

    @FindBy(css = "#confirmpassword")
    private WebElement confirmpassword;

    @FindBy(css = "#Comments")
    private WebElement Comments;

    @FindBy(css = "#sendemail")
    private WebElement sendemail;

    @FindBy(css = "html body.stop-scrolling div.sweet-alert h2")
    private WebElement alert;

    @FindBy(xpath = "//a[@id='sendquote']/span")
    private WebElement countFieldsInvalid;

    public void fillEmail(String email) {
        this.email.sendKeys(email);
    }

    public void fillPhone (String phone) {
        this.phone.sendKeys(phone);
    }

    public void fillUser(String username) {
        this.username.sendKeys(username);
    }

    public void fillPassword(String password) {
        this.password.sendKeys(password);
    }

    public void fillPasswordConfirm(String confirmpassword) {
        this.confirmpassword.sendKeys(confirmpassword);
    }

    public void fillComments(String Comments) {
        this.Comments.sendKeys(Comments);
    }

    public void clickSendEmail(){
        this.sendemail.click();
    }

    public void validateCompletedForm() {
        WaitUntilElementIsVisible(5, countFieldsInvalid);
        String count = this.countFieldsInvalid.getText();
        Assertions.assertEquals("0", count, "There is an invalid or unfilled field");
    }

    public void validateSendEmail() throws InterruptedException {
        WaitUntilElementIsPresent(10, By.cssSelector("html body.stop-scrolling div.sweet-alert"));
        String msg = alert.getText();
        Assertions.assertEquals("Sending e-mail success!", msg);
        driver.findElement(By.className("confirm")).click();
    }

}
