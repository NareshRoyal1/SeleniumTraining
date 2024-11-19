package TestScripts;


import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;

public class BrowserLaunchTest {
	WebDriver driver;
  @Test
  public void GoogleChromeLaunch() {
	  driver=new ChromeDriver();
		
		/*
		  ChromeOptions options= new ChromeOptions();
		  options.addArguments("--headless"); 
		  options.setBrowserVersion("130");
		  driver=new ChromeDriver(options);
		 */
		 
	  driver.manage().window().maximize();
	  
	
	  driver.get("https://www.google.com/");
	 // driver.navigate().to("https://www.google.com/");
	  WebElement searchBox=driver.findElement(By.id("APjFqb"));
	  //WebElement searchBox=driver.findElement(By.className("gLFyf"));
	  //WebElement searchBox=driver.findElement(By.name("q"));
	  //WebElement searchBox=driver.findElement(By.tagName("textarea"));
	  
	  searchBox.sendKeys("Java Tutorial");
	  searchBox.sendKeys(Keys.ENTER);
	 System.out.println("Title is: "+driver.getTitle());
	 driver.navigate().back();
	 System.out.println("Title after backward is: "+driver.getTitle());
	 driver.navigate().refresh();
	 driver.navigate().forward();
	 System.out.println("Title after farward is: "+driver.getTitle());
	 System.out.println("current URL is:"+  driver.getCurrentUrl());
	 
	 System.out.println("source code is:"+  driver.getPageSource());
	
	 
	 
	  
	  driver.close();
	  
	  
  }
}
