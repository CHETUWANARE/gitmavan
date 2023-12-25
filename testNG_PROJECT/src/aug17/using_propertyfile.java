package aug17;

import java.io.FileInputStream;
import java.time.Duration;
import java.util.Properties;

import javax.xml.xpath.XPath;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class using_propertyfile {
	Properties conpro;
	WebDriver driver;
	@Test
	public void statTest()
	{
		conpro = new Properties();
		
		// load file
		conpro.load(new FileInputStream("login.properties"));
		driver =new ChromeDriver();
		driver.manage().window().maximize();
		driver.get(conpro.getProperty("Url"));
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.findElement(By.xpath(conpro.getProperty("objuser"))).sendKeys(conpro.getProperty("enteruser"));
		driver.findElement(By.xpath(conpro.getProperty("Objpass"))).sendKeys(conpro.getProperty("enterpass"));
		driver.findElement(By.xpath(conpro.getProperty("Objlogin"))).click();
		driver.quit();
	}

}
