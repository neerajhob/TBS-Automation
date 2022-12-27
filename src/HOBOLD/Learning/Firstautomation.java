package HOBOLD.Learning;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Firstautomation {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "D:\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		System.out.println("Hello Neeraj Your WebSite Automation is Started .....");

		driver.manage().window().maximize();
		driver.get("https://www.boddess.com");
		// WebElement searchbox= driver.findElement(By.name("q"));
		// WebElement searchbox= driver.findElement(By.className("gLFyf gsfi"));
		// List<WebElement> searchbox= driver.findElement(By.tagName("input"));
		// System.out.println("No of input:"+searchbox.size());
		// searchbox.sendKeys("boddess");
		// searchbox.submit();
		// Maximize current window
		// Delay execution for 5 seconds to view the maximize operation
		Thread.sleep(5000);
		// driver.quit();

	}
}
