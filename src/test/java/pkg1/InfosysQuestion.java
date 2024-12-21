package pkg1;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class InfosysQuestion {

	@Test
	void InfosysThing() throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.com/");
		driver.findElement(By.xpath("//textarea[@aria-label=\"Search\"]")).sendKeys("Java");
//		List<WebElement> suggestions = driver.findElements(By.xpath("//li[@data-attrid=\"AutocompletePrediction\" and @data-entityname]//div[@role='option']"));
//		for (WebElement suggestion : suggestions) {
//			System.out.println(suggestion.getDomProperty("aria-label"));
		
//		}
		Actions action = new Actions (driver);
		action.keyDown(Keys.ENTER).perform();
		Thread.sleep(2000);
		List<WebElement> results = driver.findElements(By.xpath("//div[@id='search']//span[@original_target]//a"));
		System.out.println("#links" + results.size());
		for (WebElement link : results) {
			System.out.println(link.getDomAttribute("href"));
//		}
		//div[@id='search']//span[@original_target]//a
		}

	}
}
