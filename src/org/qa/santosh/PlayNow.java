package org.qa.santosh;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class PlayNow 
{
	public WebDriver clickAllLinks(WebDriver driver) throws Exception
	{
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);		
		driver.get("https://playnow.com");
		driver.findElement(By.xpath("(//button[@id='show-menu']//span)[4]")).click();
		
		Thread.sleep(2000);
		
		//driver.manage().window().maximize();
		
		List<WebElement> links=driver.findElements(By.xpath("//div[contains(@class,'hidden-md-down')]//ul/li/a"));
		
		int noOfLinks=links.size();
		System.out.println("There are "+noOfLinks+" links");
		for (int i=0;i<=noOfLinks-1;i++)
		{
			
			driver.findElement(By.xpath("(//button[@id='show-menu']//span)[4]")).click();
			driver.findElements(By.xpath("//div[contains(@class,'hidden-md-down')]//ul/li/a")).get(i).click();
		if (!driver.getTitle().isEmpty())
			{
				System.out.println("This is link #"+i+" And Title of the newly opened page is :"+driver.getCurrentUrl());
					
				
			}
			
			else
			{
				System.out.println("There is an error by clicking on "+i+" link");
			}
			
			driver.navigate().back();
			Thread.sleep(1000);
			
		}
		return driver;
			
	}

}
