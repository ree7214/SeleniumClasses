package com.class04;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.utils.CommonMethods;
import com.utils.Constants;

public class TC2RadioBtnPractice extends CommonMethods {

	public static void main(String[] args) throws InterruptedException {
		
		CommonMethods.setUp("chrome", Constants.SYNTAX_PRACTICE_URL);
		
		driver.findElement(By.linkText("Input Forms")).click();
		driver.findElement(By.linkText("Radio Buttons Demo")).click();
		WebElement maleRadioBtn=driver.findElement(By.xpath("//input[@name=\"optradio\" and @value=\"Male\"]"));
		maleRadioBtn.click();
		System.out.println(maleRadioBtn.isSelected());
		Thread.sleep(1000);
		WebElement maleGroupBtn=driver.findElement(By.xpath("//input[@name=\"gender\" and @value=\"Male\"]"));
		maleGroupBtn.click();
		System.out.println(maleGroupBtn.isSelected());
		Thread.sleep(1000);
		
		driver.close();
	
		
}
}