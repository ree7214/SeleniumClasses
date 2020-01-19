package SeleniumReviewClasses;

import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import com.utils.CommonMethods;
import com.utils.Constants;

public class Task3 extends CommonMethods {

	public static void main(String[] args) {
		
		CommonMethods.setUp("chrome", Constants.welcomeToTheInternet_URL);

		List<WebElement> element=driver.findElements(By.tagName("a"));
		int elementSize=element.size();
		System.out.println(elementSize);
		
		Iterator<WebElement> it = element.iterator();
		while(it.hasNext()) {
			WebElement txt=it.next();
			
			System.out.println(txt.getText()+" = "+ txt.getAttribute("href"));
		}
		driver.close();
		}
	}


