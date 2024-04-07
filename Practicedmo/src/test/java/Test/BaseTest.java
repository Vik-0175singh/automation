package Test;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BaseTest {
	
	public static WebDriver driver;
	
	public WebDriver initial() throws IOException {
		
		Properties prop = new Properties();
		FileInputStream file = new FileInputStream(System.getProperty("user.dir")+"//src//test//java//Resources//GlobalData.properties");
		prop.load(file);
		String browserName = prop.getProperty("browser");
		return driver = new ChromeDriver();
		
	}
	
	
	

}
