package io.cucumber.testeSelenium.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import io.cucumber.testeSelenium.servicos.ConfigBrowser;

public class SelectPriceOptionPage extends ConfigBrowser {

    public WebElement getSelectPriceOptionElement() {
        return browser.findElement(By.id("selectpriceoption"));
    }

    public WebElement getOptionElement() {
        return browser.findElement(By.id("selectultimate"));
    }

    public WebElement getNextElement() {
        return browser.findElement(By.id("nextentersendquote"));
    }
}
