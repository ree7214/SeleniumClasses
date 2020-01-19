package com.class08;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.utils.CommonMethods;

public class DynamicTableDemo extends CommonMethods {
	/*
	 * Navigate to WebOrders 
	 * login into WebOrders 
	 * click checkbox next to Bob Feather
	 */

	public static void main(String[] args) throws InterruptedException {
		CommonMethods.setUp("chrome",
				"http://secure.smartbearsoftware.com/samples/testcomplete11/WebOrders/login.aspx");
		driver.findElement(By.id("ctl00_MainContent_username")).sendKeys("Tester");
		driver.findElement(By.id("ctl00_MainContent_password")).sendKeys("test");
		driver.findElement(By.id("ctl00_MainContent_login_button")).click();

		String expectedValue = "Bob Feather";

		List<WebElement> rows = driver.findElements(By.xpath("//table[@id='ctl00_MainContent_orderGrid']/tbody/tr"));

		for (int i = 1; i < rows.size(); i++) {
			String rowText = rows.get(i).getText();
			if (rowText.contains(expectedValue)) {
				driver.findElement(By.xpath("//table[@id='ctl00_MainContent_orderGrid']/tbody/tr[" + (i+1) + "]/td[1]"))
						.click();
			}

		}
		Thread.sleep(3000);

		driver.quit();

	}

}