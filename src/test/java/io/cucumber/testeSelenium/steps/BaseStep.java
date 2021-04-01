package io.cucumber.testeSelenium.steps;

import static org.junit.jupiter.api.Assertions.assertTrue;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import io.cucumber.java.pt.Dado;
import io.cucumber.testeSelenium.servicos.ConfigBrowser;

public class BaseStep extends ConfigBrowser {

    @Dado("estou na pagina {string}")
    public void estou_na_pagina(String string) {
        WebElement aba = browser.findElement(By.cssSelector(".idealsteps-step-active a"));
        assertTrue(aba.getText().contains(string));
    }
}
