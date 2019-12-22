package com.class1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class PageCommands {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.get("http://www.google.com");
		
		final String expectedTitle="Google";
	    String actualTitle=driver.getTitle();
	    if(expectedTitle.equals(actualTitle)) {
	    	System.out.println("I am on the right page");
	    }else {
	    	System.err.println("The actual and expected title did not match");
	    }
	    
	    System.out.println("***********************");

	    String actualUrl=driver.getCurrentUrl();
	    
	    System.out.println(actualUrl);
	    
	    String expectedUrl="https://www.google.com/?gws_rd=ssl";
	    
	    if(expectedUrl.equals(actualUrl)) {
	    	System.out.println("Both URLS match");
	    }else {
	    	System.out.println("Both URLS do match");
	    }
	    
	}

}
