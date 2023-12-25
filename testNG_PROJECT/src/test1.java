import java.sql.Driver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;


public class test1 {
	@Test
	public void createaccount() {
		String str1= "hello";
		String str2="hi";
		
		Assert.assertNotEquals(str1, str2);
	
	}
	
		WebDriver driver;
	@Test
	public void checkTitle() {
		driver=new ChromeDriver();
		driver.get("https://www.google.com/");
		String Expected="yahoo";
		String Actual=driver.getTitle();
		try {
			Assert.assertTrue(Expected.equalsIgnoreCase(Actual), "title is not matching");
		}
		catch (Throwable t )
		{
			System.out.println(t.getMessage());
		}
		driver.quit();
		}
		
		
	}
	
		
	
	
	
   


