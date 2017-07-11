package prac;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class DemoA {
@Test void print(){
	Reporter.log("print");
}

@Test void print1(){
	Reporter.log("print1");
}

@Test void print11(){
	Reporter.log("print11");
	Assert.fail();
}

}
