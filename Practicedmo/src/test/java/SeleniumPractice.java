import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SeleniumPractice {

	public static void main(String[] args) throws InterruptedException {

		WebDriverManager.chromedriver().setup();
		
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		driver.manage().window().maximize();
		driver.findElement(By.cssSelector("input[value=\"radio2\"]")).click();
	WebElement ele=	driver.findElement(By.id("dropdown-class-example"));
	ele.click();
	
	Thread.sleep(1000);
		
		Select select = new Select(ele);
	//	select.selectByIndex(3);
		select.selectByVisibleText("Option3");
		
		
		List<WebElement> el = driver.findElements(By.xpath("//input[@type=\"checkbox\"]"));
		
		for(WebElement ab:el) {
			
			ab.click();
		}
		
		Thread.sleep(1000);
		driver.findElement(By.id("alertbtn")).click();
		driver.switchTo().alert().accept();
		Thread.sleep(1000);
		driver.findElement(By.id("confirmbtn")).click();
		driver.switchTo().alert().dismiss();
		
		driver.findElement(By.id("mousehover")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//a[normalize-space()='Reload']")).click();
		
		
	}

}
