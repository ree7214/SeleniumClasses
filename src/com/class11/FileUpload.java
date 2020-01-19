package com.class11;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.utils.CommonMethods;

public class FileUpload extends CommonMethods {

	public static void main(String[] args) throws InterruptedException {

		setUp("chrome", "https://the-internet.herokuapp.com/upload");
		// to upload file we can use sendKeys method and provide full path to the file
		driver.findElement(By.id("file-upload")).sendKeys("C:\\Users\\ree72\\OneDrive\\Desktop\\Interview Questions");
		//clicking on upload button
		Thread.sleep(3000);
		driver.findElement(By.id("file-submit")).click();
		WebElement uploaded = driver.findElement(By.xpath("//div[@id='uploaded-files']/preceding-sibling::h3"));
		
		if(uploaded.isDisplayed()) {
			System.out.println("File successfully uploaded");
		}else {
			System.out.println("File is not uploaded");
		}
		driver.quit();
	}

}
