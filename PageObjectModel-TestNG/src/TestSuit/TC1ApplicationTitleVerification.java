package TestSuit;

import org.testng.annotations.Test;

import ListOfInputElements.InputFields;

import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;
import SetBrowser.SelectAndOpenBrowser;

public class TC1ApplicationTitleVerification {
	static WebDriver driver;
	static Logger log = Logger.getLogger("deloyinglogeer");

@Test
public void validatetittle() {
	//SelectAndOpenBrowser.SelectBrowser("Mozila","https://www.timeanddate.com/weather/");
	InputFields.allElements();
	 }		
		}

