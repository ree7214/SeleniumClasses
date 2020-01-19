package PracticeTestCase;

import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class FacebookDropDown {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.facebook.com/");
		
		WebElement monthDD = driver.findElement(By.id("month"));
		Select select = new Select(monthDD);
		List<WebElement> monthOptions = select.getOptions();
		System.out.println("The number of months in the drop down list are: "+(monthOptions.size()-1));
	
		Iterator<WebElement> monIt = monthOptions.iterator();
		while(monIt.hasNext()) {
			String monthText = monIt.next().getText();
			if(!monthText.equalsIgnoreCase("month")) {
			System.out.println(monthText);
			
			}
		}
		
		WebElement dayDropDown = driver.findElement(By.id("day"));
		Select select2 = new Select (dayDropDown);
		List<WebElement> dayOptions = select2.getOptions();
		System.out.println("The number of days in the drop down list are: "+dayOptions.size());
		
		WebElement yearDropDown=driver.findElement(By.id("year"));
		Select select3 = new Select(yearDropDown);
		List<WebElement> yearOptions = select3.getOptions();
		System.out.println("The number of years in the drop down list are: "+yearOptions.size());
		System.out.println("--------------------------------------");
		for(WebElement list:yearOptions) {
			System.out.println(list.getText());
		}
		
		
		}
	}


