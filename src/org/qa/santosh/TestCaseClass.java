package org.qa.santosh;

import org.openqa.selenium.WebDriver;

public class TestCaseClass 
{
	WebDriver wd;
	
	public WebDriver testCaseRun(WebDriver drv)
	{
		wd=drv;
		System.out.println("THis is member methods in Test Case Class");
		wd.navigate().to("https://google.ca");
		String url=wd.getCurrentUrl();
		System.out.println("URL of Current Open page is :"+url);
		int lengthOfCurrentPageSource=wd.getPageSource().length();
		System.out.println("Length of Current Page Source is :"+lengthOfCurrentPageSource);
		System.out.println("Current Page Title is :"+wd.getTitle());
		System.out.println("Hashcode value is :"+wd.hashCode());
			
		return wd;			
	}

}
