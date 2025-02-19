package trial_Run;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Ignore;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class DataProviderTest {

	@Test
	@Parameters("browser")
	public static void paraCheck(String browser) {

		if (browser.equalsIgnoreCase("chrome")) {
			WebDriver driver = new ChromeDriver();
			driver.get("https://www.flipkart.com");
		}
	}

	@Ignore
	@Test(dataProvider = "LoginData", enabled = true)
	public static void loginCheck(String firstName, String lastName) {

		System.out.print("First Name - " + firstName + " ");
		System.out.println("Last Name - " + lastName);
	}

	@DataProvider(name = "LoginData", indices = 1)

	public static String[][] loginDataFetcher() {

		String[][] loginData = { { "Magesh", "Kannappan" }, { "Kishore", "Kannappan" } };
		return loginData;
	}

}
