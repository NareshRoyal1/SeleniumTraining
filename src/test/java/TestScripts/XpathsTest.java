package TestScripts;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class XpathsTest {
	WebDriver driver;
  @Test
  public void f() {
	  driver =new ChromeDriver();
	 
	  driver.get("https://accounts.lambdatest.com/register");
  }
}
