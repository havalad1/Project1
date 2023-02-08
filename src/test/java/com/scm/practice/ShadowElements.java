package com.scm.practice;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ShadowElements {
	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("chrome://downloads/");
		JavascriptExecutor js = (JavascriptExecutor) driver;
		WebElement ele = (WebElement) js.executeScript("return document.querySelector('body > downloads-man"
				+ "ager').shadowRoot.querySelector('#toolbar').shadowRoot.querySelector('#toolbar')."
				+ "shadowRoot.querySelector('#search').shadowRoot.querySelector('#searchInput')");
		ele.sendKeys("shankar");
		Thread.sleep(4000);
		WebElement ele1 = (WebElement) js.executeScript("return document.querySelector(\"body > downloads-manager\").shadowRoot.querySelector(\"#toolbar\").shadowRoot.querySelector(\"#toolbar\").shadowRoot.querySelector(\"#search\").shadowRoot.querySelector(\"#clearSearch\").shadowRoot.querySelector(\"#icon > iron-icon\")");
			
		ele1.click();
		driver.quit();
	}
}
