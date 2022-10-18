package Practice;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Excel1 {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		
	FileInputStream file = new FileInputStream ("C:\\Users\\Admin\\Downloads\\Excel_21.09.2022.xlsx");
	
	String Data = WorkbookFactory.create(file).getSheet("Sheet1").getRow(0).getCell(1).getStringCellValue();
	
	System.out.println(Data);
	}
}
