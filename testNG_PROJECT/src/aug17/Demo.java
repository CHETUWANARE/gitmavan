package aug17;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;


public class Demo {
	WebDriver driver;
	@Test
	public void checkTitle()
	{
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://google.com");
		String Expected = "yahoo";
		String Actual = driver.getTitle();
		try {
		Assert.assertEquals(Expected, Actual, "Title is Not Matching");
		}catch(Throwable t)
		{
			System.out.println(t.getMessage());
		}
		
		driver.quit();
		
	}

}
