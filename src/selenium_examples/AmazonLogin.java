package selenium_examples;


import java.util.NoSuchElementException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.chrome.ChromeDriver;

public class AmazonLogin {

public static void main(String[] args) {

System.setProperty("webdriver.chrome.driver", "C:\\Java_WorkSpace\\chromedriver.exe");
ChromeDriver drv = new ChromeDriver();
drv.get("https://www.amazon.ca");
String header = drv.getTitle();
System.out.println("Header is :" + header);
String title = drv.getTitle();
System.out.println("Title is:" + title);
drv.findElementByXPath(".//a[@id='nav-link-accountList']").click();
//Checking if element login element is identified or not
		
		  try { drv.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS) ;
		  drv.findElementByXPath(".//input[@id='ap_email']");//this is where I am having a problem System.out.println("SUCCESS");
		  
		  } catch(NoSuchElementException e) { e.printStackTrace(); }
		 
 drv.findElementByXPath(".//input[@id='ap_email']").sendKeys(
 "shastrysantosh@hotmail.com");
 drv.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS) ;
 //drv.findElementByXPath(".//input[@id='continue')]").click();
 drv.findElementByXPath(".//span[@id='continue-announce']").click();
 drv.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS) ;
 String title1 = drv.getTitle(); 
 drv.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS) ;
 System.out.println("TItle in new window is :" + title1);
 
 drv.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS) ;
 drv.findElementByXPath(".//input[@id='ap_password']").sendKeys("something");
 drv.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS) ;
 drv.findElementByXPath(".//input[@id='signInSubmit']").click();
 
 //I should see invalid login credentials page but I can't get past line number 34

}

}

