package PracticeTestCase;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Task4 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "drivers//chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		String title = driver.getTitle();
		boolean fbtitle = title.contains("Facebook - Log In or Sign Up");
		System.out.println(fbtitle);
		
		driver.findElement(By.xpath("//a[contains(text(),'Forgot account')]"));
		String forgetPassWordTitle = driver.getTitle();
		System.out.println("**************");
		System.out.println(forgetPassWordTitle);
	}

}
