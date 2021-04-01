package io.cucumber.testeSelenium.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;

import io.cucumber.testeSelenium.servicos.ConfigBrowser;

public class InsurantDataPage extends ConfigBrowser {

    public WebElement getInsurantDataElement() {
        return browser.findElement(By.id("enterinsurantdata"));
    }

    public WebElement getFirstNameElement() {
        return browser.findElement(By.id("firstname"));
    }

    public WebElement getLastNameElement() {
        return browser.findElement(By.id("lastname"));
    }

    public WebElement getDateOfBirthElement() {
        return browser.findElement(By.id("birthdate"));
    }

    public Select getGenderSelect() {
        return new Select(browser.findElement(By.id(".ideal-radio")));
    }

    public WebElement getStreetAddressElement() {
        return browser.findElement(By.id("streetaddress"));
    }

    public Select getCountrySelect() {
        return new Select(browser.findElement(By.id("country")));
    }

    public WebElement getZipCodeElement() {
        return browser.findElement(By.id("zipcode"));
    }

    public WebElement getCityElement() {
        return browser.findElement(By.id("city"));
    }

    public Select getOccupationSelect() {
        return new Select(browser.findElement(By.id("occupation")));
    }

    public WebElement getHobbiesElement() {
        WebElement hobbies = browser.findElement(By.cssSelector(".ideal-radiocheck-label"));
        espera.until(ExpectedConditions.elementToBeClickable(hobbies));
        return hobbies;  
    }

    public WebElement getWebsiteElement() {
        return browser.findElement(By.id("website"));
    }

    public WebElement getNextElement() {
        return browser.findElement(By.id("nextenterproductdata"));
    }   
}
