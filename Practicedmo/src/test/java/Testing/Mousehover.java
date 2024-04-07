package Testing;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Mousehover {

	public static void main(String[] args) throws InterruptedException {

		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.carwale.com/");
		WebElement menu = driver.findElement(By.xpath("//div[normalize-space()='NEW CARS']"));
		Thread.sleep(1000);
		Actions action = new Actions(driver);
		action.moveToElement(menu).perform();
		
		driver.findElement(By.xpath("//div[contains(text(),'Find New Cars')]")).click();

		
		System.out.println(driver.getCurrentUrl());
		System.out.println(driver.getTitle());
		
	}

}
