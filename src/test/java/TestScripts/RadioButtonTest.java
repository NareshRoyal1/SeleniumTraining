package TestScripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class RadioButtonTest {
	WebDriver driver;
  @Test
  public void RadioButton() throws InterruptedException {
	  driver=new ChromeDriver();
	  driver.get("https://demoqa.com/automation-practice-form");
	  driver.manage().window().maximize();
	  Thread.sleep(2000);
	  boolean a=driver.findElement(By.xpath("//input[@id='gender-radio-1']")).isSelected();
	  driver.findElement(By.xpath("//input[@id='gender-radio-1']")).click();
	  driver.findElement(By.xpath("//input[@id='hobbies-checkbox-2']"));
  }
}
