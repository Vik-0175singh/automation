package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SwagLabs {
	public static WebDriver driver;
	public SwagLabs(WebDriver driver) {

		this.driver = driver;
		PageFactory.initElements(driver, this);
}
	
	@FindBy(id="first-name")
	WebElement first;
	
	@FindBy(xpath="//input[@id=\"last-name\"]")
	WebElement last;
	
	@FindBy(id="postal-code")
	WebElement postal;
	
	@FindBy(id="continue")
	WebElement cont;
	
	@FindBy(id="finish")
	WebElement finish;
	
	public void infromation(String firstname,String lastname,String postalname) {
		
		first.sendKeys(firstname);
		last.sendKeys(lastname);
		postal.sendKeys(postalname);
		cont.click();
		finish.click();
		
	}
	

}
