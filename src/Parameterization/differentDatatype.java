package Parameterization;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class differentDatatype {

	public static void main(String[] args) throws IOException {
		
		FileInputStream File = new FileInputStream("C:\\Users\\Admin\\Downloads\\Excel.xlsx");
		
		XSSFWorkbook Data = new XSSFWorkbook(File);
		XSSFSheet sheet = Data.getSheet("Sheet1");
		
		int S1 = sheet.getLastRowNum();
		System.out.println(S1);
		
		int S2 = sheet.getRow(0).getLastCellNum();
		System.out.println(S2);
		 
		for (int i=0;i<S1;i++) {
			XSSFRow Row1 = sheet.getRow(i);
			
			for (int j=0;i<S2;j++) {
				XSSFCell Col = Row1.getCell(j);
			}
			
		}
	}
}
