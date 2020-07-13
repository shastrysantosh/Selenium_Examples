package org.qa.santosh;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class PlayNowTestRunner 
{

	public static void main(String[] args) throws Exception 
	{
		WebDriver driver=new ChromeDriver();
		
		
		  PlayNow pn=new PlayNow();
		  pn.clickAllLinks(driver);
		 
		/*
		 * PlayNowV2 pnv=new PlayNowV2(); pnv.run(driver);
		 */
		
		driver.quit();
		
	}

}
