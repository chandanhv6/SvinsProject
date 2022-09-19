package Generic_Script;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Generic_Excel 
{
	public static String getData(String sheet,int row,int cell) throws EncryptedDocumentException, IOException 
	{
		FileInputStream fis = new FileInputStream("./Excel/data.xlsx");
		Workbook book = WorkbookFactory.create(fis);
		String value = book.getSheet(sheet).getRow(row).getCell(cell).toString();
		return value;
	}
	
}
