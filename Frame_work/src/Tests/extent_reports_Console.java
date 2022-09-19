package Tests;

import org.testng.annotations.Test;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

public class extent_reports_Console 
{
	@Test
	public void et_test1()
	{
		//create an object for ER
		ExtentReports reports = new ExtentReports("./reports/er.html",false);
		
		//start execution
		ExtentTest test = reports.startTest("TestCase1");
		
		//log Status
		test.log(LogStatus.PASS,"TestCase passed");
		test.log(LogStatus.SKIP,"TestCaseSkipped");
		test.log(LogStatus.FAIL,"TestCase failed");
		
		//Stop the execution
		reports.endTest(test);
		
		//clear junk files
		reports.flush();
		
	}

}
