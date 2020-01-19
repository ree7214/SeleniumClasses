package com.class08;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.utils.CommonMethods;
import com.utils.Constants;

public class Task1 extends CommonMethods {

	public static void main(String[] args) {

		setUp("chrome", Constants.SYNTAX_PRACTICE_URL);
		//navigate to the table we need
		driver.findElement(By.linkText("Table")).click();
		driver.findElement(By.linkText("Table Data Search")).click();
		
		List<WebElement> tblRows = driver.findElements(By.xpath("//table[@class=\"table\"]/tbody/tr"));
		for(WebElement row:tblRows) {
			String rowIndex = row.getText();
			System.out.println(rowIndex);
			System.out.println("************************");
		}
		List<WebElement> tblCols = driver.findElements(By.xpath("//table[@class=\"table\"]//thead[2]/tr/th"));
		for(WebElement col:tblCols) {
			String colData = col.getText();
			System.out.println(colData);
			System.out.println("************************");
		}
		
	}

}
