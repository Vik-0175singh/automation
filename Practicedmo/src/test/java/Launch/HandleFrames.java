package Launch;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class HandleFrames {
public static WebDriver driver;
	public static void main(String[] args) {
	
	driver = new ChromeDriver();
	driver.get("https://www.w3schools.com/jsref/tryit.asp?filename=tryjsref_alert");
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	
	System.out.println(driver.findElements(By.tagName("iframe")).size());
	
	driver.switchTo().frame(1);
	
// We can access frame by index, by name,by using webelement
	
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	driver.findElement(By.cssSelector("button[onclick='myFunction()']")).click();
	driver.switchTo().alert().accept();
	//driver.switchTo().defaultContent();
	//driver.switchTo().frame("iframeResult");
	driver.switchTo().parentFrame();
}

}