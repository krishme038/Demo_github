package Test_Script;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import Generic_Script.Base_Test;
import POM_Script.To_openFB;

public class Runner_FB extends Base_Test
{
 @Test(dataProvider="testcredential")
 public void validLogin(String d1,String d2) 
 {
	   To_openFB p=new To_openFB(driver);
	   p.unData(d1);
	   p.pwData(d2);
	   p.clicklogin(); 
	   Assert.fail();
	   
 }
 @DataProvider(name="testcredential")
 public Object[][] createData1()
 {
	 return new Object[][]
	{
		 {"santhosh","12456"},
		 {"krishna","4582@#"},
	};
}
}
