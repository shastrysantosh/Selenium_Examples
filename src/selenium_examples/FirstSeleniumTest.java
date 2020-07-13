package selenium_examples;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;	

public class FirstSeleniumTest {

	public static void main(String[] args) {
		ChromeDriver drv=new ChromeDriver();
			
		
		drv.get("https://login.live.com/login.srf?wa=wsignin1.0&rpsnv=13&ct=1580880932&rver=7.0.6737.0&wp=MBI_SSL&wreply=https%3a%2f%2foutlook.live.com%2fowa%2f%3fnlp%3d1%26RpsCsrfState%3d7f768104-c68f-327e-6915-c1814423d72d&id=292841&aadredir=1&CBCXT=out&lw=1&fl=dob%2cflname%2cwld&cobrandid=90015");
		
		String s11=drv.getTitle();
		System.out.println(s11);
		drv.findElement(By.id("i0116"));
		//((WebElement) drv).sendKeys("shastrysantosh@hotmail.com");
		
		
		
		
		//drv.findElement(By.linkText("Next")).click();
		
		//System.out.println(un1);
		
		
		
		
	
		
		
		
		

		//System.out.println(un);
		
		//drv.quit();
		//un.sendKeys("shastrysantosh@hotmail.com);"
				
				
		
		
		
		
		
		
		
		
		
		
		
	//	drv.quit();
		
				
		

	}

}
