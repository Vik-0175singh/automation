package Launch;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openxmlformats.schemas.drawingml.x2006.spreadsheetDrawing.STEditAs;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Locator1 {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		String vik = driver.getWindowHandle();
		Thread.sleep(1000);
		driver.findElement(By.cssSelector("div[class=\"_1gax\"]")).click();
		Set<String> Win = driver.getWindowHandles();
		
		

	}

}
