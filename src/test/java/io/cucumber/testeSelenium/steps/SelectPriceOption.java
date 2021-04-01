package io.cucumber.testeSelenium.steps;

import static org.junit.Assert.assertTrue;

import io.cucumber.java.pt.*;
import io.cucumber.testeSelenium.pages.SelectPriceOptionPage;

public class SelectPriceOption extends SelectPriceOptionPage {

    @Dado("estou na pagina select price option")
    public void estou_na_pagina_select_price_option() {
        assertTrue(getSelectPriceOptionElement().getText().contains("select Price Option"));
    }

    @Dado("seleciono a opcao Silver")
    public void seleciono_a_opcao_Silver() {
        getOptionElement().click();
    }

    @Dado("clico no botao View Quote")
    public void clico_no_botao_View_Quote() {
        getViewQuoteElement().click();
    }

    @Entao("eu clico no botao next para ir para a aba Send Quote")
    public void eu_clico_no_botao_next_para_ir_para_a_aba_Send_Quote() {
        getNextElement().click();
    }
}
