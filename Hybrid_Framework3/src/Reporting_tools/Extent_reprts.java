package Reporting_tools;

import org.testng.annotations.Test;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

public class Extent_reprts 
{
  @Test
  public void test1()
  {
	  ExtentReports rep=new ExtentReports("./reports/rep1.html");
	  
	  ExtentTest test=rep.startTest("TC1");
	  
	  test.log(LogStatus.PASS,"pass"); //if TC is passed, to print messagr as pass
	  test.log(LogStatus.FAIL,"fail"); //if TC is failed, to print messagr as fail
	  test.log(LogStatus.SKIP,"skip"); //if TC is skipped, to print messagr as skip
	  
	  rep.endTest(test);
	  
	  rep.flush();
	  
	  
  }
}
