package Generic_Script;

import java.io.File;
import java.io.IOException;

import java.util.Date;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

public class Generic_ScreenShoot 
{
	public void screenShotAs(WebDriver d) throws IOException 
	{
		Date T=new Date();
		TakesScreenshot ts=(TakesScreenshot)d;
		File src = ts.getScreenshotAs(OutputType.FILE);
		String fn = T.toGMTString().replaceAll(" ","_");
		File des = new File(".\\photo\\"+fn+".png");
		FileUtils.copyFile(src,des);
	}


}
