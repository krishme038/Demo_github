package Reporting_tools;

import org.apache.log4j.BasicConfigurator;
import org.apache.log4j.Logger;
import org.testng.annotations.Test;

public class Log4j_console 
{
 @Test
 public void test1()
 {
	 BasicConfigurator.configure();
	 Logger log = Logger.getLogger(this.getClass().getName());
	 log.warn("warn");
	 log.info("info");
	 log.error("error");
	 
 }
}
