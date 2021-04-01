package io.cucumber.testeSelenium.pages;

import static org.junit.Assert.assertEquals;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import io.cucumber.testeSelenium.servicos.ConfigBrowser;

public class SelectPriceOptionPage extends ConfigBrowser {

    public WebElement getOptionElement() {
        List<WebElement> selectSilver = browser.findElements(By.id("selectsilver"));
        assertEquals(1, selectSilver.size());
        return selectSilver.get(0);
    }

    public WebElement getNextElement() {
        List<WebElement> next = browser.findElements(By.id("nextsendquote"));
        assertEquals(1, next.size());
        return next.get(0);
    }
}
