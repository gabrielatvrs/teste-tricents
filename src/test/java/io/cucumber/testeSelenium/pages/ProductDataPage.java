package io.cucumber.testeSelenium.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import io.cucumber.testeSelenium.servicos.ConfigBrowser;

public class ProductDataPage extends ConfigBrowser {

    public WebElement getProductDataElement() {
        return browser.findElement(By.id("enterproductdata"));
    }

    public WebElement getStartDateElement() {
        return browser.findElement(By.id("startdate"));
    }

    public Select getInsuranceSumSelect() {
        return new Select(browser.findElement(By.id("insurancesum")));
    }

    public Select getDamageInsuranceSelect() {
        return new Select(browser.findElement(By.id("damageinsurance")));
    }

    public WebElement getOptionalProductsElement() {
        return browser.findElement(By.id(".ideal-radiocheck-label"));
    }

    public Select getCourtesyCarSelect() {
        return new Select(browser.findElement(By.id("courtesycar")));
    }

    public WebElement getNextElement() {
        return browser.findElement(By.id("nextenterselectpriceoption"));
    }
}
