package io.cucumber.testeSelenium.steps;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;

import io.cucumber.java.pt.*;
import io.cucumber.testeSelenium.pages.InsurantDataPage;

public class InsurantDataStep extends InsurantDataPage {

    @Dado("preencho o campo name")
    public void preencho_o_campo_name() {
        WebElement campoNome = getFirstNameElement();
        espera.until(ExpectedConditions.elementToBeClickable(campoNome));
        campoNome.sendKeys("Usuario");
    }

    @Dado("preencho o campo last name")
    public void preencho_o_campo_last_name() {
        WebElement lastName = browser.findElement(By.id("lastname"));
        lastName.sendKeys("Sobrenome");
    }

    @Dado("preencho o campo date of birth")
    public void preencho_o_campo_date_of_birth() {
        WebElement dateOfBirth = browser.findElement(By.id("birthdate"));
        dateOfBirth.sendKeys("02/02/1990");
    }

    @Dado("preencho o campo gender")
    public void preencho_o_campo_gender() {
        WebElement opcaoMale = getGenderSelect();
        acoes.moveToElement(opcaoMale).click().perform();
    }

    @Dado("preencho o campo street address")
    public void preencho_o_campo_street_address() {
        getStreetAddressElement().sendKeys("Avenida Paulista, 220");
    }

    @Dado("preencho o campo country")
    public void preencho_o_campo_country() {
        getCountrySelect().selectByIndex(31);
    }

    @Dado("preencho o campo zip code")
    public void preencho_o_campo_zip_code() {
        getZipCodeElement().sendKeys("01310100");
    }

    @Dado("preencho o campo city")
    public void preencho_o_campo_city() {
        getCityElement().sendKeys("São Paulo");
    }

    @Dado("preencho o campo occupation")
    public void preencho_o_campo_occupation() {
        getOccupationSelect().selectByIndex(1);
    }

    @Dado("preencho o campo hobbies")
    public void preencho_o_campo_hobbies() {
        WebElement hobbiesCheckbox = getHobbiesElement();
        acoes.moveToElement(hobbiesCheckbox).click().perform();
    }

    @Dado("preencho o campo website")
    public void preencho_o_campo_website() {
        getWebsiteElement().sendKeys("http://www.capital.sp.gov.br");
    }

    @Entao("eu clico no botao next para ir para a aba Product Data")
    public void eu_clico_no_botao_next_para_ir_para_a_aba_product_data() {
        getNextElement().click();
    }
}