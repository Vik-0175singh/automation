package Launch;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebElement;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Task {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://fengyuanchen.github.io/datepicker/");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@placeholder=\"Pick a date\"]")).click();
		driver.findElement(By.xpath("//li[@data-view='month current']")).click();
		
		List<WebElement> element = driver.findElements(By.cssSelector("li[data-view='month']"));
		int count = driver.findElements(By.xpath("//li[@data-view='month']")).size();
		
		for(int i=0;i<count;i++){
			
	
	 String Text	=	driver.findElements(By.xpath("//li[@data-view='month']")).get(i).getText();
	
	if(Text.equalsIgnoreCase("oct")) {
		
		driver.findElements(By.xpath("//li[@data-view='month']")).get(i).click();
	}
		}
				
				
				

	}

}
