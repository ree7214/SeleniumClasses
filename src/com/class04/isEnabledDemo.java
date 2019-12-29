package com.class04;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.utils.CommonMethods;


public class isEnabledDemo extends CommonMethods {
	public static final String HRMS_URL="http://166.62.36.207/humanresources/symfony/web/index.php/auth/login";
	public static void main(String[] args) {

		CommonMethods.setUp("firefox",HRMS_URL);
		driver.manage().window().maximize();
		
		WebElement loginBtn=driver.findElement(By.cssSelector("#btnLogin"));
		
		//isEnabled() is used to see if the target element is enabled or disabled.
		System.out.println(loginBtn.isEnabled());
		
	}

}
