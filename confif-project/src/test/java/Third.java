
import org.testng.annotations.Test;

public class Third extends MultiThread {
	@Test
	public void thirdst(String url) {
		getDriver().get(url);
		String threadname = Thread.currentThread().getName();
		System.out.println(threadname);
	}
}