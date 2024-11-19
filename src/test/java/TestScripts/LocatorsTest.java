package TestScripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class LocatorsTest {
	WebDriver driver;
  @Test
  public void LogIn() {
	  driver=new ChromeDriver();
	  driver.manage().window().maximize();
	  driver.get("http://the-internet.herokuapp.com/login");
	  WebElement username=driver.findElement(By.id("username"));
	  username.sendKeys("tomsmith");
	  WebElement password=driver.findElement(By.id("password"));
	  password.sendKeys("SuperSecretPassword!");
	  driver.findElement(By.cssSelector("fa fa-2x fa-sign-in"));
	 // driver.findElement(By.id("username")).sendKeys("tomsmith");
	  //driver.findElement(By.id("password")).sendKeys("SuperSecretPassword!");
	  driver.findElement(By.className("radius")).click();
	  //driver.findElement(By.linkText("Elemental Selenium")).click();
	  driver.findElement(By.partialLinkText("Elemental")).click();
	  
	  
	  
  }
}
