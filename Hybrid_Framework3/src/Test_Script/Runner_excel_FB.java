package Test_Script;

import org.testng.Assert;
import org.testng.annotations.Test;

import Generic_Script.Base_Test;
import Generic_Script.Excel_GS;
import POM_Script.To_openFB;

public class Runner_excel_FB extends Base_Test
{
	@Test
	 public void validLogin()
	 {
		String un = Excel_GS.get_data("Sheet1", 0, 0);
		String pd = Excel_GS.get_data("Sheet1", 1, 0);
		   To_openFB p=new To_openFB(driver);
		   p.unData(un);
		   p.pwData(pd);
		   p.clicklogin(); 
		   Assert.fail();
		   
	 }
	 
}
