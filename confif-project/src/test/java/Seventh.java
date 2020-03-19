
import org.testng.annotations.Test;

public class Seventh extends MultiThread {
	@Test
	public void seventh(String url) {
		getDriver().get(url);
		String threadname = Thread.currentThread().getName();
		System.out.println(threadname);
	}
}