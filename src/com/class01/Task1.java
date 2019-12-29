package com.class01;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Task1 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.get("http://www.amazon.com");
		
		final String expectedTitle="Amazon.com: Online Shopping for Electronics, Apparel, Computers, Books, DVDs & more";
				    String actualTitle=driver.getTitle();
				    if(expectedTitle.equals(actualTitle)) {
				      System.out.println("The actual and expected Title matched");
				    }else {
				      System.err.println("The actual and expected Title did not match");
				    }	      
				    driver.close();
		
	}

}
