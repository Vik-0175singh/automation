package Launch;

import java.time.Duration;
import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowhandlesandTabs {
	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();
		driver.get("https://www.way2automation.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		driver.switchTo().newWindow(WindowType.TAB);
		driver.get("https://www.google.com/");
		driver.findElement(By.name("q")).sendKeys("hello vikas");

		driver.switchTo().newWindow(WindowType.WINDOW);
		driver.get("https://www.google.com/gmail/about/");
		System.out.println(driver.getTitle());

		System.out.println(driver.getWindowHandles().size());

		Set<String> winids = driver.getWindowHandles();
		Iterator<String> iterator = winids.iterator();

		String parent = iterator.next();
		String child = iterator.next();
		String child1 = iterator.next();

		// driver.switchTo().window(child1);
//	driver.switchTo().window(child);
		driver.switchTo().parentFrame();

	}
}