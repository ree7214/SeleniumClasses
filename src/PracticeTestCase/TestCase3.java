package PracticeTestCase;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestCase3 {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "drivers//chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.facebook.com/");
		driver.findElement(By.id("email")).sendKeys("ree7214@gmail.com");
		driver.findElement(By.id("pass")).sendKeys("Mikenree22");
		driver.findElement(By.xpath("//input[@id='u_0_b']")).click();
	}
}
