package TestScripts;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class DropdownTest {
	WebDriver driver;
  @Test
  public void DropdownTest() throws InterruptedException {
	  driver=new ChromeDriver();
	  driver.get("https://www.stqatools.com/demo/Multiselect.php");
	  Thread.sleep(5000);
	  
	  Select dateSel=new Select(driver.findElement(By.cssSelector("select.date_s")));
	  Thread.sleep(5000);
	  List<WebElement> years=dateSel.getOptions();
	  for(WebElement year:years) {
		  System.out.println(year.getText());
		  
	  }
	  
	  dateSel.selectByValue("1983");
	  Select nameSel=new Select(driver.findElement(By.cssSelector("select.name_s")));
	  Thread.sleep(5000);
	  nameSel.selectByIndex(0);
	  Thread.sleep(5000);
	  nameSel.selectByValue("Jonas");
	  Thread.sleep(5000);
	  nameSel.selectByVisibleText("Gustaf");
	  List<WebElement> names=nameSel.getAllSelectedOptions();
	  for(WebElement name:names) {
		  System.out.println(name.getText());
		  
		  
	  }
	  
  }
}
