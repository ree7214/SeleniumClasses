package com.class07;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.utils.CommonMethods;
import com.utils.Constants;

public class Task2 extends CommonMethods {

	public static void main(String[] args) {
		
		CommonMethods.setUp("chrome", Constants.welcomeToTheInternet_URL);
		driver.findElement(By.linkText("Dynamic Controls")).click();
		driver.findElement(By.xpath("//input[@type=\"checkbox\"] ")).click();
		driver.findElement(By.xpath("//*[@id=\"checkbox-example\"]/button")).click();
	
		WebDriverWait wait = new WebDriverWait(driver, 30);
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"checkbox-example\"]/button")));
		driver.findElement(By.xpath("//*[@id=\"checkbox-example\"]/button")).click();
		
		WebDriverWait wait1 = new WebDriverWait(driver, 30);
		wait1.until(ExpectedConditions.elementToBeClickable(By.id("message"))).click();
		boolean isDisplay = driver.findElement(By.id("message")).isDisplayed();
		if(isDisplay) {
			System.out.println("Test Passed");
		}else {
			System.out.println("Test Failed");
		}
		
		driver.quit();
	}

}
