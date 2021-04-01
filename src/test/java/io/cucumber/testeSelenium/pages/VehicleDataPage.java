package io.cucumber.testeSelenium.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;

import io.cucumber.testeSelenium.servicos.ConfigBrowser;

public class VehicleDataPage extends ConfigBrowser {

    public WebElement getVehicleDataElement() {
        return browser.findElement(By.id("entervehicledata"));
    }

    public Select getMakeSelect() {
        return new Select(browser.findElement(By.id("make")));
    }

    public Select getModelSelect() {
        return new Select(browser.findElement(By.id("model")));
    }

    public WebElement getCylinderCapacityElement() {
        return browser.findElement(By.id("cylindercapacity"));
    }

    public WebElement getEnginePerformanceElement() {
        return browser.findElement(By.id("engineperformance"));
    }

    public WebElement getDateOfManufactureElement() {
        return browser.findElement(By.id("dateofmanufacture"));
    }

    public Select getSeatSelect() {
        return new Select(browser.findElement(By.id("numberofseats")));
    }

    public WebElement getHandDriveElement() {
        WebElement handDrive = browser.findElement(By.cssSelector(".ideal-radiocheck-label"));
        espera.until(ExpectedConditions.elementToBeClickable(handDrive));
        return handDrive;
    }

    public Select getSeatMotorcycleSelect() {
        return new Select(browser.findElement(By.id("numberofseatsmotorcycle")));
    }

    public Select getFuelSelect() {
        return new Select(browser.findElement(By.id("fuel")));
    }

    public WebElement getPayloadElement() {
        return browser.findElement(By.id("payload"));
    }

    public WebElement getTotalWeightElement() {
        return browser.findElement(By.id("totalweight"));
    }

    public WebElement getListPriceElement() {
        return browser.findElement(By.id("listprice"));
    }

    public WebElement getLicensePlateNumberElement() {
        return browser.findElement(By.id("licenseplatenumber"));
    }

    public WebElement getAnnualMileageElement() {
        return browser.findElement(By.id("annualmileage"));
    }

    public WebElement getNextElement() {
        return browser.findElement(By.id("nextenterinsurantdata"));
    }
}