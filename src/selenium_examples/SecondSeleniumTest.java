package selenium_examples;
import org.openqa.selenium.*;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.chrome.ChromeDriver;


public class SecondSeleniumTest {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "C:\\Java_WorkSpace\\chromedriver.exe");
		ChromeDriver drv = new ChromeDriver();
		drv.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		drv.get("https://www.amazon.ca");
		String header = drv.getTitle();
		System.out.println("Header is :" + header);
		String title = drv.getTitle();
		System.out.println("Title is:" + title);
		drv.findElement(By.xpath(".//a[@id='nav-link-accountList']")).click();		  
		drv.findElement(By.xpath(".//input[@id='ap_email']")).sendKeys("test@hotmail.com"); 
		drv.findElement(By.xpath(".//span[@id='continue'][@class='a-button a-button-span12 a-button-primary']")).click();		
		drv.findElementByXPath(".//input[@id='ap_password']").sendKeys("something");
		drv.findElementByXPath(".//input[@id='signInSubmit']").click();
		drv.findElementByXPath(".//a[@id='nav-orders']").click();		
		drv.findElementByXPath(".//a[@href ='/Best-Sellers-generic/zgbs/?ref_=nav_cs_bestsellers']").click();
		System.out.println("SUCCESS");
	}

}
