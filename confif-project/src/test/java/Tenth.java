
import org.testng.annotations.Test;

public class Tenth extends MultiThread {
	@Test
	public void tenth(String url) {
		getDriver().get(url);
		String threadname = Thread.currentThread().getName();
		System.out.println(threadname);
	}
}