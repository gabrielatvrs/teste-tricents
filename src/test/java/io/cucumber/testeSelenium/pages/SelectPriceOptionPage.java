package io.cucumber.testeSelenium.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;

import io.cucumber.testeSelenium.servicos.ConfigBrowser;

public class SelectPriceOptionPage extends ConfigBrowser {

    public WebElement getSelectPriceOptionElement() {
        return browser.findElement(By.id("selectpriceoption"));
    }

    public WebElement getOptionElement() {
        WebElement option = browser.findElement(By.cssSelector(".ideal-radiocheck-label"));
        espera.until(ExpectedConditions.elementToBeClickable(option));
        return option;
    }

    public WebElement getViewQuoteElement() {
        return browser.findElement(By.id("viewquote"));
    }

    public WebElement getNextElement() {
        return browser.findElement(By.id("nextentersendquote"));
    }    
}
