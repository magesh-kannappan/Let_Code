package Web_Testing.in.letcode;

import org.testng.annotations.Ignore;
import org.testng.annotations.Test;

import a1_Base_Generic_Methods.Base_Generic_Methods;

public class Input_Boxes extends Base_Generic_Methods {

	private String homepage_Url = "https://www.letcode.in/test";

	public void browserLogin() {

		browserLaunch("chrome");
		maximizeScreen();
	}

	public void homePageLogin() {
		openUrl(homepage_Url);
	}

	@Ignore
	@Test
	public static void inputBoxes() {

		redirectToUrl("https://letcode.in/edit");
		pageTitleValidator("Interact with Input fields");

	}

	@Ignore
	@Test
	public static void method2() {

		redirectToUrl("https:www.google.com");
		System.out.println("Method 2");

	}

}
