package Testing;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Practice {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://demo.guru99.com/test/drag_drop.html");
		
		WebElement draggable = driver.findElement(By.xpath("//li[@class=\"block13 ui-draggable\"][2]"));
		WebElement dropable = driver.findElement(By.xpath("//ol[@id='amt7']//li[@class='placeholder']"));
		
	Actions act = new Actions(driver);
	act.dragAndDrop(draggable, dropable).build().perform();
	
	
	Thread.sleep(2000);
	driver.get("https://www.w3schools.com/jsref/tryit.asp?filename=tryjsref_submit_get");
	driver.manage().window().maximize();
	driver.switchTo().frame("iframeResult");
	
	driver.findElement(By.xpath("//button[@onclick='myFunction()']")).click();
	


	}

}
