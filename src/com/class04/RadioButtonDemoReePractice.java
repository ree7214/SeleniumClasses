package com.class04;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.utils.CommonMethods;
import com.utils.Constants;

public class RadioButtonDemoReePractice extends CommonMethods{

	public static void main(String[] args) throws InterruptedException {

		//Opening brower with url
		CommonMethods.setUp("chrome",Constants.SYNTAX_PRACTICE_URL);
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[text()=\"Input Forms\"]")).click();
		Thread.sleep(1000);
		
		//by xpath
	//	driver.findElement(By.xpath("//*[@id=\"treemenu\"]/li/ul/li[1]/ul/li[3]")).click();
		
		//by linktext
		driver.findElement(By.linkText("Radio Buttons Demo")).click();
		
		WebElement malerRadioBtn=driver.findElement(By.xpath("//input[@name='optradio' and @value='Male']"));
		System.out.println(malerRadioBtn.isSelected());
		malerRadioBtn.click();
		System.out.println(malerRadioBtn.isSelected());
		System.out.println("************************");
		
		List<WebElement> radioButtons=driver.findElements(By.name("optradio"));
		
		
		
		for(int i=0; i<radioButtons.size(); i++) {
			boolean isSelected = radioButtons.get(i).isSelected();
			if(!isSelected) {
				radioButtons.get(i).click();
				System.out.println(radioButtons.get(i).isSelected());
				Thread.sleep(1000);
				
			}
			
		}
		driver.close();
		
		
	}

}
