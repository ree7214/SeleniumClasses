package com.class07;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.utils.CommonMethods;
import com.utils.Constants;

public class Task4 extends CommonMethods{

	public static void main(String[] args) throws InterruptedException {
		
		CommonMethods.setUp("chrome", Constants.HRMS_URL);
		driver.findElement(By.id("txtUsername")).sendKeys("UserOne");
		driver.findElement(By.id("txtPassword")).sendKeys("Syntax123!");
		driver.findElement(By.id("btnLogin")).click();
		driver.findElement(By.xpath("//b[text()='PIM']")).click();
		
		WebDriverWait wait = new WebDriverWait(driver, 20);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.linkText("Add Employee")));
		driver.findElement(By.linkText("Add Employee")).click();
		driver.findElement(By.id("firstName")).sendKeys("Test01");
		Thread.sleep(1000);
		driver.findElement(By.id("lastName")).sendKeys("Testing");
		driver.findElement(By.id("btnSave")).click();
		driver.findElement(By.id("welcome")).click();
		
		WebDriverWait wait01 = new WebDriverWait(driver, 20);
		wait01.until(ExpectedConditions.visibilityOfElementLocated(By.linkText("Logout")));
		driver.findElement(By.xpath("//a[text()='Logout']")).click();
		
		driver.quit();

	}

}
