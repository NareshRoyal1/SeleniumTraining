package TestScripts;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class WebElementMethodsTest {
	WebDriver driver;
  @Test
  public void DispalyMenthod() throws IOException {
	  driver=new ChromeDriver();
	  driver.get("https://automationbookstore.dev/");
	  boolean a=driver.findElement(By.xpath("//a[contains(text(),'Clear text')]")).isDisplayed();
	   System.out.println(a);
	  String b=driver.findElement(By.id("searchBar")).getAttribute("placeholder");
	  
	 // entire screen screenshot
	  TakesScreenshot screen=(TakesScreenshot)driver;
	  File srcImg=screen.getScreenshotAs(OutputType.FILE);
	  String path=System.getProperty("user.dir")+File.separator+"Screenshots"+File.separator+System.currentTimeMillis()+".png";
	  FileUtils.copyFile(srcImg,new File(path));
	  
	  System.out.println(b);
	  driver.findElement(By.xpath("//input[@placeholder='Filter books..']")).sendKeys("abcd");
	  a=driver.findElement(By.xpath("//a[contains(text(),'Clear text')]")).isDisplayed();
	  System.out.println(a);
	  driver.findElement(By.xpath("//a[contains(text(),'Clear text')]")).click();
	  
	  //particular element screenshot
	  WebElement search= driver.findElement(By.xpath("//input[@placeholder='Filter books..']"));
	  File srcImg1=search.getScreenshotAs(OutputType.FILE);
	  String path1=System.getProperty("user.dir")+File.separator+"Screenshots"+File.separator+System.currentTimeMillis()+".png";
	  FileUtils.copyFile(srcImg1,new File(path1));
	  
	  
  }
}
