package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Addcart {

	public static WebDriver driver;

	@FindBy(id = "add-to-cart-sauce-labs-backpack")
	WebElement cart;

	@FindBy(css = "a.shopping_cart_link")
	WebElement addcart;
	
	public Addcart(WebDriver driver) {

		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	public void addto() {

		cart.click();
		addcart.click();
	}
}
