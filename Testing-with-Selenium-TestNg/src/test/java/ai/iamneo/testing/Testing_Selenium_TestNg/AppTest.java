package ai.iamneo.testing.Testing_Selenium_TestNg;

import org.testng.annotations.Test;
import java.net.URL;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.BeforeTest;
import org.testng.Assert;
import org.testng.annotations.AfterTest;

public class AppTest {

	ChromeOptions chromeOptions = new ChromeOptions();
	WebDriver driver = null;

	@BeforeTest
	public void beforeTest() throws Exception
	 {
		driver = new RemoteWebDriver(new URL("http://localhost:4444"), chromeOptions);
		driver.manage().window().maximize();
		driver.get("https://iamneo.ai");
		Thread.sleep(100);
	}

	@Test
//Checking the title of iamNeo (Home - iamneo)
	public void iamNeo() throws InterruptedException 
	{

		String title =driver.getTitle();
		Assert.assertEquals(title, "");
	}
	@Test
//Moving to FACEBOOK
	public void nextPage() throws InterruptedException 
	{
		driver.navigate().to("https://www.facebook.com");
	}
	@Test
//Back to iamNeo
	public void backPage() throws InterruptedException 
	{
		driver.navigate().back();
	}
	@Test
//Current URL
public void currentURL() throws InterruptedException 
{
		 String title ="Get your title";
		Assert.assertEquals(title, "");

}

	@AfterTest
	public void afterTest() 
	{
		driver.quit();
	}

}
