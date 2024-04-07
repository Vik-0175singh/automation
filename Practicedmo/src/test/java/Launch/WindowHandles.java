package Launch;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WindowHandles {

	public static void main(String[] args) throws InterruptedException {

		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.salesforce.com/au/");

		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[@aria-label='Start free trial: We bring companies and customers together']"))
				.click();

		Set<String> winids = driver.getWindowHandles();
		Iterator<String> iterate = winids.iterator();

		String parent = iterate.next();
		String child = iterate.next();

		driver.switchTo().window(child);
		Thread.sleep(5000);
		driver.findElement(By.xpath("//button[@id='rejectInvite']")).click();
		// driver.switchTo().alert().accept();
		driver.findElement(By.xpath("//div[contains(@class,'text-left col-xs-12 col-sm-12 col-md-12 col-lg-2')]"))
				.sendKeys("Vikash");

	}

}
