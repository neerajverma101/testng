package page;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import generic.BasePage;

public class LicensesPage extends BasePage {

	public LicensesPage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}

	@FindBy(xpath="//b[contains(text(),'actiTIME')]")
	private WebElement productedition;

	public void compareProductEdition(String eVersion) {
		log.info("Expected Version:" + eVersion);
		String Aversion = productedition.getText();
		log.info("Actual Version" + Aversion);
		Assert.assertEquals(Aversion, eVersion);
	}

}
