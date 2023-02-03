package tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
//simport org.openqa.selenium.firefox.FirefoxDriver;
//import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;

import org.testng.annotations.BeforeTest;


public class TestBase {
	public  WebDriver driver;

	
	@BeforeTest
	public void StartDriver()
	{


		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") + "//drivers//chromedriver.exe");
		driver = new ChromeDriver();
		driver.navigate().to("https://www.booking.com/‏");
		driver.manage().window().maximize();

	}


	@AfterTest

	public void EndDriver()
	{
		driver.quit();
	}
}
