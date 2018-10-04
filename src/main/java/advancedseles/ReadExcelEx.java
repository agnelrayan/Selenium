package advancedseles;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadExcelEx {
	
	
	public void readExcel(String fn,String sn) throws IOException {
		
		
		
		/*File file = new File("/home/agnel/employee.xlsx");
		FileInputStream fin = new FileInputStream(file);
		
		Workbook wb = null;
		String fileExtension = fn.substring(fn.indexOf("."));
		
		if(fileExtension.equals("xlsx")) {
			wb  = new XSSFWorkbook(fin);
		}
		
		else if(fileExtension.equals(".xls")){
			wb = new HSSFWorkbook(fin);
			
		}
		
		Sheet sheet=wb.getSheet(sn);
		//Sheet guru99Sheet = wb.getSheet(sn);
		
		int rowCount = sheet.getLastRowNum()-sheet.getFirstRowNum();
		
		System.out.println("RowCount:"+rowCount);*/
		
		
		File file = new File("/home/agnel/employee.xlsx");
		//File file =    new File("/home/agnel/employee.xlsx");

	    //Create an object of FileInputStream class to read excel file
		
      FileInputStream in = new FileInputStream(file);
		
		Workbook wb = null;
		String fileExtension = fn.substring(fn.indexOf("."));
		
		if(fileExtension.equals(".xlsx")) {
			wb  = new XSSFWorkbook(in);
		}
		
			
		else if(fileExtension.equals(".xls")){
			wb = new HSSFWorkbook(in);
			
		}
							     
	    //Read sheet inside the workbook by its name

	    Sheet sheet = wb.getSheet(sn);

	    //Find number of rows in excel file

	    int rowCount = sheet.getLastRowNum()-sheet.getFirstRowNum();
	    System.out.println("RowCount:"+rowCount);
	    
	    for(int i=0;i<rowCount+1;i++) {
	    	Row row=sheet.getRow(i);
	    	
	    	for(int j=0;j<row.getLastCellNum();j++) {
	    		System.out.print(row.getCell(j).getStringCellValue()+"||");
	    	}
	    	System.out.println();
	    	
	    	
	    }
		
		
	}

	public static void main(String[] args) throws IOException {
		
		ReadExcelEx obj = new ReadExcelEx();
		//obj.readExcel("/home/agnel/employee.xlsx", "Sheet1");
		obj.readExcel("/home/agnel/stud.xlsx","Sheet1");
		
		

	}

}
