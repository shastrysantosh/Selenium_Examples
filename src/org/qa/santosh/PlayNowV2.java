package org.qa.santosh;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class PlayNowV2 
{
	public WebDriver run(WebDriver driver) throws InterruptedException
	{
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		driver.get("https://playnow.com");
		driver.manage().window().maximize();
		//driver.findElement(By.xpath("//li[@id='nav-bingo']//a[@href='/bingo/']")).click();
		
		  List<WebElement> we=driver.findElements(By.xpath(
		  "//ul//li[@class='global-head__nav__menu__top-level']/a"));
		  int size=we.size();
		  System.out.println(size);
		  
		  for(int i=0;i<size;i++) {
		  
		  driver.findElements(By.xpath(
		  "//ul//li[@class='global-head__nav__menu__top-level']/a")).get(i).click();
		  
		  System.out.println("Page URL is :"+driver.getCurrentUrl());
		  Thread.sleep(1000);
		  
		  } driver.navigate().back();
		  
		  
		 		
		
				
		return driver;
		
		
	}
	

}
