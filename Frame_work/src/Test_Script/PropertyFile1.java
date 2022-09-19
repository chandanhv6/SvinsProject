package Test_Script;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.testng.annotations.Test;

public class PropertyFile1
{
	@Test
	public void state1() throws FileNotFoundException, IOException
	{
		Properties p = new Properties();
		p.load(new FileInputStream("./p.property"));
		String s = p.getProperty("baseurl");
		System.out.println(s);
	}


}
