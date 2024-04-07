package Testing;

import java.util.Iterator;
import java.util.List;
import java.util.Set;



import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class NewClass {
	public static void main(String[] args) throws InterruptedException {

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		Thread.sleep(1000);
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//input[@value=\"radio2\"]")).click();

		List<WebElement> checkbox = driver.findElements(By.xpath("//input[@type=\"checkbox\"]"));

		for (int i = 0; i < checkbox.size(); i++) {

			System.out.println(checkbox.get(i));
			checkbox.get(1).click();
		}

		driver.findElement(By.id("dropdown-class-example")).click();
		Thread.sleep(1000);

		WebElement dropdown = driver.findElement(By.xpath("//*[@id=\"dropdown-class-example\"]"));

		Select select = new Select(dropdown);
		select.selectByIndex(1);

		driver.findElement(By.id("autocomplete")).sendKeys("ame");
		Thread.sleep(5000);

		List<WebElement> auto = driver.findElements(By.cssSelector("li.ui-menu-item"));
		for (WebElement dropdowns : auto) {

			if (dropdowns.getText().equalsIgnoreCase("Cameroon")) {

				dropdowns.click();
			}
		}

		driver.findElement(By.id("alertbtn")).click();
		driver.switchTo().alert().accept();

		driver.findElement(By.id("openwindow")).click();
		
		Thread.sleep(5000);
		
		Set<String> windowhandles = driver.getWindowHandles();
		System.out.println(windowhandles);

		Iterator<String> iterator = windowhandles.iterator();
		String parentwindow = iterator.next();
		String childwindow = iterator.next();
		
		
		driver.switchTo().window(childwindow);
//	WebElement ele =	driver.findElement(By.xpath("//li[@class='nav-item']//a[@href='contactus.html'][normalize-space()='Contact']"));
	//ele.click();
		
		WebElement dropdown1 = driver.findElement(By.xpath("//ul[@class='navbar-nav ml-auto']//a[normalize-space()='Courses']"));
		dropdown1.click();
		

	}

}
