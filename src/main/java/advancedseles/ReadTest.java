package advancedseles;

import java.io.File;
import java.io.FileOutputStream;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadTest {

	public static void main(String[] args) {
		try {
	        // Create Workbook instance holding reference to .xlsx file
	        XSSFWorkbook workbook = new XSSFWorkbook();

	        // Get first/desired sheet from the workbook
	        XSSFSheet sheet = createSheet(workbook, "Sheet1", false);

	        // XSSFSheet sheet = workbook.getSheetAt(1);//Don't use this line
	        // because you get Sheet index (1) is out of range (no sheets)

	        //Write some information in the cells or do what you want
	        XSSFRow row1 = sheet.createRow(0);
	        XSSFCell r1c2 = row1.createCell(0);
	        r1c2.setCellValue("NAME");
	        XSSFCell r1c3 = row1.createCell(1);
	        r1c3.setCellValue("AGE");
	        
	        //Save excel to HDD Drive
	        File pathToFile = new File("/home/agnel/stud2.xlsx");
	        if (!pathToFile.exists()) {
	            pathToFile.createNewFile();
	        }
	        FileOutputStream fos = new FileOutputStream(pathToFile);
	        workbook.write(fos);
	        fos.close();
	        System.out.println("Done");
	    } catch (Exception e) {
	        e.printStackTrace();
	    }
	}

	private static XSSFSheet createSheet(XSSFWorkbook wb, String prefix, boolean isHidden) {
	    XSSFSheet sheet = null;
	    int count = 0;

	    for (int i = 0; i < wb.getNumberOfSheets(); i++) {
	        String sName = wb.getSheetName(i);
	        if (sName.startsWith(prefix))
	            count++;
	    }

	    if (count > 0) {
	        sheet = wb.createSheet(prefix + count);
	    } else
	        sheet = wb.createSheet(prefix);

	    if (isHidden)
	        wb.setSheetHidden(wb.getNumberOfSheets() - 1, XSSFWorkbook.SHEET_STATE_VERY_HIDDEN);

	        return sheet;
	    }

	}


