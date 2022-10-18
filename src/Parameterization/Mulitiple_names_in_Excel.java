package Parameterization;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Mulitiple_names_in_Excel {

	public static void main(String[] args) throws EncryptedDocumentException, IOException   {
		
		String path = "C:\\Users\\Admin\\Desktop\\ExcelPractice.xlsx";
		
		FileInputStream File = new FileInputStream (path);
	    
	    Sheet Data  = WorkbookFactory.create(File).getSheet("Sheet1");
	    
	   int D1 =  Data.getLastRowNum();
	   System.out.println(D1);
	   
	   for (int i=0;i<Data.getLastRowNum();i++) {
		   for (int j=0;j<Data.getRow(i).getLastCellNum();j++) {
			   
			   String Value = Data.getRow(i).getCell(j).getStringCellValue();
			   
			   System.out.print(Value+ "|");
			   
		   }
		   System.out.println();
	   }
	   
	   
	  
	}
}
