package page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import generic.AutoUtility;
import generic.BasePage;

public class LoginPage extends BasePage {
	public LoginPage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}

	@FindBy(id = "username")
	private WebElement usernameTXB;

	@FindBy(name = "pwd")  
	private WebElement passwordTXB;

	@FindBy(xpath = "//a[@id='loginButton']")
	private WebElement LoginBTN;

	@FindBy(xpath = "//nobr[contains(text(),'actiTIME')]")
	private WebElement version;

	@FindBy(xpath = "//span[contains(.,'invalid')]")
	private WebElement errmsg;

	public void setUserName(String un) {
		log.info("Entering username:" + un);
		usernameTXB.sendKeys(un);
	}

	public void setPassword(String pwd) {
		log.info("Entering password:" + pwd);
		passwordTXB.sendKeys(pwd);
	}

	public void clickLogin() {
		log.info("Clicking on Login");
		LoginBTN.click();
	}

	public String getVersion() {
		String strversion = version.getText();
		log.info(strversion);
		return strversion;
	}

	public void verifyErrMsgIsDisplayed() {
		log.info("verify error message is displayed");
		AutoUtility.sleep(2);
		verifyingElementisPresent(errmsg);

	}

}
