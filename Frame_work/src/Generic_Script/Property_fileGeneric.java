package Generic_Script;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.testng.annotations.Test;

public class Property_fileGeneric 
{
	@Test
	public void state1(String key,String path) throws FileNotFoundException, IOException
	{
		Properties p = new Properties();
		p.load(new FileInputStream(path));
		String s = p.getProperty(key);
		System.out.println(s);
	}

}
