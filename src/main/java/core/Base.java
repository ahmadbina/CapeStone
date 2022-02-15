package core;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.sql.Driver;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Base {
	
	public static WebDriver driver;
	public static Properties properties;
	public static Logger logger;

	private String log4jPath=".\\src\\test\\resourse\\input\\log4j.properties";
	private String propertyPath=".\\src\\test\\resourse\\input\\properties.properties";
  
    @SuppressWarnings("static-access")
	public Base(){
    	logger=logger.getLogger("logger_File");
    	PropertyConfigurator.configure(log4jPath);
    	try {
			BufferedReader reader= new BufferedReader(new FileReader(propertyPath));
			properties = new Properties();
			properties.load(reader);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
    
    	}
	public static String getUrl() {
		String url=properties.getProperty("url");
		return url;
    }
	public static String getBrowser() {
		String browser=properties.getProperty("browser");
		return browser;
	}
	public static void openBrowser() {
		driver.get(getUrl());
	}
	public static void closeBrowsers() {
		driver.close();
		driver.quit();
	}
	public static void multiBrowser() {
	
			if (Base.getBrowser().equalsIgnoreCase("chrome")) {
				WebDriverManager.chromedriver().setup();
				driver = new ChromeDriver();
			} else if (Base.getBrowser().equalsIgnoreCase("edge")) {
				WebDriverManager.iedriver().setup();
				driver = new EdgeDriver();
			} else if(Base.getBrowser().equalsIgnoreCase("firefox")) {
				WebDriverManager.firefoxdriver().setup();
				driver = new FirefoxDriver();
			} else {
				WebDriverManager.chromedriver().setup();
				driver = new ChromeDriver();
			}

			driver.manage().window().maximize();
			driver.manage().deleteAllCookies();
			driver.manage().timeouts().pageLoadTimeout(40,TimeUnit.SECONDS);
			driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
			driver.manage().deleteAllCookies();
		
	}
	public void explicitWaith(WebElement string) {
		WebDriverWait wait = new WebDriverWait(driver,20);
		
		
	}

}

            