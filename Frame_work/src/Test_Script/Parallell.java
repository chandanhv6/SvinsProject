package Test_Script;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import Generic_Script.Base_Test;

public class Parallell 
{
		public WebDriver driver;
		@Parameters({"browser"})
		@Test
		public void execution1(String browser) 
		{
			System.setProperty("webdriver.gecko.driver","./softwares/geckodriver.exe");
			System.setProperty("webdriver.chrome.driver","./softwares/chromedriver.exe");
			
			if(browser.equals("chrome"))
			{
				driver=new ChromeDriver();
			}
			else
			{
				driver=new FirefoxDriver();
			}
			driver.get("http://www.google.com");
			
		}

}
