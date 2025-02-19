package trial_Run;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class WindowHandling {

	@Test
	void handle() {

		WebDriver driver = new ChromeDriver();
		driver.get("https://www.netmeds.com");
		driver.switchTo().newWindow(WindowType.TAB);
		driver.get("https://www.amazon.com");

	}

}
