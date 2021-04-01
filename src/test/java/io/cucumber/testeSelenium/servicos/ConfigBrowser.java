package io.cucumber.testeSelenium.servicos;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ConfigBrowser {

	public static Actions acoes;
	public static WebDriver browser;
	public static WebDriverWait espera;

	public static void abrir(String url) {

		if (browser == null) {
			System.setProperty("webdriver.chrome.driver", "driver/chromedriver.exe");
			browser = new ChromeDriver();
		}

		browser.get(url);

		acoes = new Actions(browser);
		espera = new WebDriverWait(browser, 10);
	}

	public static void fechar() {
		browser.close();
		browser = null;
	}
}
