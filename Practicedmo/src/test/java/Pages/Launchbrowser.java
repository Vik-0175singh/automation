package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Launchbrowser {

	public static WebDriver driver;

	public Launchbrowser(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(id = "user-name")
	WebElement user;

	@FindBy(id = "password")
	WebElement pass;

	@FindBy(id = "login-button")
	WebElement submit;

	public void loginapplication(String username, String password) {

		user.sendKeys(username);
		pass.sendKeys(password);
		submit.click();
	}

}
