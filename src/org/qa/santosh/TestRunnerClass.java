package org.qa.santosh;



import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class TestRunnerClass {

	public static WebDriver readFromConfig()
	{
		
		WebDriver wdrv=new ChromeDriver();
		return wdrv;	
		
	}

	
	public static void main(String[] args) 
	{
		
		//WebDriver wdrv=new ChromeDriver();
		WebDriver wdrv=readFromConfig();
		TestCaseClass tcc=new TestCaseClass();
		tcc.testCaseRun(wdrv);
		wdrv.quit();
		
		
		
		
		

	}

}
