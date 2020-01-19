package com.class05;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;

import com.utils.CommonMethods;

public class Task extends CommonMethods {
	public static final String SYNTAX_PRACTICE_URL = "http://166.62.36.207/syntaxpractice/index.html";
	public static void main(String[] args) throws InterruptedException {
		CommonMethods.setUp("chrome", SYNTAX_PRACTICE_URL);
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[@href='#' and text()='Alerts & Modals']")).click();
		driver.findElement(By.linkText("Javascript Alerts")).click();
		driver.findElement(By.xpath("//button[@onclick='myAlertFunction()']")).click();
		Thread.sleep(2000);
		Thread.sleep(2000);
		Alert alert = driver.switchTo().alert();
		Thread.sleep(2000);
		System.out.println("Alert text:   " + alert.getText());
		alert.accept();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[@onclick='myConfirmFunction()']")).click();
		Alert alert1 = driver.switchTo().alert();
		Thread.sleep(2000);
		System.out.println("Text of Second Alert: " + alert1.getText());
		alert1.dismiss();
		driver.findElement(By.xpath("//button[@onclick='myPromptFunction()']")).click();
		Thread.sleep(2000);
		Alert alert3 = driver.switchTo().alert();
		alert.sendKeys("Syntax");
		alert.accept();
		driver.close();
	}
}