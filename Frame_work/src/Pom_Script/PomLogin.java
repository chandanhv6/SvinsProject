package Pom_Script;


import javax.xml.xpath.XPath;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PomLogin 
{
	// declaration
	@FindBy(xpath="//input[@id='login-username' and @name='username']")
	private WebElement uName_tbox;
	
	@FindBy(xpath="//input[@id='login-signin' and @value='Next']")
	private WebElement unnexBtn;
	
	@FindBy(xpath="//button[@id='login-signin' and @value='Next']")
	private WebElement pwnexBtn;
	
	@FindBy(xpath="//input[@id='login-passwd' and @name='password']")
	private WebElement pWord_tbox;
	
	
	//intilization
		public PomLogin(WebDriver driver)
		{
			PageFactory.initElements(driver,this);
		}
		
		//utilization
		public void UsernameTbox(String un)
		{
			uName_tbox.sendKeys(un);
		}
		
		public void PassWordTbox(String pwd)
		{
			pWord_tbox.sendKeys(pwd);
		}

		public void Un_nextBtn()
		{
			unnexBtn.click();
		}
		public void Pw_nextBtn()
		{
			pwnexBtn.click();
		}
	

}
