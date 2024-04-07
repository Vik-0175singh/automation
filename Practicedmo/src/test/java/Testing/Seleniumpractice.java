package Testing;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Seleniumpractice {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://jqueryui.com/resources/demos/slider/default.html");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));
		
		driver.switchTo().newWindow(WindowType.TAB);
		driver.get("http://google.com");
		driver.findElement(By.name("q")).sendKeys("Hello !!!");
		
		
		Thread.sleep(2000);
		
		driver.switchTo().newWindow(WindowType.WINDOW);
		driver.get("http://gmail.com");
		System.out.println(driver.getTitle());
		
		
		
		System.out.println(driver.getWindowHandles().size());
		

	
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		driver.manage().window().maximize();
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("window.scrollBy(0,500)");
		Thread.sleep(1000);
		js.executeScript("document.querySelector('.tableFixHead').scrollTop=400");


	}



}


