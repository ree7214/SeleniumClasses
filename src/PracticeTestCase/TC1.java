package PracticeTestCase;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TC1 {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver ();
		
		driver.get("http://166.62.36.207/humanresources/symfony/web/index.php/auth/login");
		driver.findElement(By.id("txtUsername")).sendKeys("VanEarl");
		//driver.findElement(By.id("txtPassword")).sendKeys("VanEarl@&12");
		driver.findElement(By.id("btnLogin")).click();
		boolean element = driver.findElement(By.xpath("//span[@id='spanMessage']")).isDisplayed();
		System.out.println(element);
		
		
	}

}
