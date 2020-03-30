
import org.testng.annotations.Test;

public class Fifth extends MultiThread {
	@Test
	public void fifth(String url) {
		getDriver().get(url);
		String threadname = Thread.currentThread().getName();
		System.out.println(threadname);
		getDriver().close();
	}
}