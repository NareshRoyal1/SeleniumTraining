package TestScripts;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class TableInspectionTest {
	WebDriver driver;
	
  @Test
  public void f() {
	  driver= new ChromeDriver();
	  driver.get("https://testautomationpractice.blogspot.com/");
	  
	  List<WebElement>items=driver.findElements(By.xpath("//td[contains(text(),'Master In Selenium')]//following-sibling::td"));
	System.out.println("no of elements are ..."+items.size());
	for (WebElement i:items) {
		System.out.println(i.getText());
		
	}
	List<WebElement>items1=driver.findElements(By.xpath("//td[contains(text(),'3000')]//preceding-sibling::td"));
	System.out.println("no of elements are ..."+items.size());
	for (WebElement i:items) {
		System.out.println(i.getText());
		
	}
	List<WebElement>items2=driver.findElements(By.xpath("//table[@id='productTable']//descendant::td"));
	System.out.println("no of elements are ..."+items.size());
	for (WebElement i:items2) {
		System.out.println(i.getText());
		
	}
	
	List<WebElement> items3=driver.findElements(By.xpath("//table[@id='productTable']//descendant::tr"));
	System.out.println("no of elements are ..."+items.size());
	for (WebElement i:items3) {
		System.out.println(i.getText());
		
	}
	
  }
}
