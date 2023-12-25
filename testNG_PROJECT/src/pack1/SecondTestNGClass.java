package pack1;

import org.openqa.selenium.By;
import org.testng.Reporter;
import org.testng.annotations.Test;

import config.AppUtiil;

public class SecondTestNGClass extends AppUtiil{
	@Test
	public void addition()
	{
		driver.findElement(By.name("display")).sendKeys("98765");
		driver.findElement(By.xpath("(//input[@id='btn'])[6]")).click();
		driver.findElement(By.name("display")).sendKeys("8765");
		driver.findElement(By.xpath("(//input[@id='btn'])[20]")).click();
		//CAPTURE RESULT VALUE
		String Addres= driver.findElement(By.name("display")).getAttribute("value");
	Reporter.log(Addres+"   "+"Executing Addition Test",true);	
	}
	@Test
	public void multiplication()
	{
		driver.findElement(By.name("display")).sendKeys("98765");
		driver.findElement(By.xpath("(//input[@id='btn'])[16]")).click();
		driver.findElement(By.name("display")).sendKeys("8765");
		driver.findElement(By.xpath("(//input[@id='btn'])[20]")).click();
		//CAPTURE RESULT VALUE
		String Addres= driver.findElement(By.name("display")).getAttribute("value");
	Reporter.log(Addres+"   "+"Executing multification Test",true);	
	}
	@Test
	public void division()
	{
		driver.findElement(By.name("display")).sendKeys("98765");
		driver.findElement(By.xpath("(//input[@id='btn'])[21]")).click();
		driver.findElement(By.name("display")).sendKeys("8765");
		driver.findElement(By.xpath("(//input[@id='btn'])[20]")).click();
		//CAPTURE RESULT VALUE
		String Addres= driver.findElement(By.name("display")).getAttribute("value");
	Reporter.log(Addres+"   "+"Executing division Test",true);	
	}
}
