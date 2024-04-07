package Launch;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Upload {

	@Test
	public void uploadfile() throws AWTException, InterruptedException
	{
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://demoqa.com/upload-download");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		WebElement button=driver.findElement(By.xpath("//input[@id='uploadFile']"));
		Thread.sleep(2000);
		Actions act= new Actions(driver);
		act.moveToElement(button).click().perform();
		Robot rb= new Robot();
		rb.delay(2000);
		StringSelection ss= new StringSelection("C:\\Users\\Dell\\Desktop\\Shraddha Training\\chat.txt");
		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(ss, null);
		rb.keyPress(KeyEvent.VK_CONTROL);
		rb.keyPress(KeyEvent.VK_V);
		rb.keyRelease(KeyEvent.VK_CONTROL);
		rb.keyRelease(KeyEvent.VK_V);
		rb.keyPress(KeyEvent.VK_ENTER);
		rb.keyRelease(KeyEvent.VK_ENTER);
	}

		
	
}
