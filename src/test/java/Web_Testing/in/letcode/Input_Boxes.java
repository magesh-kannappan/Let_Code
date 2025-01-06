package Web_Testing.in.letcode;

import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import a1_Base_Generic_Methods.Base_Generic_Methods;

public class Input_Boxes extends Base_Generic_Methods {

	private String homepage_Url = "https://www.letcode.in/test";

	@BeforeSuite
	public void browserLogin() {

		browserLaunch("chrome");
		maximizeScreen();
	}

	@BeforeTest
	public void homePageLogin() {
		openUrl(homepage_Url);
	}

	@Test
	public static void inputBoxes() {

		redirectToUrl("https://letcode.in/edit");
		pageTitleValidator("Interact with Input fields");
		
	}

}
