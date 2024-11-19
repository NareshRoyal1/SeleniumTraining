package TestScripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class SearchTest {
	WebDriver driver;
  @Test
  public void GoogleSearch() {
	Assert.assertEquals("Google", driver.getTitle());
	System.out.println("Google search method executed");	
	
	  
	  
  }
  @Test
  public void javaGoogleSearch() {
	 
	  
	  driver.get("https://www.google.com/search?q=java+tutorials&rlz=1C1VDKB_enIN1128IN1128&oq=java+tutorials&gs_lcrp=EgZjaHJvbWUyDwgAEEUYORiDARixAxiABDINCAEQABiDARixAxiABDIHCAIQABiABDIHCAMQABiABDIJCAQQABgKGIAEMgcIBRAAGIAEMgkIBhAAGAoYgAQyBwgHEAAYgAQyBwgIEAAYgAQyBwgJEAAYgATSAQg0MTgxajBqNKgCALACAQ&sourceid=chrome&ie=UTF-8/");
	  
	  
	  
	  Assert.assertEquals("java tutorial - Google Search", driver.getTitle());
		System.out.println(" java tutorials Google search method executed");	
	  
	  
  }
	@BeforeTest
	public void start() {
		 driver = new ChromeDriver();
		  driver.manage().window().maximize();
		  driver.get("https://www.google.com/");
	}
	
	@AfterTest
	public void end() {
		driver.close();
		
	}
	
	
	@BeforeSuite
	public void beforeSuite() {
		
System.out.println("Before Suite");		
	}
	@AfterSuite
	public void afterSuite() {
		
System.out.println("after Suite");		
	}
	@BeforeMethod
	public void beforeMethod() {
		System.out.println("before Each method");
	}
	@AfterMethod
	public void afterMethod() {
		System.out.println("after Each method");
	}
	@BeforeClass
	public void beforeclass() {
		System.out.println("before Each class");
	}
	@AfterClass
	public void afterclass() {
		System.out.println("after Each class");
	}
	
	
  
  
}
