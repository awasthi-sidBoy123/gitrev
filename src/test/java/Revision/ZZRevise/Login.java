package Revision.ZZRevise;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import resources.BaseClass;

public class Login extends BaseClass {
	
	String webs ;
	 WebDriver driver;
	
	@BeforeTest
	private void initializeDriver() throws IOException {
		driver = getBrowser();
		webs = prop.getProperty("url");
		
		
	}
	
	@Test
	public void loginData() {
		driver.get(webs);
	}
	
	
	

}
