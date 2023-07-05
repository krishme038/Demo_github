package POM_Script;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Generic_Script.Base_Page;

public class To_openFB extends Base_Page
{

	//declaration
	@FindBy(xpath="//input[@id='email']")
		private WebElement utf;
		 
		 @FindBy(xpath="//input[@type='password']")
			private WebElement ptf;
		 
		 @FindBy(xpath="//button[@value='1']")
			private WebElement logbtn;
		 //initialization
		 public To_openFB(WebDriver driver) 
			{
				super(driver);
			}
		 //utilizatioN.....
		 public void unData(String un)
		 {
			 utf.sendKeys(un);
		 }
		 public void pwData(String pwd)
		 {
			 ptf.sendKeys(pwd);
		 }
		 public void clicklogin()
		 {
			 logbtn.click();
		 }
}
