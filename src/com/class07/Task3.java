package com.class07;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.utils.CommonMethods;
import com.utils.Constants;

public class Task3 extends CommonMethods {

	public static void main(String[] args) throws InterruptedException {

		CommonMethods.setUp("chrome", Constants.welcomeToTheInternet_URL);
		driver.findElement(By.linkText("Dynamic Controls")).click();
		driver.findElement(By.xpath("//button[text()='Enable']")).click();
		
		WebDriverWait wait = new WebDriverWait(driver, 30);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("message")));
		WebElement inputBox = driver.findElement(By.cssSelector("input[type='text']"));
	
		inputBox.sendKeys("Hello");
		String displayMessage = inputBox.getAttribute("value");
	
		boolean display = inputBox.isDisplayed();
		if(display) {
			System.out.println("Test Passed. Displayed message is: "+displayMessage);
		}else {
			System.out.println("Test Failed. Message was not visable");
		}
		
		
		Thread.sleep(1000);
		driver.quit();
		
	}

}
