package com.class03;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class TEST {

	public static void main(String[] args) {

		System.setProperty("webdriver.gecko.driver", "drivers\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.get("https://google.com");
		
	}

}
