package generic;

import java.util.concurrent.TimeUnit;

import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Listeners;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;

@Listeners(FWListener.class)
public class BaseTest implements IAutoCons {
	public static WebDriver driver;
	public static String strURL;
	public static long lngITO;
	public Logger log = Logger.getLogger(this.getClass());

	@BeforeSuite
	public void iniFramework() {
		System.setProperty(CHROME_KEY, CHROME_VALUE);
		System.setProperty(FIREFOX_KEY, FIREFOX_VALUE);
	}

	@Parameters({"browser"})
	@BeforeMethod
	public void openapp(@Optional("firefox") String browser) {
		if (browser.equals("chrome")) {
			driver = new ChromeDriver();
			log.info("Opening Chrome Browser");

		} else {
			driver = new FirefoxDriver();
			log.info("Opening Firefox Browser");

		}
		strURL = AutoUtility.getPropertyValue(CONFIG_PATH, "URL");
		log.info("Enter the URL:" + strURL);
		driver.get(strURL);
		String sITO = AutoUtility.getPropertyValue(CONFIG_PATH, "ITO");
		log.info("Set Implicit wait:" + lngITO);
		lngITO = Long.parseLong(sITO);
		driver.manage().timeouts().implicitlyWait(lngITO, TimeUnit.SECONDS);
		driver.manage().window().maximize();
	}

	@AfterMethod
	public void closeapp() {
		driver.close();
		log.info("Close the Browser");
	}
}