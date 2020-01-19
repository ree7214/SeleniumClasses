package com.class09;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.utils.CommonMethods;
import com.utils.Constants;

public class HW1 extends CommonMethods {
	/*
	 * TC 1: Delete Employee
	 * 1.Open chrome browser 
	 * 2. Go to “http://166.62.36.207/humanresources/symfony/web/index.php/auth” 
	 * 3. Login into the application
	 * 4. Add Employee 
	 * 5. Verify Employee has been added 
	 * 6. Go to Employee List 
	 * 7. Delete added Employee 
	 * 8. Quit the browser
	 */
	public static void main(String[] args) throws InterruptedException {
		
		setUp("chrome", Constants.HRMS_URL);
		//login into HRMS
		driver.findElement(By.id("txtUsername")).sendKeys("Syntax");
		driver.findElement(By.id("txtPassword")).sendKeys("Syntax123!");
		driver.findElement(By.id("btnLogin")).click();
		//navigate to add employee
		driver.findElement(By.xpath("//b[text()='PIM']")).click();
		
		WebDriverWait wait = new WebDriverWait(driver, 30);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.linkText("Add Employee")));
		driver.findElement(By.linkText("Add Employee")).click();
		
		//Adding a new emplpyee
		
		String firstName="John";
		String lastName="Smith";
		driver.findElement(By.id("firstName")).sendKeys(firstName);
		driver.findElement(By.id("lastName")).sendKeys(lastName);
		//store an employee id
		String empID = driver.findElement(By.id("employeeId")).getAttribute("value");
		System.out.println("Employee has been added. Employee ID is: "+empID);
		driver.findElement(By.id("btnSave")).click();
		
		//verify employee was added
		String empDetails=driver.findElement(By.id("profile-pic")).getText();
		if (empDetails.equals(firstName+" "+lastName)) {
			System.out.println("Employee added sucessfully");
		}else {
			System.out.println("Emloyee NOT added");
		}
		//navigating to the employee list
		driver.findElement(By.linkText("Employee List")).click();
		//Get the first table from the employee list
		boolean found=false;
		
		while(!found) {
			
		List<WebElement> tblRows = driver.findElements(By.xpath("//table[@id='resultTable']/tbody/tr"));
		for(int i=1; i<=tblRows.size(); i++) {
		String	rowsText=tblRows.get(i-1).getText();
		if(rowsText.contains(empID)) {
			found=true;
			driver.findElement(By.xpath("//table[@id='resultTable']/tbody/tr[" + i + "]/td[1]")).click();
			Thread.sleep(5000);
			driver.findElement(By.id("btnDelete")).click();
			driver.findElement(By.id("dialogDeleteBtn")).click();
			break;
		}
		}
		driver.findElement(By.xpath("//a[text()='Next']")).click();
		Thread.sleep(5000); 
	//	System.out.println("Employee with ID: "+empID+" has been deleted.");
		}
		Thread.sleep(5000);
		driver.quit();
	}
}


		
		
		
		

