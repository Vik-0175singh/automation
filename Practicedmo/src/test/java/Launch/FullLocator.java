package Launch;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FullLocator {

	public static void main(String[] args) throws InterruptedException {

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
		driver.findElement(By.xpath("//input[@id=\"autosuggest\"]")).sendKeys("us");
		Thread.sleep(1000);
		List<WebElement> element = driver.findElements(By.xpath("//li[@class=\"ui-menu-item\"]"));
		for (WebElement vik : element) {
			if (vik.getText().equalsIgnoreCase("Belarus")) {
				vik.click();

			}

		}

	//	List<WebElement> vik = driver.findElements(By.id("//input[@id=\"ctl00_mainContent_rbtnl_Trip_0\"]"));
		driver.findElement(By.xpath("//input[@id=\"ctl00_mainContent_rbtnl_Trip_1\"]")).click();
		driver.findElement(By.xpath("//input[@id=\"ctl00_mainContent_chk_friendsandfamily\"]")).click();
		Thread.sleep(1000);
		driver.findElement(By.id("ctl00_mainContent_ddl_originStation1_CTXT")).click();
		driver.findElement(By.xpath("//a[@value=\"GWL\"]")).click();
		driver.findElement(By.xpath("//a[@text=\"Delhi (DEL)\" ]")).click();
	}

}
