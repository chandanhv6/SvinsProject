package Generic_Script;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class Base_Test implements FrameWork_Constants
{
	public WebDriver driver;
	@BeforeMethod
	public void openAppl()
	{
		System.setProperty(Gecko_key,Gecko_value);
		driver=new FirefoxDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		
		driver.get(Base_url);
	}
	
	@AfterMethod
	public void closeAppl() throws InterruptedException
	{
		Thread.sleep(5000);
		driver.close();
	}
	

}
