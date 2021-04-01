package io.cucumber.testeSelenium.steps;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import io.cucumber.java.pt.*;
import io.cucumber.testeSelenium.pages.SendQuotePage;

public class SendQuoteStep extends SendQuotePage {

    @Dada("estou na pagina send quote")
    public void estou_na_pagina_send_quote() {
        assertTrue(getSendQuoteElement().getText().contains("Send Quote"));
    }

    @Dado("preencho o campo e-mail")
    public void preencho_o_campo_e_mail() {
        getEmailElement().sendKeys("usuario@outlook.com");
    }

    @Dado("preencho o campo phone")
    public void preencho_o_campo_phone() {
        getPhoneElement().sendKeys("999999999");
    }

    @Dado("preencho o campo username")
    public void preencho_o_campo_username() {
        getUsernameElement().sendKeys("Username");
    }

    @Dado("preencho o campo password")
    public void preencho_o_campo_password() {
        getPasswordElement().sendKeys("Senha");
    }

    @Dado("preencho o campo confirm password")
    public void preencho_o_campo_confirm_password() {
        getConfirmPasswordElement().sendKeys("Senha");
    }

    @Entao("eu clico no botao send para enviar o formulario")
    public void eu_clico_no_botao_send_para_enviar_o_formulario() {
        getSendElement().click();
    }

    @Dado("verifico a mensagem {string}")
    public void verifico_a_mensagem(String string) {
        assertEquals(string, getSuccessMessageElement().getText());
    }
}
