package com.class03;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebElementsCommandsDemo1 {
	public static final String URL="http://166.62.36.207/humanresources/symfony/web/index.php/auth/login";
	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get(URL);
		
		WebElement userName=driver.findElement(By.xpath("//input[@id='txtUsername']"));
		userName.sendKeys("Admin");
		userName.clear();
		userName.sendKeys("Helen");
		
		driver.findElement(By.xpath("//input[@id='txtPassword']")).sendKeys("helen@123");
		
		//span[@id='spanMessage']
		driver.findElement(By.id("btnLogin")).click();
		
		WebElement errorMessage=driver.findElement(By.xpath("//span[@id='spanMessage']"));
		System.out.println(errorMessage.isDisplayed());
		
		
		//String errorMsg=errorMessage.getText();
		//System.out.println(errorMsg);
		
		
		if(errorMessage.isDisplayed()) {//checking if the error message is displayed or not
			String message=errorMessage.getText();//get the visibale text from error message
			if(message.equals("Invalid credentials")) {//compare the text with expected message
				System.out.println("Correct Error Message is Displayed");
			}else {
				System.err.println("Incorect error Message is Displayed");
			}	
		}
		
		
	}

}
