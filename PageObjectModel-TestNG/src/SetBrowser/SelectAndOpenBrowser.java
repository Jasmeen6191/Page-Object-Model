package SetBrowser;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.safari.SafariDriver;
import org.testng.annotations.Test;
import org.testng.asserts.*;
import org.testng.asserts.SoftAssert;


public class SelectAndOpenBrowser {
	WebDriver driver;

	SoftAssert soft = new SoftAssert();
	public SelectAndOpenBrowser(WebDriver driver){
		this.driver = driver;
		
	}
	@Test
	public  void SelectBrowser(String BrowserName, String url, String ExpectedTitle) {
		
			if (BrowserName.equalsIgnoreCase("Mozila"))
			{
				driver = new FirefoxDriver();
				System.out.print("Browser Launched");
			}
			if (BrowserName.equalsIgnoreCase("Chrome")) 
			{
				driver = new ChromeDriver();
				System.out.print("Browser Launched");

			}
			if (BrowserName.equalsIgnoreCase("Safari"))
			{
				driver = new SafariDriver();
				System.out.print("Browser Launched");
			}
			driver.manage().window().maximize();
			driver.get(url);
			System.out.println("Application URL enetered");
		String ActualTitle=	driver.getTitle();
		System.out.println("Title is :   "+ActualTitle);
		soft.assertEquals(ExpectedTitle, ActualTitle ,"Title mismatch");
		soft.assertAll();
		  }	
	public void quitsession()
	{
		driver.quit();
	}
	
}
