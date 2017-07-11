package script;

import org.testng.annotations.Test;

import generic.BaseTest;
import generic.Excel;
import page.LoginPage;

public class InvalidLogin extends BaseTest {
	@Test(priority = 2)
	public void testInvalidLogin() {
		// enter valid username
		int RowCount = Excel.getRowCount(INPUT_PATH, "InvalidLogin");
		for (int i = 1; i <= RowCount; i++) {
			String un = Excel.getCellValue(INPUT_PATH, "InvalidLogin", i, 0);
			String pwd = Excel.getCellValue(INPUT_PATH, "InvalidLogin", i, 1);
			LoginPage loginpage = new LoginPage(driver);
			loginpage.setUserName(un);
			// enter valid password
			loginpage.setPassword(pwd);
			// click on Login
			loginpage.clickLogin();
			// verify errmsg is displayed
			loginpage.verifyErrMsgIsDisplayed();
		}

	}
}
