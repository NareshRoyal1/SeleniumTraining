package TestScripts;

import java.io.File;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class FileUploadTest {
	WebDriver driver;
  @Test
  public void fileUpload() {
	  driver=new ChromeDriver();
	  driver.get("https://blueimp.github.io/jQuery-File-Upload/");
	  WebElement upload=driver.findElement(By.xpath("//input[@type='file']"));
	  String path=System.getProperty("user.dir")+File.separator+"FileUpload.png";
	  upload.sendKeys(path);
	  driver.close();
	  
  }
}
