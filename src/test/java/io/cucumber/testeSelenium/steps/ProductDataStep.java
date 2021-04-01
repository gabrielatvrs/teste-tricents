package io.cucumber.testeSelenium.steps;

import io.cucumber.testeSelenium.pages.ProductDataPage;

import org.openqa.selenium.WebElement;

import io.cucumber.java.pt.*;

public class ProductDataStep extends ProductDataPage {

    @Dado("preencho o campo start date")
    public void preencho_o_campo_start_date() {
        getStartDateElement().sendKeys("05/31/2021");
    }

    @Dado("preencho o campo insurance sum")
    public void preencho_o_campo_insurance_sum() {
        getInsuranceSumSelect().selectByIndex(7);
    }

    @Dado("preencho o campo merit rating")
    public void preencho_o_campo_merit_rating() {
        getMeritRatingSelect().selectByIndex(9);
    }

    @Dado("preencho o campo damage insurance")
    public void preencho_o_campo_damage_insurance() {
        getDamageInsuranceSelect().selectByIndex(3);
    }

    @Dado("preencho o campo optional products")
    public void preencho_o_campo_optional_products() {
        WebElement optionalProducts = getOptionalProductsElement();
        acoes.moveToElement(optionalProducts).click().perform();
    }

    @Dado("preencho o campo courtesy car")
    public void preencho_o_campo_courtesy_car() {
        getCourtesyCarSelect().selectByIndex(1);
    }

    @Entao("eu clico no botao next para ir para a aba Select Price Option")
    public void eu_clico_no_botao_next_para_ir_para_a_aba_Select_Price_Option() {
        getNextElement().click();
    }
}