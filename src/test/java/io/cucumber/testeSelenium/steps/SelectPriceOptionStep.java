package io.cucumber.testeSelenium.steps;

import org.openqa.selenium.WebElement;

import io.cucumber.java.pt.*;
import io.cucumber.testeSelenium.pages.SelectPriceOptionPage;

public class SelectPriceOptionStep extends SelectPriceOptionPage {

    @Dado("seleciono a opcao Silver")
    public void seleciono_a_opcao_Silver() {
        WebElement opcaoSilver = getOptionElement();
        acoes.moveToElement(opcaoSilver).click().perform();
    }

    @Entao("eu clico no botao next para ir para a aba Send Quote")
    public void eu_clico_no_botao_next_para_ir_para_a_aba_Send_Quote() {
        WebElement nextButton = getNextElement();
        acoes.moveToElement(nextButton).click().perform();
    }
}
