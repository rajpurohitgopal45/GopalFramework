
//import org.testng.Assert;
import org.testng.annotations.Test;

public class MultiThread1 extends MultiThread {
	
	@Test 
	public void alaunchGuru() {
		getDriver().get("https://www.guru99.com");
		String threadname=Thread.currentThread().getName();
        System.out.println(threadname);
        getDriver().close();
	}
	@Test 
	public void blaunchLinkedIn() {
		getDriver().get("https://www.linkedin.com");
		String threadname1=Thread.currentThread().getName();
        System.out.println(threadname1);
        getDriver().close();

	}
	@Test 
	public void claunchFB() {
		getDriver().get("https://www.facebook.com");	
		String threadname2=Thread.currentThread().getName();
        System.out.println(threadname2);
        getDriver().close();
	}
	@Test 
	public void claunchFB3() {
		getDriver().get("https://www.facebook.com");	
		String threadname3=Thread.currentThread().getName();
        System.out.println(threadname3);
        getDriver().close();
	}
	@Test 
	public void claunchFB4() {
		getDriver().get("https://www.facebook.com");	
		String threadname4=Thread.currentThread().getName();
        System.out.println(threadname4);
        getDriver().close();
	}
	@Test 
	public void claunchFB5() {
		getDriver().get("https://www.facebook.com");	
		String threadname5=Thread.currentThread().getName();
        System.out.println(threadname5);
        getDriver().close();
	}
	@Test 
	public void claunchFB6() {
		getDriver().get("https://www.facebook.com");	
		String threadname6=Thread.currentThread().getName();
        System.out.println(threadname6);
        getDriver().close();
	}
	@Test 
	public void claunchFB7() {
		getDriver().get("https://www.facebook.com");	
		String threadname7=Thread.currentThread().getName();
        System.out.println(threadname7);
        getDriver().close();
	}
	@Test 
	public void claunchFB8() {
		getDriver().get("https://www.facebook.com");	
		String threadname8=Thread.currentThread().getName();
        System.out.println(threadname8);
        getDriver().close();
	}
	@Test 
	public void claunchFB9() {
		getDriver().get("https://www.facebook.com");	
		String threadname9=Thread.currentThread().getName();
        System.out.println(threadname9);
        getDriver().close();
	}
	
}
