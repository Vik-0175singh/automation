package Launch;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DynamicLocators {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.in/?&tag=googhydrabk1-21&ref=pd_sl_7hz2t19t5c_e&adgrpid=155259815513&hvpone=&hvptwo=&hvadid=676742245123&hvpos=&hvnetw=g&hvrand=13691201173174399892&hvqmt=e&hvdev=c&hvdvcmdl=&hvlocint=&hvlocphy=9184819&hvtargid=kwd-10573980&hydadcr=14453_2367553");
		driver.findElement(By.cssSelector("input[id=\"twotabsearchtextbox\"]")).sendKeys("shoe");
		Thread.sleep(1000);
		List<WebElement> test = driver.findElements(By.cssSelector("div[class='s-suggestion-container']"));
		int ele = driver.findElements(By.cssSelector("div[class='s-suggestion-container']")).size();
		
			for(int i =0;i<ele;i++) {
		String 	text = driver.findElements(By.cssSelector("div[class='s-suggestion-container']")).get(i).getText();	
				
		if(text.equalsIgnoreCase("shoes")) {
			
			driver.findElements(By.cssSelector("div[class='s-suggestion-container']")).get(i).click();
		}
		
		
			}
			
			
		}
		
	}


