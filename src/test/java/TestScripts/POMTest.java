package TestScripts;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class POMTest {
	WebDriver driver;
  @Test
  public void pageLaunch() {
	  driver =new ChromeDriver();
	  driver.manage().window().maximize();
	  driver.get("https://www.saucedemo.com");
  }
}
