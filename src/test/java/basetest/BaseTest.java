package basetest;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;

import pages.HomePage;

public class BaseTest {
	protected WebDriver driver;
	protected HomePage homepage;

	@BeforeMethod
	public void initialize() {
		System.setProperty("webdriver.chrome.driver", "src/main/resources/driver/chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		driver.get("http://hourglass.surge.sh/");
		homepage = new HomePage(driver);
	}
	
	@AfterMethod
	public void quitDriver() {
		driver.close();
		driver.quit();
	}
}