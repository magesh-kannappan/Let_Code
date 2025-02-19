package trial_Run;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Frame {

	@Test
	void iframe() {
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.leafground.com/frame.xhtml");

		WebElement Iframes2 = driver.findElement(By.tagName("iframe"));

		List<WebElement> Iframes = driver.findElements(By.tagName("iframe"));
		int size = Iframes.size();
		System.out.println("Total number of frames - " + size);

		driver.switchTo().frame(0);
		WebElement click = driver.findElement(By.id("Click"));
		click.click();

		driver.switchTo().defaultContent();

		WebElement text = driver.findElement(By.id("j_idt96"));
		System.out.println(text.getText());
	}
}
