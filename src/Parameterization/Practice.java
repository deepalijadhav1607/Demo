package Parameterization;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Practice {

	public static void main(String[] args) throws EncryptedDocumentException, IOException  {
		
		FileInputStream Data = new FileInputStream("C:\\Users\\Admin\\Downloads\\Excel_15.09.2022.xlsx");
		
		Sheet S1 = WorkbookFactory.create(Data).getSheet("Sheet1");
		
		int num = S1.getLastRowNum();
        System.out.println(num); 
        
        for (int i=0;i<S1.getLastRowNum();i++) {
        	
        	for (int j=0;j<S1.getRow(i).getLastCellNum();j++) {
        		
        		String Excel = S1.getRow(i).getCell(j).getStringCellValue();
        		
        		System.out.print(Excel+ " ");
        		
        	}
        	
        	System.out.println();
        }
		 
	 }
        }
		

	
	   

	
	
	
	



