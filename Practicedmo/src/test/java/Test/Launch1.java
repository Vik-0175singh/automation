package Test;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import Pages.Addcart;
import Pages.Checkout;
import Pages.Launchbrowser;
import Pages.SwagLabs;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Launch1 extends BaseTest {
	@Test
	public void logapp() throws IOException 
	{
	initial();
		driver.manage().window().maximize();
		driver.get("https://www.saucedemo.com/");
		Launchbrowser obj = new Launchbrowser(driver);
		obj.loginapplication("standard_user", "secret_sauce");
	
		Addcart jn = new Addcart(driver) ;
		jn.addto();
		
		Checkout co = new Checkout(driver);
		co.check();
			
		SwagLabs sl = new SwagLabs(driver);
		sl.infromation("Vikash", "SIngh", "242424");
		
	}
}
