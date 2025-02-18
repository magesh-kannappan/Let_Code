package Web_Testing.in.letcode;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class ParallelExecution {

	WebDriver driver;

	@Parameters("browser")
	@Test
	public void browserLaunch(String browser) {

		if (browser.equalsIgnoreCase("chrome")) {
			driver = new ChromeDriver();
			driver.get("https://www.amazon.com");
		} else if (browser.equalsIgnoreCase("firefox")) {
			driver = new FirefoxDriver();
		} else {

			System.out.println("Browser name is provided wrong");
		}
	}

}
