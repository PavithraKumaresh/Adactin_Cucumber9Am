package com.adactin.baseclass;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class BaseClass {
	
	
	public static WebDriver driver;
	public static WebDriver browserLaunch(String getBrowser) {
		
		try {
			if (getBrowser.equalsIgnoreCase("chrome")) {
				System.setProperty("webdriver.chrome.driver", 
						System.getProperty("user.dir")+("\\Driver\\chromedriver.exe"));
						driver = new ChromeDriver();
				}
			else if (getBrowser.equalsIgnoreCase("ie")) {
				System.setProperty("webdriver.ie.driver", 
						"C:\\Users\\admin\\eclipse-workspace\\Adactin_Cucumber\\Driver\\chromedriver.exe");
				 driver = new InternetExplorerDriver();
				
				}
			else {
				System.out.println("Invalid Browser");
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		driver.manage().window().maximize();
		return driver;
		
		
		}
	
	
public static void clickOnElement(WebElement element) {
		
	try {
		element.click();
	} catch (Exception e) {
		e.printStackTrace();
	}
	
	

	}
	public static void getUrl(String Url) {
		try {
			driver.get(Url);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public static void valueToElement(WebElement element, String value) {
		try {
			element.sendKeys(value);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	}



