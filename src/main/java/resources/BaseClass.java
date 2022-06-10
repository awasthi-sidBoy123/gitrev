package resources;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class BaseClass {

	public static WebDriver driver;
	public static Properties prop;
	String browserType;
	
	
	public WebDriver getBrowser() throws IOException {
	
		 prop = new Properties();
		 FileInputStream fis = new FileInputStream("C:\\Users\\Admin\\eclipse-workspace\\ZZRevise\\src\\main\\java\\resources\\Data.properties");
		 prop.load(fis);
		 browserType = prop.getProperty("browser");
		 System.out.println("hello");
		 if(browserType.contains("chrome")) {
			 System.out.println(browserType);
			 	System.setProperty("webdriver.chrome.driver", "D:\\driver\\chromedriver.exe");
	        	driver = new ChromeDriver();
		 }else if(browserType.equalsIgnoreCase("chrome")) {
			 System.setProperty("webdriver.gecko.driver", "D:\\driver\\geckodriver.exe");
	    	 driver = new FirefoxDriver();
		 }else {
			 
		 }
		return driver;
	}
	
}
