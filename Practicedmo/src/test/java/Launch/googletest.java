package Launch;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class googletest {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.com/");
		WebElement ele = driver.findElement(By.xpath("//textarea[@id='APjFqb']"));
		ele.sendKeys("vikash");
		
		Thread.sleep(1000);
	//	driver.findElement(By.name("q")).sendKeys("vghj");
		List<WebElement> list = driver.findElements(By.xpath("//ul[@role='listbox']//li/descendant::div[@class='eIPGRd']"));
		int a = list.size();
		Thread.sleep(4000);
		list.get(a-9).click();

	}

}
