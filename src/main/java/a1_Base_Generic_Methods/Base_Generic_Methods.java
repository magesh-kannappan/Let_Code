package a1_Base_Generic_Methods;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Base_Generic_Methods {

	public static WebDriver driver;

	public static void browserLaunch(String browserName) {

		if (browserName == "chrome")
			driver = new ChromeDriver();
		else if (browserName == "firefox") {
			driver = new FirefoxDriver();
		}
	}

	public static void maximizeScreen() {
		driver.manage().window().maximize();
	}

	public static void openUrl(String url) {
		driver.get(url);
	}

	public static void redirectToUrl(String url) {
		driver.navigate().to(url);
	}

	public static void pageTitleValidator(String actualPageTitle) {

		String currentPageTitle = driver.getTitle();
		if (actualPageTitle.equals(currentPageTitle)) {
			System.out.println("Correct Page Title");
		} else {
			System.err.println("Wrong Page Title");
		}
	}

}
