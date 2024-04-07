package Testing;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Resizable {

	public static void main(String[] args) throws InterruptedException {
		//WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://jqueryui.com/resources/demos/resizable/default.html");
		driver.manage().window().maximize();
		Thread.sleep(1000);
		
		WebElement resize = driver.findElement(By.xpath("//*[@id=\"resizable\"]/div[3]"));
		Actions action = new Actions(driver);
		action.dragAndDropBy(resize, 400, 400).perform();

		driver.get("https://deluxe-menu.com/popup-mode-sample.html");
		WebElement img = driver.findElement(By.xpath("//p[2]/img"));
		new Actions(driver).contextClick(img).perform();
		
		
		driver.get("https://jqueryui.com/resources/demos/slider/default.html");
		WebElement width = driver.findElement(By.xpath("//*[@id=\"slider\"]/span"));
		new Actions(driver).dragAndDropBy(width, 300, 0).perform();
	}

}
