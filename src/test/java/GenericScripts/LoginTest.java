// ******************** LOGIN SCRIPTS **********************************
//File Name : LoginTest.java
// Author : Santosh
// Description : This file indicates that Login module testcases related.
// Created On :13-11-2019
// Last Modified On :
// Reviewed By : Diwakar
// Approved By : Diwakar

// Change History
// $Log:LoginTest.java $
// Revision 1.0  13/11/2019 16:33:49  Santosh

// Updated Comments
// Date                   Engineer              Description of change
//13/11/2019			  Santosh				changed sript name validation to LoginTest
//

//*******************************************************************

package GenericScripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;


public class LoginTest {

	
	WebDriver driver = null;
	
	@BeforeTest
	public void setUpTest() {
		//String projectPath = System.getProperty("user.dir");
		//System.setProperty("webdriver.chrome.driver", projectPath+"/drivers/chromedriver/chromedriver.exe");
		driver = new ChromeDriver();
        System.out.println("chromedriver launched");		
        driver.manage().window().maximize();
        
	}
	
	//Test ID: OHRM-01-	To check the login with valid ESS user and valid password.
	@Test
	public void TCOHR001() {
        //Step:1-Open the application URL: https://opensource-demo.orangehrmlive.com/"
        driver.get("http://127.0.0.1/orangehrm/symfony/web/index.php/auth/login");
        System.out.println("browser launched");
        //Step:2. Enter valid ESS user name
		driver.findElement(By.id("txtUsername")).sendKeys("admin");
	    //Step:3. Enter valid ESS password
		driver.findElement(By.id("txtPassword")).sendKeys("admin123");
		//Step: 4. Click on Login button
		driver.findElement(By.id("btnLogin")).click();
        System.out.println("Login Done with Submit");
        //Expected Result: User can see "Personal Details/Welcome" page
        if(driver.getPageSource().contains("Welcome Admin"))
        {
          System.out.println("Pass");
        }
        	else
        {
          System.out.println("Fail");
        }
        
        driver.findElement(By.linkText("PIM")).click();
    }
	
	//Test ID: OHRM-02-	To check th	e login with valid ESS user and valid password.
	@Test
    public void TCOHR002() {
        //Step:1-Open the application URL: https://opensource-demo.orangehrmlive.com/"
        driver.get("http://127.0.0.1/orangehrm/symfony/web/index.php/auth/login");
        System.out.println("browser launched");					
        //Step:2. Enter valid ESS user name
		driver.findElement(By.id("txtUsername")).sendKeys("admin");
	    //Step:3. Enter valid ESS password
		driver.findElement(By.id("txtPassword")).sendKeys("admin123");
		//Step: 4. Click on Login button
		driver.findElement(By.id("btnLogin")).click();
        System.out.println("Login Done with Submit");
        //Expected Result: User can see "Personal Details/Welcome" page
        if(driver.getPageSource().contains("Welcome Admin"))
        {
          System.out.println("Pass");
        }
        	else
        {
          System.out.println("Fail");
        }
        
        driver.findElement(By.linkText("PIM")).click();
    }
        @AfterTest
        public void tearDownTest() {
        driver.close();
		driver.quit();
		System.out.println("test completed successfully");
		//extent.flush();
	}
}