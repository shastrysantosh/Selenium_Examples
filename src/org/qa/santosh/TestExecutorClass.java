package org.qa.santosh;



import java.io.IOException;
import java.net.MalformedURLException;

import org.openqa.selenium.WebDriver;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class TestExecutorClass
{

	public static void main(String[] args) throws InterruptedException, MalformedURLException, IOException 
	{
		
		WebDriver driver=new ChromeDriver();
		
		//Below Class is for ClickAllLinksOnPage
		
		/*
		 * ClickAllLinksOnPage calop=new ClickAllLinksOnPage();
		 * calop.navigateThroughAllPages(driver);
		 */
		 
		//Below Class is for GoogleSearchTest
		 
		 
		 
		 
		  GoogleSearchTest gst=new GoogleSearchTest(); gst.run(driver);
		  
		  //Below class is for checking all links in page returns status code<400
		/*
		 * FindAllLinksAndVerifyHttpResponseCode httpresp=new
		 * FindAllLinksAndVerifyHttpResponseCode();
		 * 
		 * httpresp.run(driver);
		 */
		  
		  
		 
		//driver.quit();
	}

}
