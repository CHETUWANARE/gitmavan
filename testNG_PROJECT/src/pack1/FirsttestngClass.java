package pack1;

import org.openqa.selenium.By;
import org.testng.Reporter;
import org.testng.annotations.Test;

import config.AppUtiil;

public class FirsttestngClass extends AppUtiil {
	@Test
	public void pbanking()
	{
		driver.findElement(By.xpath("(//img[@id='IMG3'])[1]")).click();
		Reporter.log("Executeing pbanking Test",true);
		
	}
	
	@Test
	public void ibanking()
	{
		driver.findElement(By.xpath("(//img)[6]")).click();
		Reporter.log("Executeing ibanking Test",true);
		
	}	
	@Test
	public void cbanking()
	{
		driver.findElement(By.xpath("(//img)[5]")).click();
		Reporter.log("Executeing cbanking Test",true);
		
	}
}
