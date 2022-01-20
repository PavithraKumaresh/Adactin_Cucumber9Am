package com.adactin.helper;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Properties;

public class ConfigurationReader {
	
	public static Properties p;
	
	public ConfigurationReader() throws Throwable  {
		File f = new File("C:\\Users\\admin\\eclipse-workspace\\Adactin_Cucumber_9AM\\src\\test\\java\\com\\adactin\\properties\\Configuration.properties");
		FileInputStream fis = new FileInputStream(f);
		
		 p = new Properties();
		p.load(fis);
		}

	
	public String getBrowser() {
		String browser = p.getProperty("browser");
		return browser;
		
	}
	
	public String getUrl() {
		String url = p.getProperty("url");
		return url;
	}
	
	
}
