package Web_Testing.in.letcode;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import a1_Base_Generic_Methods.Base_Practice;

public class Input_Boxes extends Base_Practice {

	@BeforeTest
	public void propFileLoader() {
		propertFileLoader("./Eclipse Projects/Personal Workspace/Let_Code/Config.properties");
//		propertFileLoader("C:\\Eclipse Projects\\Personal Workspace\\Let_Code\\Config.properties");
	}
	
//	

	@Test
	public void chromeLaunch() {

		browserLaunch(getPropertValue("browser"));
		maximizeScreen();
	}

	@Test(dependsOnMethods = { "chromeLaunch" })
	public void homePageLogin() {

		openUrl(getPropertValue("baseUrl"));
		WebElement inputEditCta = driver.findElement(By.xpath("//a[contains(text(),' Edit ')]"));
		clickButton(inputEditCta);
		boolean pageTitle = validatePageTitle("Edit Fields | LetCode with Koushik");
		if (pageTitle == true) {
			System.err.println("Page Title matched - " + pageTitle);
		} else {
			System.err.println("Page Title Not matched - " + pageTitle);
			closeWindow();
		}
	}

	@Test
	public static void inputBoxesValidations() {

	}

}
