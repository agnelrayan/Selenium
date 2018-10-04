package advancedseles;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import javax.swing.JOptionPane;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadTest2 {

	public static void main(String[] args) throws IOException {
		int RowCount = 7, iChoice;
        String sChoice;
        XSSFSheet s;
        XSSFRow row1;
        XSSFWorkbook wb;
        XSSFCell r1c1,r1c2, r1c8, r1Episodes;

        FileInputStream fis = new FileInputStream("/home/agnel/stud.xlsx");           
        wb = new XSSFWorkbook(fis);  
        s = wb.getSheetAt(0);
        System.out.println("GetSheet:"+s);
        //XSSFCell x=row1.getCell(0);
        //System.out.println(x);
     
        
        
	}

}
