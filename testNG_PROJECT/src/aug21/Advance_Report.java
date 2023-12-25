package aug21;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

public class Advance_Report {
	private static final String Actual = null;
	WebDriver driver;
	ExtentReports report;
	ExtentTest logger;
	@BeforeTest
	public void generateReport()
	{
		//define part of html report
		report = new ExtentReports("./Reports/Demo.html");
		
	}
	@BeforeMethod
	public void setUp()
	{
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://google.com");
		
		}
	@Test
	public void passTest()
	{
		//test case starts here 
		logger = report.startTest("my test pass");
		logger.assignAuthor("ranga");
		logger.assignCategory("functional");
		String Expected = "google";
		String Actaul = driver.getTitle();
		if (Expected.equalsIgnoreCase(Actual))
		{
			logger.log(LogStatus.PASS, "title is matching::"+expected+"    "+Actual);	
		}
		else
		{
			logger.log(LogStatus.FAIL, "title is not matching::"+expected+"    "+Actual);
			
		}
	}


@Test
public void failTest()
{
	//test case starts here 
	logger = report.startTest("my test pass");
	logger.assignAuthor("ranga");
	logger.assignCategory("functional");
	String Expected = "yahoo";
	string Actaul = driver.getTitle();
	if (Expected.equalsIgnoreCase(Actual))
	{
		logger.log(LogStatus.PASS, "title is matching::"+expected+"    "+Actual);	
	}
	else
	{
		logger.log(LogStatus.FAIL, "title is not matching::"+expected+"    "+Actual);
		
	}
}

@AfterMethod
public void tearDown()
{
	report.endTest(logger);
	report.flush();
	driver.quit();
}}

