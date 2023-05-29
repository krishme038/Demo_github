package Reporting_tools;

import java.io.IOException;

import org.apache.log4j.Appender;
import org.apache.log4j.BasicConfigurator;
import org.apache.log4j.FileAppender;
import org.apache.log4j.Layout;
import org.apache.log4j.Logger;
import org.apache.log4j.PatternLayout;
import org.testng.annotations.Test;

public class Log4j_repSection 
{
  @Test
  public void test1() throws IOException
  {
	  Layout lay=new PatternLayout("%d %c %m %n");
	  Appender app = new FileAppender(lay,"./reports/rep2.log");
	  BasicConfigurator.configure(app);
	  Logger log = Logger.getLogger(this.getClass().getName());
	  log.warn("warning");
	  log.info("info");
	  log.error("error");
  }
}
