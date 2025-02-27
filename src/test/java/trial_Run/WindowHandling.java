package trial_Run;

import java.time.Duration;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class WindowHandling {

	private void asd() {

		WebDriver driver = new ChromeDriver();
		driver.get("https://www.netmeds.com");

		// JavascriptExecutor js = (JavascriptExecutor) driver;
		// js.executeScript("arguments[0].click();", "element");
		// js.executeScript("arguments[0].scrollIntoView(true);", "element");

		float percent = 123.21f;
		int mrp = (int) percent;
		JavascriptExecutor js = (JavascriptExecutor) driver;

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
		driver.switchTo().parentFrame();
		driver.switchTo().defaultContent();


	}

	@Test
	void handle() {

		WebDriver driver = new ChromeDriver();
		driver.get("https://www.netmeds.com");
		driver.switchTo().newWindow(WindowType.TAB);
		driver.switchTo().newWindow(WindowType.TAB);
		driver.switchTo().window(null);

		// JavascriptExecutor js = (JavascriptExecutor) driver;
		// js.executeScript("arguments[0].click();", "element");

	}

}
