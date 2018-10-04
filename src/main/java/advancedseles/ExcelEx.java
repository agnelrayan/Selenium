package advancedseles;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelEx {

	public static void main(String[] args) throws IOException {
		File src = new File("stud.xls");
		
		FileInputStream fis = new FileInputStream(src);
	
	
	XSSFWorkbook wb = new XSSFWorkbook(fis);
	XSSFSheet sheet = wb.getSheetAt(0);
	String data = sheet.getRow(0).getCell(0).getStringCellValue();
	System.out.println("Data from Excel"+data);
	}

}
