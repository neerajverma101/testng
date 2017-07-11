package page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import generic.AutoUtility;
import generic.BasePage;

public class EnterTimeTrackPage extends BasePage {

	public EnterTimeTrackPage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}

	@FindBy(xpath="//div[@class='popup_menu_icon warning_icon']")
	private WebElement settingLNK;

	@FindBy(xpath="//a[contains(text(),'Licenses')]")  
	private WebElement licensesLNK;

	public void clickSettings() {
		log.info("Clicking on settings");
		AutoUtility.sleep(2);
		settingLNK.click();
	}

	public void clickLicenses() {
		log.info("Clicking on Licenses");
		AutoUtility.sleep(2);
		licensesLNK.click();
	}
}
