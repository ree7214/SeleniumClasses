package com.class01;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Task2 {

	public static void main(String[] args) {
			System.setProperty("webdriver.chrome.driver", "drivers\\chromedriver.exe");
			WebDriver driver=new ChromeDriver();
			
			driver.get("http://www.syntaxtechs.com/");
			driver.navigate().to("http://google.com/");
			driver.navigate().back();
			driver.navigate().refresh();
			String actualURL=driver.getCurrentUrl();
			if(actualURL.contains("Syntax")) {
				System.out.println("Syntax is in URL");
			}else {
				System.err.println("it aint there");
			}
			driver.close();
	}

}
