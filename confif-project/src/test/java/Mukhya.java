import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

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

	@Test(dataProvider = "allorigin")
	public void firsttest(String url) throws InterruptedException {
		ConfigExcel config1 = new ConfigExcel("C:\\Users\\ASUS\\Desktop\\r.xlsx");
		String key1 = config1.getData(1, 8, 3);
		if (key1.equalsIgnoreCase("y")) {
			verify();
			FirstClassT t = new FirstClassT();
			t.first(url);
		} else {
			System.out.println("not set 1");
		}
	}

	@Test(dataProvider = "allorigin")
	public void secondtest(String url) throws InterruptedException {
		ConfigExcel config2 = new ConfigExcel("C:\\Users\\ASUS\\Desktop\\r.xlsx");
		String key2 = config2.getData(1, 9, 3);
		if (key2.equalsIgnoreCase("y")) {
			verify();
			SecondClassT s = new SecondClassT();
			s.second(url);
		} else {
			System.out.println("not set 2");
		}
	}

//	  @Test(dataProvider = "allorigin") public void thirdtest(String url) 
//	  { Third th = new Third(); th.thirdst(url); }
//	  
//	  @Test(dataProvider = "allorigin") public void forthtest(String url) 
//	  { Forth fo = new Forth(); fo.forth(url); }
//	  
//	  @Test(dataProvider = "allorigin") public void fifthtest(String url) 
//	  { Fifth fi = new Fifth(); fi.fifth(url); }	 
}
