package utility;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
// here we write code of browser which read from properties file(cnfig.properties)
public class PropertyRead {

	public static String readPropData(String data) throws IOException
	{
		Properties prop = new 	Properties();// We import  Properties class 
		
		String path = System.getProperty("user.dir")+ "\\src\\test\\resources\\config.properties";// here we decalre foleder path
		FileInputStream fis = new FileInputStream (path); //for read file we use fileiIputStream, Handle by throws
		prop.load(fis); // transfer in prop
		 String Value = prop.getProperty(data); // By using get.proeprty we read property  which we want 
		 
		 //System.out.println(Value); // this only for check which broswername not necessary
		 return Value;
	}
	public static void main(String[] args) throws IOException {
		readPropData ("browser");
	}
}
