package io.cucumber.testeSelenium.pages;

import static org.junit.Assert.assertEquals;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import io.cucumber.testeSelenium.servicos.ConfigBrowser;

public class ProductDataPage extends ConfigBrowser {

    public WebElement getStartDateElement() {
        List<WebElement> startDate = browser.findElements(By.id("startdate"));
        assertEquals(1, startDate.size());
        return startDate.get(0);
    }

    public Select getInsuranceSumSelect() {
        List<WebElement> insuranceSum = browser.findElements(By.id("insurancesum"));
        assertEquals(1, insuranceSum.size());
        return new Select(insuranceSum.get(0));
    }

    public Select getMeritRatingSelect() {
        List<WebElement> meritRating = browser.findElements(By.id("meritrating"));
        assertEquals(1, meritRating.size());
        return new Select(meritRating.get(0));
    }

    public Select getDamageInsuranceSelect() {
        List<WebElement> damageInsurance = browser.findElements(By.id("damageinsurance"));
        assertEquals(1, damageInsurance.size());
        return new Select(damageInsurance.get(0));
    }

    public WebElement getOptionalProductsElement() {
        List<WebElement> euroProtection = browser.findElements(By.id("EuroProtection"));
        assertEquals(1, euroProtection.size());
        return euroProtection.get(0);
    }

    public Select getCourtesyCarSelect() {
        List<WebElement> courtesyCar = browser.findElements(By.id("courtesycar"));
        assertEquals(1, courtesyCar.size());
        return new Select(courtesyCar.get(0));
    }

    public WebElement getNextElement() {
        List<WebElement> next = browser.findElements(By.id("nextselectpriceoption"));
        assertEquals(1, next.size());
        return next.get(0);
    }
}
