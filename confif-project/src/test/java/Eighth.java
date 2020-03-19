
import org.testng.annotations.Test;

public class Eighth extends MultiThread {
	@Test
	public void eighth(String url) {
		getDriver().get(url);
		String threadname = Thread.currentThread().getName();
		System.out.println(threadname);
	}
}