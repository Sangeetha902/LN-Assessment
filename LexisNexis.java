import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LexisNexis {

	public static void main(String[] args) {
		try {
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.com/");
		WebElement element = driver.findElement(By.name("q"));
		element.sendKeys("LexisNexis");
		element.sendKeys(Keys.RETURN);
		Thread.sleep(3000);
		List<WebElement> allLinks = driver.findElements(By.xpath("//a/h3"));
		allLinks.get(2).click();
		} catch (InterruptedException e) {
		e.printStackTrace();
		}
	}
}