package io.cucumber.testeSelenium.pages;

import static org.junit.Assert.assertEquals;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;

import io.cucumber.testeSelenium.servicos.ConfigBrowser;

public class SendQuotePage extends ConfigBrowser {

    public WebElement getEmailElement() {
        List<WebElement> email = browser.findElements(By.id("email"));
        assertEquals(1, email.size());
        return email.get(0);
    }

    public WebElement getPhoneElement() {
        List<WebElement> phone = browser.findElements(By.id("phone"));
        assertEquals(1, phone.size());
        return phone.get(0);
    }

    public WebElement getUsernameElement() {
        List<WebElement> username = browser.findElements(By.id("username"));
        assertEquals(1, username.size());
        return username.get(0);
    }

    public WebElement getPasswordElement() {
        List<WebElement> password = browser.findElements(By.id("password"));
        assertEquals(1, password.size());
        return password.get(0);
    }

    public WebElement getConfirmPasswordElement() {
        List<WebElement> confirmpassword = browser.findElements(By.id("confirmpassword"));
        assertEquals(1, confirmpassword.size());
        return confirmpassword.get(0);
    }

    public WebElement getSendElement() {
        List<WebElement> sendemail = browser.findElements(By.id("sendemail"));
        assertEquals(1, sendemail.size());
        return sendemail.get(0);
    }

    public WebElement getSuccessMessageElement() {
        By selector = By.cssSelector("div.sweet-alert > h2");
        espera.until(ExpectedConditions.visibilityOfElementLocated(selector));
        List<WebElement> successMessage = browser.findElements(selector);
        assertEquals(1, successMessage.size());
        return successMessage.get(0);
    }
}