
import org.testng.annotations.Test;

public class Sixth extends MultiThread {
	@Test
	public void sixth(String url) {
		getDriver().get(url);
		String threadname = Thread.currentThread().getName();
		System.out.println(threadname);
	}
}