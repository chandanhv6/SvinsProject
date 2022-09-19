package Test_Script;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;

import Generic_Script.Base_Test;
import Generic_Script.Generic_ScreenShoot;
import Pom_Script.PomLogin;

public class LinkedIn_Scripts extends Base_Test
{
	
	@Test
	public void Lunch() throws InterruptedException, IOException
	{
		PomLogin p=new PomLogin(driver);
		p.UsernameTbox("chandanhv6@yahoo.com");
		p.Un_nextBtn();
		p.PassWordTbox("chandu@123");
		Thread.sleep(2000);
		p.Pw_nextBtn();
		
	}
}
