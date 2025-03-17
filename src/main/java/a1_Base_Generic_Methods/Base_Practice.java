package a1_Base_Generic_Methods;

import java.io.FileInputStream;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Base_Practice {

	public static WebDriver driver;
	static Properties prop = new Properties();

	public static void browserLaunch(String browserName) {
		if (browserName.equals("chrome")) {
			driver = new ChromeDriver();
		} else if (browserName.equals("firefox")) {
			driver = new FirefoxDriver();
		}
	}

	public static void maximizeScreen() {
		driver.manage().window().maximize();
	}

	public static void fullScreen() {
		driver.manage().window().fullscreen();
	}

	public static void openUrl(String url) {
		driver.get(url);
	}

	public static void redirectToUrl(String url) {
		driver.navigate().to(url);
	}

	public static void clickButton(WebElement element) {
		element.click();
	}

	public static void closeWindow() {
		driver.close();
	}

	public static boolean validatePageTitle(String expectedTitle) {

		String actualTitle = driver.getTitle();
		if (actualTitle.equals(expectedTitle)) {
			return true;
		} else {
			return false;
		}
	}

	public static void propertFileLoader(String filepath) {
		try {
			FileInputStream fis = new FileInputStream(filepath);
			prop.load(fis);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public static String getPropertValue(String propertKey) {
		return prop.getProperty(propertKey);
	}

}
