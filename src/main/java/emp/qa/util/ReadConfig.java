package emp.qa.util;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import com.fasterxml.jackson.databind.annotation.JsonAppend.Prop;

public class ReadConfig {
	static Properties prop;
	public void ReadConfig() throws IOException {
		
		
//	 prop=new Properties();
//		FileInputStream ip=new FileInputStream(System.getProperty("user.dir")+"\\src\\main\\java\\emp\\qa\\properties\\config.properties");
//		prop.load(ip);
		File src = new File(System.getProperty("user.dir")+"\\src\\main\\java\\emp\\qa\\properties\\config.properties");
		FileInputStream fis = new FileInputStream(src);
		prop.load(fis);
		
	}
	
	 public String getApplicationUrl(String DevorLive) {
		 
		 String url=null;
		 
		 if(DevorLive.equalsIgnoreCase("Dev")) {
			url= prop.getProperty("TestUrl");
			 
		 } else if(DevorLive.equalsIgnoreCase("Live")) {
			url= prop.getProperty("UATUrl");
		 }
		 
		 return url;
	 }
	 
	 public String getUserName() {
		String UserName= prop.getProperty("UserName");
		return UserName;
	 }
	 
	 
	 public String getPassword() {
		String Passowrd= prop.getProperty("Password");
		return Passowrd;
	 }
	 
	 public static String getProperty(String string) {
			// TODO Auto-generated method stub
			String value = prop.getProperty(string);
			return value;
		}

}
