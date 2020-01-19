package com.class07;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.utils.CommonMethods;
import com.utils.Constants;

public class Task1 extends CommonMethods {
	
	public static void main(String[] args) {
		
		CommonMethods.setUp("chrome", Constants.welcomeToTheInternet_URL);
		driver.findElement(By.linkText("Dynamic Loading")).click();
		driver.findElement(By.linkText("Example 1: Element on page that is hidden")).click();
		driver.findElement(By.xpath("//button[text()='Start']")).click();
		
		WebDriverWait wait=new WebDriverWait(driver, 30);
		
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//h4[text()='Hello World!']")));
		boolean isDisplay = driver.findElement(By.xpath("//h4[text()='Hello World!']")).isDisplayed();
		
		if(isDisplay) {
			System.out.println("Test Passed");
		}else {
			System.out.println("Test Failed");
		}
		driver.quit();
	}
}
