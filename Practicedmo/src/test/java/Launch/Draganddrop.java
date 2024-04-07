package Launch;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Draganddrop {

	public static void main(String[] args) throws InterruptedException {
	
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		
		
//		WebDriverManager.chromedriver().setup();
//		WebDriver driver = new ChromeDriver();
		
		
		driver.get("https://demo.guru99.com/test/drag_drop.html");
		driver.manage().window().maximize();
		WebElement dragable= driver.findElement(By.xpath("//li[@id=\"fourth\"][2]"));
		WebElement dropable= driver.findElement(By.cssSelector(".field13.ui-droppable.ui-sortable"));
		Actions action= new Actions(driver);
		Thread.sleep(1000);
		action.dragAndDrop(dragable, dropable).build().perform();

	}

}
