package selenium_examples;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;



public class MozillaTest {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.gecko.driver", "C:\\Java_WorkSpace\\geckodriver.exe");
		WebDriver drv=new FirefoxDriver();
		drv.get("http://demo.guru99.com/test/newtours/");
		//drv.wait();
		
		drv.quit();	
		

	}

}
