package PracticeTestCase;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Task5 {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver","drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://newtours.demoaut.com/");
		driver.findElement(By.xpath("//a[contains(text(),'REGISTER')]")).click();
		driver.findElement(By.xpath("//input[@name='firstName']")).sendKeys("Maria");
		driver.findElement(By.xpath("//input[@name='lastName']")).sendKeys("Merriman");
		driver.findElement(By.xpath("//input[@name='phone']")).sendKeys("703-555-4444");
		driver.findElement(By.xpath("//input[@name='email']")).sendKeys("maria@google.com");
		driver.findElement(By.xpath("//input[@name='address1']")).sendKeys("123 Hickory Lane");
		driver.findElement(By.xpath("//input[@name='city']")).sendKeys("WoodBridge");
		driver.findElement(By.xpath("//input[@name='state']")).sendKeys("Virginia");
		driver.findElement(By.xpath("//input[@name='postalCode']")).sendKeys("22192");
		driver.findElement(By.xpath("//input[@id='email']")).sendKeys("maria@google.com");
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys("abc123");
		driver.findElement(By.xpath("//input[@name='confirmPassword']")).sendKeys("abc123");
		driver.findElement(By.xpath("//input[@name='register']")).submit();
	}
}
