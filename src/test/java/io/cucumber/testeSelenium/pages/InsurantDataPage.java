package io.cucumber.testeSelenium.pages;

import static org.junit.Assert.assertEquals;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import io.cucumber.testeSelenium.servicos.ConfigBrowser;

public class InsurantDataPage extends ConfigBrowser {

    public WebElement getFirstNameElement() {
        List<WebElement> firstname = browser.findElements(By.id("firstname"));
        assertEquals(1, firstname.size());
        return firstname.get(0);
    }

    public WebElement getLastNameElement() {
        List<WebElement> lastname = browser.findElements(By.id("lastname"));
        assertEquals(1, lastname.size());
        return lastname.get(0);
    }

    public WebElement getDateOfBirthElement() {
        List<WebElement> birthdate = browser.findElements(By.id("birthdate"));
        assertEquals(1, birthdate.size());
        return birthdate.get(0);
    }

    public WebElement getGenderSelect() {
        List<WebElement> gendermale = browser.findElements(By.id("gendermale"));
        assertEquals(1, gendermale.size());
        return gendermale.get(0);
    }

    public WebElement getStreetAddressElement() {
        List<WebElement> streetAddress = browser.findElements(By.id("streetaddress"));
        assertEquals(1, streetAddress.size());
        return streetAddress.get(0);
    }

    public Select getCountrySelect() {
        List<WebElement> country = browser.findElements(By.id("country"));
        assertEquals(1, country.size());
        return new Select(country.get(0));
    }

    public WebElement getZipCodeElement() {
        List<WebElement> zipcode = browser.findElements(By.id("zipcode"));
        assertEquals(1, zipcode.size());
        return zipcode.get(0);
    }

    public WebElement getCityElement() {
        List<WebElement> city = browser.findElements(By.id("city"));
        assertEquals(1, city.size());
        return city.get(0);
    }

    public Select getOccupationSelect() {
        List<WebElement> occupation = browser.findElements(By.id("occupation"));
        assertEquals(1, occupation.size());
        return new Select(occupation.get(0));
    }

    public WebElement getHobbiesElement() {
        List<WebElement> other = browser.findElements(By.id("other"));
        assertEquals(1, other.size());
        return other.get(0);
    }

    public WebElement getWebsiteElement() {
        List<WebElement> website = browser.findElements(By.id("website"));
        assertEquals(1, website.size());
        return website.get(0);
    }

    public WebElement getNextElement() {
        List<WebElement> next = browser.findElements(By.id("nextenterproductdata"));
        assertEquals(1, next.size());
        return next.get(0);
    }
}
