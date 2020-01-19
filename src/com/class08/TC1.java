package com.class08;

import java.util.List;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.NoAlertPresentException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.utils.CommonMethods;
import com.utils.Constants;

public class TC1 extends CommonMethods {

	/*
	 * 
	 * TC 1: Delete Employee
	 * 
	 * 1.Open chrome browser 
	 * 2. Go to “http://166.62.36.207/humanresources/symfony/web/index.php/auth” 
	 * 3. Login into the application
	 * 4. Add Employee 
	 * 5. Verify Employee has been added 
	 * 6. Go to Employee List 
	 * 7. Delete added Employee 
	 * 8. Quit the browser
	 * 
	 */

	public static void main(String[] args) throws InterruptedException {
		
		setUp("chrome", Constants.HRMS_URL);
		driver.findElement(By.id("txtUsername")).sendKeys("Syntax");
		driver.findElement(By.id("txtPassword")).sendKeys("Syntax123!");
		driver.findElement(By.id("btnLogin")).click();
		
		driver.findElement(By.xpath("//b[text()='PIM']")).click();
		
		WebDriverWait wait = new WebDriverWait(driver, 30);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.linkText("Add Employee")));
		driver.findElement(By.linkText("Add Employee")).click();
		
		//Adding a new emplpyee
		
		driver.findElement(By.id("firstName")).sendKeys("MariaTest");
		driver.findElement(By.id("lastName")).sendKeys("MerrimanTest");
		String empID = driver.findElement(By.id("employeeId")).getAttribute("value");
		System.out.println("Employee has been added. Employee ID is: "+empID);
		driver.findElement(By.id("btnSave")).click();
		
		driver.findElement(By.xpath("//b[text()='PIM']")).click();
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("menu_pim_viewEmployeeList")));
		driver.findElement(By.id("menu_pim_viewEmployeeList")).click();
		
		String expectedValue = "MariaTest MerrimanTest";
		
		List<WebElement> tblRows = driver.findElements(By.xpath("//table[@id='resultTable']/tbody/tr"));

		for(int i=1; i<tblRows.size(); i++) {
			String rowText = tblRows.get(i-1).getText();
			if(rowText.contains(expectedValue)) {
				driver.findElement(By.xpath("//table[@id='resultTable']/tbody/tr[" + i + "]/td[1]")).click();
				wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("btnDelete")));
				driver.findElement(By.id("btnDelete")).click();
				Thread.sleep(3000);
				driver.findElement(By.id("dialogDeleteBtn")).click();
				break;
			}
		}
		  driver.findElement(By.xpath("//a[text()='Next']")).click();
		  
			System.out.println("Employee with ID: "+empID+" has been deleted.");
		  
		  Thread.sleep(3000);
	driver.quit();
	}

}
