package other;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;


public class ReportPath {
	XSSFSheet sb;

	public void getData() throws IOException {
		File src = new File("C:\\Users\\ASUS\\Desktop\\r.xlsx");
		FileInputStream fis = new FileInputStream(src);
		XSSFWorkbook wb = new XSSFWorkbook(fis);
		sb = wb.getSheetAt(1);

	}

	public Object getData1(int row, int column) {
		Object data;
		if (sb.getRow(row).getCell(column).getCellType() == Cell.CELL_TYPE_STRING) {
			data = sb.getRow(row).getCell(column).getStringCellValue();
			System.out.println(data);
	
		} else {
			data = (int) sb.getRow(row).getCell(column).getNumericCellValue();
			System.out.println(data);
		}
		return data;
	}

	public static void main(String[] args) {
		ReportPath r = new ReportPath();
		try {
			r.getData();
			r.getData1(14, 3);
			r.getData1(15, 3);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
//if (sb.getRow(14).getCell(3).getCellType() == Cell.CELL_TYPE_STRING) {
//	String data = sb.getRow(14).getCell(3).getStringCellValue();
//	System.out.println(data);
//} else {
//	int data = (int) sb.getRow(14).getCell(3).getNumericCellValue();
//	System.out.println(data);
//}