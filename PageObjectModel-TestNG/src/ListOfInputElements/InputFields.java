package ListOfInputElements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

import SetBrowser.SelectAndOpenBrowser;

import java.util.List;

public class InputFields {
	static WebDriver driver;	
	
	
	public static void allElements(){
driver =new FirefoxDriver();
driver.get("http://www.google.com");
List<WebElement> txtfields = driver.findElements(By.xpath("//a"));
		System.out.println(Integer.toString(txtfields.size())+"   element/s found ");
		for(WebElement el: txtfields)
		{
			System.out.println(el.getTagName()+"::::"+el.getText());
			
			
		}
	}

}
