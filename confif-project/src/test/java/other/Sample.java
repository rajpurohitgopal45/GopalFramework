package other;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Sample {
		@Test(retryAnalyzer=Retry.class)
		public void retryChecking() {
			System.out.println("Test started");
			int a=1;
			int b=2;
			Assert.assertEquals(a, b);
		}
}
