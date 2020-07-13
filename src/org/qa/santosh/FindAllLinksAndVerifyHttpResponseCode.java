package org.qa.santosh;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class FindAllLinksAndVerifyHttpResponseCode 
{
	
	public WebDriver run(WebDriver driver) throws MalformedURLException, IOException
	{
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get("https://amazon.ca");
		List<WebElement> elements = driver.findElements(By.xpath(".//div[@class='navFooterVerticalRow navAccessibility']//ul//li/a"));
		
		int size=elements.size();
		
		HttpURLConnection huc=null;
		for (int i=0;i<size;i++)
		{
			String url=elements.get(i).getAttribute("href");
			huc=(HttpURLConnection) (new URL(url).openConnection());
			huc.connect();
			String obj=huc.getHeaderField(10);
			
			System.out.println(obj);
			
					
			if (huc.getResponseCode()<400)
			{
				System.out.println(huc.getResponseCode()+" ==> PASS "+url+" is not Broken");
			}
			else
			{
				System.out.println(url+" is Broken");
			}
		}
			huc.disconnect();
		System.out.println("Total of all "+size+" links returned <400 HTTPS Response Code");	
			

		
			return driver;
		
		
	}

}
