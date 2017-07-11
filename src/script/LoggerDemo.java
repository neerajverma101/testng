package script;

import org.apache.log4j.Logger;
import org.testng.annotations.Test;

public class LoggerDemo {
	@Test
	public void LoggerTest() {
		Logger log=Logger.getLogger("Hi..");
		log.info("Bye");
	}
}
