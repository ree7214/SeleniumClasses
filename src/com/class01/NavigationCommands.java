package com.class01;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class NavigationCommands {

	public static void main(String[] args) {
		
		//system is a class. setProperty(); is a static method
		
		//						key								value
		System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		//https---->hypertext transfer protocol source
		driver.get("https://www.google.com");
		
		//browser navigation commands.
		
		//it will navigate to a given url
		driver.navigate().to("https://www.facebook.com");
		
		//it will navigate back
		driver.navigate().back();
		
		//i will navigate one step forward.
		driver.navigate().forward();
		
		String actualTitle=driver.getTitle();
		System.out.println(actualTitle);
		
		//refresh the curnt page
				driver.navigate().refresh();
		
		driver.close();
}


	}


