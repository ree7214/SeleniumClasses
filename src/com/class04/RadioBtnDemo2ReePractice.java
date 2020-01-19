package com.class04;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.utils.CommonMethods;
import com.utils.Constants;

public class RadioBtnDemo2ReePractice extends CommonMethods {

	public static void main(String[] args) throws InterruptedException {

		CommonMethods.setUp("chrome", Constants.SYNTAX_PRACTICE_URL);
		driver.findElement(By.linkText("Input Forms")).click();
		driver.findElement(By.linkText("Radio Buttons Demo")).click();
//		driver.findElement(By.xpath("//input[@name=\"optradio\" and @value=\"Male\"]")).click();
//		Thread.sleep(1000);
//		driver.findElement(By.xpath("//input[@name=\"optradio\" and @value=\"Female\"]")).click();

		/*
		 * Another way is by putting the web elemnent in a list to choose either male or
		 * female to be clicked on.
		 */

		List<WebElement> radioBtns = driver.findElements(By.name("optradio"));
		
		for(WebElement el:radioBtns) {
			String genderBtn = el.getAttribute("value");
			if(genderBtn.equalsIgnoreCase("male")) {
				el.click();
			}
		}
		Thread.sleep(2000);
		driver.close();

	}

}
