package selenium_examples;
//import org.openqa.grid.selenium.chr
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.*;

import org.openqa.selenium.firefox.FirefoxDriver;

public class UpCastExample {

	public static void main(String[] args)throws Exception {
		
		System.setProperty("webdriver.chrome.driver","C:\\Java_WorkSpace\\chromedriver.exe");
		System.setProperty("webdriver.gecko.driver","C:\\Java_WorkSpace\\geckodriver.exe");
		
	//	WebDriver chrome=new ChromeDriver();
		WebDriver drv=new FirefoxDriver();
		drv=new ChromeDriver();
		
		
		drv.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		drv.get("https://www.playnow.com");
		
		drv.get("https://www.google.ca");
		drv.get("https://www.amazon.ca");
		
		/*
		 * chrome.close(); firefox.close();
		 */
		

	}

}
