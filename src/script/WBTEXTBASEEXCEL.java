package script;

import org.testng.Assert;
import org.testng.annotations.Test;
import generic.BaseTest;
import generic.Excel;

public class WBTEXTBASEEXCEL extends BaseTest {
	@Test
	public void TestWBT() {
		int r = Excel.getRowCount(INPUT_PATH, "Sheet1");
		// Reporter.log(" "+r,true);
		log.info(" " + r);
		String v = Excel.getCellValue(INPUT_PATH, "Sheet1", 0, 0);
		// Reporter.log(v,true);
		log.info(v);
		// Reporter.log("Executing WBT Test excel",true);
		log.info("Executing WBT Test excel");
		Assert.fail();
	}
}
