package advancedseles;

import java.io.File;

import java.io.IOException;

import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.ss.usermodel.Row;

import org.apache.poi.ss.usermodel.Sheet;

import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ReadExcel {
    

    //Main function is calling readExcel function to read data from excel file

    public static void main(String...strings) throws IOException, InvalidFormatException{

    	Workbook wb = WorkbookFactory.create(new File("/home/agnel/stud.xlsx")); // Or foo.xlsx
    	 Sheet s = wb.getSheetAt(0);
    	 Row r = s.getRow(0);
    	 System.out.println("Cell A1 is " + r.getCell(0));
    }


}
