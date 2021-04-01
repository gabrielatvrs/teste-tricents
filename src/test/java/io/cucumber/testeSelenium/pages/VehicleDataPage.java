package io.cucumber.testeSelenium.pages;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;

import io.cucumber.testeSelenium.servicos.ConfigBrowser;

public class VehicleDataPage extends ConfigBrowser {

    public Select getMakeSelect() {
        List<WebElement> make = browser.findElements(By.id("make"));
        assertEquals(1, make.size());
        return new Select(make.get(0));
    }

    public Select getModelSelect() {
        List<WebElement> model = browser.findElements(By.id("model"));
        assertEquals(1, model.size());
        return new Select(model.get(0));
    }

    public WebElement getCylinderCapacityElement() {
        List<WebElement> cylinderCapacity = browser.findElements(By.id("cylindercapacity"));
        assertEquals(1, cylinderCapacity.size());
        return cylinderCapacity.get(0);
    }

    public WebElement getEnginePerformanceElement() {
        List<WebElement> enginePerformance = browser.findElements(By.id("engineperformance"));
        assertEquals(1, enginePerformance.size());
        return enginePerformance.get(0);
    }

    public WebElement getDateOfManufactureElement() {
        List<WebElement> dateOfManufacture = browser.findElements(By.id("dateofmanufacture"));
        assertEquals(1, dateOfManufacture.size());
        return dateOfManufacture.get(0);
    }

    public Select getSeatSelect() {
        List<WebElement> numberOfSeats = browser.findElements(By.id("numberofseats"));
        assertEquals(1, numberOfSeats.size());
        return new Select(numberOfSeats.get(0));
    }

    public WebElement getHandDriveElement() {
        List<WebElement> handDrive = browser.findElements(By.cssSelector(".ideal-radiocheck-label"));
        assertNotEquals(0, handDrive.size());
        espera.until(ExpectedConditions.elementToBeClickable(handDrive.get(0)));
        return handDrive.get(0);
    }

    public Select getSeatMotorcycleSelect() {
        List<WebElement> numberOfSeatsMotorcycle = browser.findElements(By.id("numberofseatsmotorcycle"));
        assertEquals(1, numberOfSeatsMotorcycle.size());
        return new Select(numberOfSeatsMotorcycle.get(0));
    }

    public Select getFuelSelect() {
        List<WebElement> fuel = browser.findElements(By.id("fuel"));
        assertEquals(1, fuel.size());
        return new Select(fuel.get(0));
    }

    public WebElement getPayloadElement() {
        List<WebElement> payload = browser.findElements(By.id("payload"));
        assertEquals(1, payload.size());
        return payload.get(0);
    }

    public WebElement getTotalWeightElement() {
        List<WebElement> totalWeight = browser.findElements(By.id("totalweight"));
        assertEquals(1, totalWeight.size());
        return totalWeight.get(0);
    }

    public WebElement getListPriceElement() {
        List<WebElement> listPrice = browser.findElements(By.id("listprice"));
        assertEquals(1, listPrice.size());
        return listPrice.get(0);
    }

    public WebElement getLicensePlateNumberElement() {
        List<WebElement> licensePlateNumber = browser.findElements(By.id("licenseplatenumber"));
        assertEquals(1, licensePlateNumber.size());
        return licensePlateNumber.get(0);
    }

    public WebElement getAnnualMileageElement() {
        List<WebElement> annualMileage = browser.findElements(By.id("annualmileage"));
        assertEquals(1, annualMileage.size());
        return annualMileage.get(0);
    }

    public WebElement getNextElement() {
        List<WebElement> next = browser.findElements(By.id("nextenterinsurantdata"));
        assertEquals(1, next.size());
        return next.get(0);
    }
}