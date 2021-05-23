package com.desafioacc.step;

import com.desafioacc.data.SendQuoteFactory;
import com.desafioacc.driver.DriverManager;
import com.desafioacc.page.*;
import io.cucumber.java.pt.Dado;
import io.cucumber.java.pt.Então;
import io.cucumber.java.pt.Quando;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class SendQuote {

    private WebDriver driver = DriverManager.getDriver();
    private WebDriverWait wait;

    @Dado("que acesse o site para cotação de seguro de um {string}")
    public void que_acesse_o_site_para_cotacao_de_seguro_de_um_veiculo(String veichleType) {
        NavBarPage nav = new NavBarPage(driver, wait);
        nav.selectVeichle(veichleType);
    }

    @Quando("preencho os dados do {string}")
    public void preencho_os_dados_do_veiculo(String veichleType) {
        VeichlePage veichle = new VeichlePage(driver, wait);
        veichle.fillDataVeichle(veichleType);
        veichle.validateCompletedForm();
        veichle.clickNextStage();
    }

    @Quando("preencho os dados do segurado")
    public void preencho_os_dados_do_segurado() {
        InsurantPage insurant = new InsurantPage(driver, wait);
        insurant.fillDataInsurant();
        insurant.validateCompletedForm();
        insurant.clickNextStage();
    }

    @Quando("preencho os dados do seguro para o {string}")
    public void preencho_os_dados_do_seguro_para_o_veiculo(String veichleType) {
        ProductPage product = new ProductPage(driver, wait);
        product.fillDataProduct(veichleType);
        product.validateCompletedForm();
        product.clickNextStage();
    }

    @Quando("seleciono o tipo de seguro")
    public void seleciono_o_tipo_de_seguro() {
        PriceOptionPage price = new PriceOptionPage(driver, wait);
        price.selectPriceOption();
        price.validateCompletedForm();
        price.clickNextStage();

    }

    @Quando("preencho os dados de envio da cotação")
    public void preencho_os_dados_de_envio_da_cotacao() {
        com.desafioacc.model.SendQuote sendInformation = new SendQuoteFactory().createSendQuoteData();
        SendQuotePage send = new SendQuotePage(driver, wait);
        send.fillEmail(sendInformation.getEmail());
        send.fillPhone(sendInformation.getPhone());
        send.fillUser(sendInformation.getUser());
        send.fillPassword(sendInformation.getPass());
        send.fillPasswordConfirm(sendInformation.getPass());
        send.fillComments(sendInformation.getComments());
        send.validateCompletedForm();

    }

    @Quando("clico no botão de enviar")
    public void clico_no_botao_de_enviar() {
        SendQuotePage send = new SendQuotePage(driver, wait);
        send.clickSendEmail();
    }

    @Então("recebo a mensagem “Sending e-mail success!”")
    public void recebo_a_mensagem_sending_e_mail_success()  throws InterruptedException{
        SendQuotePage send = new SendQuotePage(driver, wait);
        send.validateSendEmail();
    }
}
