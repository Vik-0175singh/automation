package Launch;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Locator {

	public static void main(String[] args) throws InterruptedException {

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.wikipedia.org/");
		driver.manage().window().maximize();
		Thread.sleep(1000);

		WebElement dropdown = driver.findElement(By.id("searchLanguage"));
		Select select = new Select(dropdown);
		// select.selectByVisibleText("Eesti");
		select.selectByValue("hi");

	}

}
