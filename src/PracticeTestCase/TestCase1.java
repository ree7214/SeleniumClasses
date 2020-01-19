package PracticeTestCase;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestCase1 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "drivers\\chromedriver.exe");
		 WebDriver driver = new ChromeDriver();
		 
		 driver.get("https://github.com/");
			
	}

}
