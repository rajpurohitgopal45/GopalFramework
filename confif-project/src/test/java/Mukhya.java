import java.io.IOException;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import other.Retry;

public class Mukhya extends MultiThread {
	
	@DataProvider(name = "allorigin")
	public Object[][] passData() {
		ConfigExcel config = new ConfigExcel("C:\\Users\\ASUS\\Desktop\\r.xlsx");
		int rows = config.getRowCount(0);
		Object[][] data = new Object[rows][1];
		for (int i = 0; i < rows; i++) {
			data[i][0] = config.getData(0, i, 0);
		}
		return data;
	}
	@Test(dataProvider = "allorigin",retryAnalyzer=Retry.class)
	public void pcvNew(String url) throws InterruptedException, IOException {
		ConfigExcel config1 = new ConfigExcel("C:\\Users\\ASUS\\Desktop\\r.xlsx");
		String key1 = config1.getData(1, 8, 3);
		if (key1.equalsIgnoreCase("y")) {
			verify();
			Pcv p = new Pcv();
			String threadname = Thread.currentThread().getName();
			System.out.println(threadname);
			p.pcv(url);
			p.dashboard();
			p.getQuote();
			p.last();
	} }
	
	/*	@Test(dataProvider = "allorigin",retryAnalyzer=Retry.class)
	public void new2W(String url) throws InterruptedException, IOException {
		ConfigExcel config1 = new ConfigExcel("C:\\Users\\ASUS\\Desktop\\r.xlsx");
		String key1 = config1.getData(1, 8, 3);
		if (key1.equalsIgnoreCase("y")) {
			verify();
			FirstClassT t = new FirstClassT();
			String threadname = Thread.currentThread().getName();
			System.out.println(threadname);
			t.first(url);
			t.dashboard();
			t.getQuote();
			t.nexttPage();
	} }
	
			@Test(dataProvider = "allorigin",priority=3, retryAnalyzer=Retry.class)       
	public void secondtest(String url) throws InterruptedException {
		ConfigExcel config2 = new ConfigExcel("C:\\Users\\ASUS\\Desktop\\r.xlsx");
		String key2 = config2.getData(1, 9, 3);
		if (key2.equalsIgnoreCase("y")) {
			verify();
			SecondClassT s = new SecondClassT();
			String threadname = Thread.currentThread().getName();
			System.out.println(threadname);
			s.second(url);
		}
	}

	@Test(dataProvider = "allorigin",priority=2, retryAnalyzer=Retry.class) 
	  public void thirdtest(String url) {
		  ConfigExcel config2 = new ConfigExcel("C:\\Users\\ASUS\\Desktop\\r.xlsx");
			String key2 = config2.getData(1, 10, 3);
			if (key2.equalsIgnoreCase("y")) {
				verify();
		  Third th = new Third(); 
		  String threadname = Thread.currentThread().getName();
			System.out.println(threadname);
		  th.thirdst(url); 
		  }}
	  
	  @Test(dataProvider = "allorigin",priority=1, retryAnalyzer=Retry.class) public void forthtest(String url) 
	  {  ConfigExcel config2 = new ConfigExcel("C:\\Users\\ASUS\\Desktop\\r.xlsx");
		String key2 = config2.getData(1, 11, 3);
		if (key2.equalsIgnoreCase("y")) {
			verify();
		  Forth fo = new Forth(); 
		  String threadname = Thread.currentThread().getName();
			System.out.println(threadname);
		  fo.forth(url); 
		  }
		}
	  
	  @Test(dataProvider = "allorigin", retryAnalyzer=Retry.class) 
	  public void fifthtest(String url)  { 
		  ConfigExcel config2 = new ConfigExcel("C:\\Users\\ASUS\\Desktop\\r.xlsx");
			String key2 = config2.getData(1, 11, 3);
			if (key2.equalsIgnoreCase("y")) {
				verify();
		  Fifth fi = new Fifth();
		  fi.fifth(url); 
		  }
	  }
	  
	  @Test(dataProvider = "allorigin", retryAnalyzer=Retry.class) public void sixth(String url) 
	  { ConfigExcel config2 = new ConfigExcel("C:\\Users\\ASUS\\Desktop\\r.xlsx");
		String key2 = config2.getData(1, 11, 3);
		if (key2.equalsIgnoreCase("y")) {
			verify();
		  Sixth si = new Sixth(); si.sixth(url); }
	  }*/
}
