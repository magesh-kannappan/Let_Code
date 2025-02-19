package trial_Run;

import java.util.List;

import org.jspecify.annotations.Nullable;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Ignore;
import org.testng.annotations.Test;

public class LinkChecker {
	WebDriver driver;

	@Ignore
	@Test
	void BrokenImageCheck() {

		int count = 1;

		driver = new ChromeDriver();
		driver.get("https://www.netmeds.tech");

		List<WebElement> totalLinks = driver.findElements(By.tagName("a"));
		int noOfLinks = totalLinks.size();
		System.out.println("Total no of Links in the current page - " + noOfLinks);

		for (WebElement links : totalLinks) {
			String linkpath = links.getDomAttribute("href");
			System.out.println(count + ". " + linkpath);
			count++;
		}

	}

	@Test
	void brokenImageChecker() {

		driver = new ChromeDriver();
		driver.get("https://www.netmeds.tech");

		//		WebElement logo = driver.findElement(By.xpath("//img[@alt='Netmeds.com, India ki Online Pharmacy']"));
		WebElement logo = driver.findElement(By.tagName("img"));
		@Nullable
		String domAttribute = logo.getDomAttribute("naturalWidth");

		if (domAttribute == null || domAttribute.equals("0")) {
			System.out.println("Images is Good");
		} else {
			System.out.println("Image is broken");
		}
	}

}
