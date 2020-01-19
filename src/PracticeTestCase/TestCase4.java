package PracticeTestCase;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestCase4 {
	static int count;
	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.amazon.com/");
	List<WebElement> alllinks = driver.findElements(By.tagName("a"));
		for (WebElement elm : alllinks) {
			String text = elm.getText();
			if (text != null) {
				System.out.println(text);
			 count = text.length();
			}
		}
		System.out.println(count);
	}

}
