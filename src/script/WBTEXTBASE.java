package script;

import org.testng.annotations.Test;

import generic.AutoUtility;
import generic.BaseTest;

public class WBTEXTBASE extends BaseTest {
	@Test
	public void TestWBT() {
		String s = AutoUtility.now();
		AutoUtility.getScreenshots(SCREENSHOT_PATH + s + "_desktop.png");
		AutoUtility.getScreenshots(driver, SCREENSHOT_PATH + s + "_window.png");
	}
}
