package TestScripts;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class MouseActionsTest {
	WebDriver driver;
	
  @Test
  public void MouseActions() throws InterruptedException {
	  
	  ChromeOptions options=new ChromeOptions();
	 // options.addArguments("--blink-settings=imageEnabled=false");
	  WebDriver driver= new ChromeDriver(options);
	 // driver=new ChromeDriver();
	  driver.manage().window().maximize();
	  Actions actions=new Actions(driver);
	  driver.get("https://demo.opencart.com/");
	  Thread.sleep(5000);
		/*
		 * actions.scrollToElement(driver.findElement(By.
		 * xpath("//a[contains(text(),'Terms & Conditions')]"))).perform();
		 * Thread.sleep(5000);
		 */
	 WebElement search= driver.findElement(By.name("search"));
	 List<WebElement>items=driver.findElements(By.cssSelector("ul.nav.navbar-nav > li:nth-child(3) ul.list-unstyled > li"));
	int numItems=items.size();
	for(int i=0;i<numItems;i++) {
		WebElement item=items.get(i);
		if(item.getText().equalsIgnoreCase("Monitors (2)")) {
			item.click();
			break;
		}
	}
	 
	 //right click
	 actions.contextClick(search).perform();  
	 Thread.sleep(5000);
	 WebElement components=driver.findElement(By.xpath("//a[contains(text(),'Components')]"));
	 actions.moveToElement(components).perform();
	 Thread.sleep(5000);
	 WebElement Menuitem=driver.findElement(By.xpath("//a[contains(text(),'Monitors (2)')]"));
	 actions.click(Menuitem).perform();
	 driver.get("https://www.stqatools.com/demo/DoubleClick.php");
	 WebElement DoubleClick=driver.findElement(By.xpath("//button[contains(text(),'Click Me / Double Click Me!')]"));
	 actions.doubleClick(DoubleClick).perform();
	 actions.doubleClick(DoubleClick).doubleClick(DoubleClick).perform();
	 
	
	 
	 
  }
  
}
