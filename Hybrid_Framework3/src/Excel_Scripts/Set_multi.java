package Excel_Scripts;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Set_multi 
{
   public static void main(String[] args) throws EncryptedDocumentException, IOException 
   {
	  FileInputStream fis=new FileInputStream("./excel/DATA1.xlsx");
	  Workbook book = WorkbookFactory.create(fis);
	  Sheet sh = book.getSheet("Sheet1");
	  System.setProperty("webdriver.gecko.driver", "./softwares/geckodriver.exe");
	  WebDriver driver=new FirefoxDriver();
	  driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
	  driver.get("https://www.amazon.in");
	  List<WebElement> links = driver.findElements(By.xpath("//a"));
	  int count = links.size();
	  for(int i=0;i<count;i++) //we can also use i<links.size();
	  {
		  Row r = sh.createRow(i);
		  Cell c = r.createCell(0);
		  String value = links.get(i).getAttribute("href");
		  c.setCellValue(value);
	  }
	  FileOutputStream fos=new FileOutputStream("./excel/DATA1.xlsx");
	  book.write(fos);
   }
}
