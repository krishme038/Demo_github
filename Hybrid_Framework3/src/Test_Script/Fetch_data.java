package Test_Script;

import Generic_Script.To_fetch_data;

public class Fetch_data 
{
   public static void main(String[] args) 
   {
	String value1=To_fetch_data.get_data("Sheet1", 0, 0);
	System.out.println(value1);  
	String value2=To_fetch_data.get_data("Sheet1", 1, 2);
	System.out.println(value2);
	String value3=To_fetch_data.get_data("Sheet1", 4, 3);
	System.out.println(value3);
   }
}
