package com.class04;

import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.utils.CommonMethods;
import com.utils.Constants;

public class CheckBoxDemoPracRee extends CommonMethods {

	public static void main(String[] args) throws InterruptedException {

		CommonMethods.setUp("chrome", Constants.SYNTAX_PRACTICE_URL);
		driver.manage().window().maximize();
		driver.findElement(By.linkText("Input Forms")).click();
		driver.findElement(By.linkText("Checkbox Demo")).click();
		WebElement ageCheckBox=driver.findElement(By.id("isAgeSelected"));
	
		if(!ageCheckBox.isSelected()) {
			ageCheckBox.click();
			
			Thread.sleep(1000);
		}
		ageCheckBox.click();
		
		System.out.println("****Group of Check Boxes****");
		
		List<WebElement> groupCheckBox=driver.findElements(By.xpath("//input[@class='cb1-element']"));
		
		if(!groupCheckBox.isEmpty()) {
			Iterator<WebElement> grpIt = groupCheckBox.iterator();
			
			while(grpIt.hasNext()) {
				grpIt.next().click();
				Thread.sleep(1000);
			}
		}
		
	}

}
