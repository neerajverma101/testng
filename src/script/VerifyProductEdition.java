package script;

import org.testng.annotations.Test;

import generic.BaseTest;
import generic.Excel;
import page.EnterTimeTrackPage;
import page.LicensesPage;
import page.LoginPage;

public class VerifyProductEdition extends BaseTest {
	@Test(priority=3)
	public void testProductEdition() {
		String un = Excel.getCellValue(INPUT_PATH, "VerifyProductEdition", 1, 0);
		String pwd = Excel.getCellValue(INPUT_PATH, "VerifyProductEdition", 1, 1);
		String LPT = Excel.getCellValue(INPUT_PATH, "VerifyProductEdition", 1, 2);
		// get version
		LoginPage loginpage = new LoginPage(driver);
		String version = loginpage.getVersion();
		// enter username
		loginpage.setUserName(un);
		// enter password
		loginpage.setPassword(pwd);
		// click login
		loginpage.clickLogin();
		// click settings
		EnterTimeTrackPage ettpage = new EnterTimeTrackPage(driver);
		ettpage.clickSettings();
		// click on License
		ettpage.clickLicenses();
		LicensesPage licensepage = new LicensesPage(driver);
		licensepage.verifyingTitle(LPT);
		// verify Product edition is same as version
		licensepage.compareProductEdition(version);
		// click logout
		ettpage.clickLogout();
	}
}
