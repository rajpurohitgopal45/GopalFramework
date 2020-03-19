
import org.testng.annotations.Test;

public class Ninth extends MultiThread {
	@Test
	public void ninth(String url) {
		getDriver().get(url);
		String threadname = Thread.currentThread().getName();
		System.out.println(threadname);
	}
}