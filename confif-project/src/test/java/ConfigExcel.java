import java.io.File;
import java.io.FileInputStream;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ConfigExcel {
	XSSFWorkbook wb;
	XSSFSheet sb;

	public ConfigExcel(String excelPath) {
		try {
			File src = new File(excelPath);
			FileInputStream fis = new FileInputStream(src);
			wb = new XSSFWorkbook(fis);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public String getData(int sheetNo, int row, int column) {
		sb = wb.getSheetAt(sheetNo);
		String data = sb.getRow(row).getCell(column).getStringCellValue();
		return data;
	}

	public Object getData(int row, int column) {
		Object data;
		sb = wb.getSheetAt(1);
		if (sb.getRow(row).getCell(column).getCellType() == Cell.CELL_TYPE_STRING) {
			data = sb.getRow(row).getCell(column).getStringCellValue();
			System.out.println(data);

		} else {
			data = (int) sb.getRow(row).getCell(column).getNumericCellValue();
			System.out.println(data);
		}
		return data;
	}

	public int getRowCount(int sheetIndex) {
		int row = wb.getSheetAt(sheetIndex).getLastRowNum();
		row = row + 1;
		return row;
	}
}
