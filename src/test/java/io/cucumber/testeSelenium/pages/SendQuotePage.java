package io.cucumber.testeSelenium.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import io.cucumber.testeSelenium.servicos.ConfigBrowser;

public class SendQuotePage extends ConfigBrowser {

    public WebElement getSendQuoteElement() {
        return browser.findElement(By.id("sendquote"));
    }

    public WebElement getEmailElement() {
        return browser.findElement(By.id("email"));
    }

    public WebElement getPhoneElement() {
        return browser.findElement(By.id("phone"));
    }

    public WebElement getUsernameElement() {
        return browser.findElement(By.id("username"));
    }

    public WebElement getPasswordElement() {
        return browser.findElement(By.id("password"));
    }

    public WebElement getConfirmPasswordElement() {
        return browser.findElement(By.id("confirmpassword"));
    }

    public WebElement getSendElement() {
        return browser.findElement(By.id("sendemail"));
    }

    public WebElement getSuccessMessageElement() {
        return browser.findElement(By.cssSelector("div.sweet-alert > h2"));
    }
}
