package org.qa.santosh;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;


public class GoogleSearchTest {

	public WebDriver run(WebDriver driver)  
	{
		driver.manage().timeouts().implicitlyWait(15,TimeUnit.SECONDS);
		driver.get("https://www.google.ca");
		
		  try { Thread.sleep(1000); } catch (InterruptedException e) {
		  
		  e.printStackTrace(); }
		 
		WebElement we=driver.findElement(By.xpath(".//input[@class='gLFyf gsfi']"));
		we.sendKeys("WebDriver",Keys.ENTER);
		
		String s=driver.findElement(By.xpath(".//input[@value='gLFyf gsfi']")).getText();
		
		
		
		  try { Thread.sleep(1000); } catch (InterruptedException e) {
		  
		  e.printStackTrace(); }
		 
		
		//driver.findElement(By.xpath(".//input[@class='gNO89b']")).click();
		
		  try { Thread.sleep(1000); } catch (InterruptedException e) {
		  
		  e.printStackTrace(); }
		  
		  
		  
		  
		  
		 
		/*
		 * System.out.println("Current Page URL is :"+driver.getCurrentUrl());
		 * System.out.println("Title of the current page is :"+driver.getTitle());
		 * 
		 * List<WebElement> listCite=driver.findElements(By.tagName("cite"));
		 * System.out.println("There are :"+driver.getTitle());
		 * 
		 * 
		 * for(WebElement ele:listCite) {
		 * 
		 * System.out.println(ele.getText()); }
		 * 
		 * 
		 * 
		 */		return driver;
		
	}
	
}
