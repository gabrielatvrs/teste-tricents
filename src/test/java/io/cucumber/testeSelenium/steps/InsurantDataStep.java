package io.cucumber.testeSelenium.steps;

import static org.junit.Assert.assertTrue;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import io.cucumber.java.pt.*;
import io.cucumber.testeSelenium.pages.InsurantDataPage;

public class InsurantDataStep extends InsurantDataPage {

    @Dado("estou na pagina enter insurant data")
    public void estou_na_pagina_enter_insurant_data() {
        assertTrue(getInsurantDataElement().getText().contains("Enter Insurant Data"));
    }

    @Dado("preencho o campo name")
    public void preencho_o_campo_name() {
        getFirstNameElement().sendKeys("Usuario");
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
       /*WebDriverWait espera = new WebDriverWait(browser, 5)
        espera.until(ExpectedConditions.elementToBeClickable(gender)); */

        ((WebElement) getGenderSelect()).click();
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
        getHobbiesElement().click();
    }

    @Dado("preencho o campo website")
    public void preencho_o_campo_website() {
        getWebsiteElement().sendKeys("http://www.capital.sp.gov.br");
    }

    /*
     * @Dado("preencho o campo picture") public void preencho_o_campo_picture() {
     * WebElement open = browser.findElement(By.id("open")); open.click(); }
     */

    @Entao("eu clico no botao next para ir para a aba Product Data")
    public void eu_clico_no_botao_next_para_ir_para_a_aba_product_data() {
        getNextElement().click();
    }
}