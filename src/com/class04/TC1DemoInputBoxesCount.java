package com.class04;

import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.utils.CommonMethods;
import com.utils.Constants;

public class TC1DemoInputBoxesCount extends CommonMethods {

	public static void main(String[] args) throws InterruptedException {

			CommonMethods.setUp("chrome", Constants.SYNTAX_PRACTICE_URL);
		
			driver.findElement(By.linkText("Input Forms")).click();
			driver.findElement(By.linkText("Simple Form Demo")).click();
			
			List<WebElement> inputBoxes=driver.findElements(By.tagName("Input"));
			Iterator<WebElement> itBoxes = inputBoxes.iterator();
			while(itBoxes.hasNext()) {
				itBoxes.next().sendKeys("Hello");
				Thread.sleep(1000);
			}
			driver.close();
			
			//selenium class4 video 2:31.42
			}
			
	}


