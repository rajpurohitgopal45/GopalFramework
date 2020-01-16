
//import org.testng.Assert;
import org.testng.annotations.Test;

public class MultiThread1 extends MultiThread {
	
	@Test 
	public void alaunchGuru() {
		getDriver().get("https://www.guru99.com");
	}
	@Test 
	public void blaunchLinkedIn() {
		getDriver().get("https://www.linkedin.com/");
	//	Assert.fail();
	}
	@Test (dependsOnMethods = { "blaunchLinkedIn" })
	public void claunchFB() {
		getDriver().get("https://www.facebook.com/");	
	}
}
