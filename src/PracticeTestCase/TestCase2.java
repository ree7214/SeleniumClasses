package PracticeTestCase;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestCase2 {
  public static void main(String[] args) throws InterruptedException {
	
	  System.setProperty("webdriver.chrome.driver", "drivers\\chromedriver.exe");
	  
	  WebDriver driver = new ChromeDriver();
	  driver.get("https://www.amazon.com/");
	  System.out.println(driver.getTitle());
	 
	  
	  driver.get("https://www.zillow.com/");
	  driver.navigate().to("https://www.google.com");
	  Thread.sleep(2000);
	  driver.navigate().back();
	 String urlTitle =driver.getCurrentUrl();
	 System.out.println(urlTitle);
	 boolean zil = urlTitle.contains("zillow");
	 System.out.println(zil);
	 driver.close();
	 
}
}
