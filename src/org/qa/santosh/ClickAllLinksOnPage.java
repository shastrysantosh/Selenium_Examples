package org.qa.santosh;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;



public class ClickAllLinksOnPage 
{
	public void navigateThroughAllPages(WebDriver driver) throws InterruptedException
	{
		driver.get("https://www.amazon.ca");
		
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		List<WebElement> element=driver.findElements(By.xpath(".//div[@class='navFooterVerticalRow navAccessibility']//ul//li//a"));
		int noOfLinks=element.size();
		
		
		  for (int i=0;i<noOfLinks;i++) 
		  {
		  //waitElement(driver,element.get(i),2).click(); //element.get(i).click();
			  Thread.sleep(2000);
		  driver.findElements(By.xpath(".//div[@class='navFooterVerticalRow navAccessibility']//ul//li//a")).get(i).click(); //Thread.sleep(2000);
		  
		  if (!driver.getTitle().isEmpty()) 
		  {
		  System.out.println("This is Link# "+" "+i+" "+driver.getTitle()+"==> Pass"); 
		  }else 
		  {
		  System.out.println("Fail"); 
		  } 
		  driver.navigate().back();
		 
		}
	}
}
	
	/*
	 * public static WebElement waitElement(WebDriver driver, WebElement ele, long
	 * timeout) { return new WebDriverWait(driver, timeout).
	 * ignoring(StaleElementReferenceException.class).
	 * until(ExpectedConditions.elementToBeClickable(ele));
	 * 
	 * }
	 */
	 

