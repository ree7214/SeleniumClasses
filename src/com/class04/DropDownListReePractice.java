package com.class04;

import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import com.utils.Constants;

public class DropDownListReePractice {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get(Constants.SYNTAX_PRACTICE_URL);

		driver.findElement(By.linkText("Input Forms")).click();
		driver.findElement(By.linkText("Select Dropdown List")).click();
		WebElement weekdayDropDown = driver.findElement(By.id("select-demo"));

		Select select = new Select(weekdayDropDown);

		select.selectByIndex(4);
		Thread.sleep(1000);
		select.selectByVisibleText("Sunday");
		Thread.sleep(1000);
		select.selectByValue("Thursday");

		System.out.println("Is the weekday drop down a multiselect? " + select.isMultiple());
		//single select drop down
		WebElement stateDropDown = driver.findElement(By.id("multi-select"));
		Select select2 = new Select(stateDropDown);

		System.out.println("Is the state drop down multiselect? " + select2.isMultiple());
		
		//selecting multiple states
		List<WebElement>allOptions=select2.getOptions();
		for(WebElement option:allOptions){
			String text=option.getText();
			if(text.equalsIgnoreCase("texas")||text.equalsIgnoreCase("New Jersey")||text.equalsIgnoreCase("ohio")) {
			option.click();	
			Thread.sleep(1000);
			System.out.println(option.getText());
			}
			
		}
		driver.close();
			}
		}

	


