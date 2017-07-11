package script;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import generic.AutoUtility;
import generic.IAutoCons;

public class WBT implements IAutoCons {
	public static void main(String... args) {
		String s = AutoUtility.now();
		System.setProperty(CHROME_KEY, CHROME_VALUE);
		WebDriver driver = new ChromeDriver();
		driver.get("http://localhost/");
		AutoUtility.getScreenshots(SCREENSHOT_PATH + s + "desktop.png");
		AutoUtility.getScreenshots(driver, SCREENSHOT_PATH + s + "window.png");
		driver.quit();
	}
}
