package com.class02;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Task1 {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		WebElement userName=driver.findElement(By.id("txtUsername"));
		
		userName.sendKeys("Admin");

		
		driver.get("http://www.newtours.demoaut.com/");
		driver.findElement(By.name("userName"));
		
		driver.findElement(By.name("password"));
	}

}
//ask.get("http://www.newtours.demoaut.com/");
//Thread.sleep(2000);
//task.findElement(By.linkText("REGISTER")).click();
//Thread.sleep(2000);
//   task.findElement(By.name("firstName")).sendKeys("Salim");
//    Thread.sleep(2000);
//    task.findElement(By.name("lastName")).sendKeys("Koca");
//    Thread.sleep(2000);
//    task.findElement(By.name("phone")).sendKeys("703765757");
//    Thread.sleep(2000);
//    task.findElement(By.name("userName")).sendKeys("salimkkk@gmail.com");
//    Thread.sleep(2000);
//    task.findElement(By.name("register")).click();
