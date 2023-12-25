package config;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

public class AppUtiil {
	public static WebDriver driver;
	
@BeforeTest
public static void setup()
{
	driver= new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().deleteAllCookies();
	driver.get("http://primusbank.qedgetech.com/");
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	Reporter.log("Running precondition",true);
}
@AfterTest
public static void teardown()
{
	Reporter.log("Reporter postCondition",true);
	driver.quit();
	

	

	
}
}
