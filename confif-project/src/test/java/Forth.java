
import org.testng.annotations.Test;

public class Forth extends MultiThread {
	@Test
	public void forth(String url) {
		getDriver().get(url);
		String threadname = Thread.currentThread().getName();
		System.out.println(threadname);
	}
}