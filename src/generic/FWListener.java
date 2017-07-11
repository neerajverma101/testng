package generic;

import org.apache.log4j.Logger;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class FWListener implements ITestListener, IAutoCons {
	public Logger log = Logger.getLogger(this.getClass());

	@Override
	public void onTestStart(ITestResult result) {
		// TODO Auto-generated method stub

	}

	@Override
	public void onTestSuccess(ITestResult result) {
		// TODO Auto-generated method stub

	}

	@Override
	public void onTestFailure(ITestResult result) {
		String filename = AutoUtility.now();
		String photopath = SCREENSHOT_PATH + filename + ".png";
		AutoUtility.getScreenshots(photopath);
		// Reporter.log("Screenshot taken:"+photopath,true);
		log.info("Screenshot taken:\"+photopath");
	}

	@Override
	public void onTestSkipped(ITestResult result) {
		// TODO Auto-generated method stub

	}

	@Override
	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
		// TODO Auto-generated method stub

	}

	@Override
	public void onStart(ITestContext context) {
		// TODO Auto-generated method stub

	}

	@Override
	public void onFinish(ITestContext context) {
		// TODO Auto-generated method stub

	}

}
