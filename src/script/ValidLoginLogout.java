package script;

import org.testng.annotations.Test;

import generic.BaseTest;
import generic.Excel;
import page.EnterTimeTrackPage;
import page.LoginPage;

public class ValidLoginLogout extends BaseTest {
@Test(priority=1)
public void testValidLoginLogout() {
	//enter valid username
	String un=Excel.getCellValue(INPUT_PATH, "ValidLoginLogout", 1, 0);
	String pwd=Excel.getCellValue(INPUT_PATH, "ValidLoginLogout", 1, 1);
	String HPT=Excel.getCellValue(INPUT_PATH, "ValidLoginLogout", 1, 2);
	String LPT=Excel.getCellValue(INPUT_PATH, "ValidLoginLogout", 1, 3);
	LoginPage loginpage=new LoginPage(driver);
	loginpage.setUserName(un);
	//enter valid password
	loginpage.setPassword(pwd);
	//click on Login
	loginpage.clickLogin();
	//verify that Home Page Title is displayed
	EnterTimeTrackPage ettpage=new EnterTimeTrackPage(driver);
	ettpage.verifyingTitle(HPT);
	//click on logout
	ettpage.clickLogout();
	//verify login page is displayed
	loginpage.verifyingTitle(LPT);
}
}
