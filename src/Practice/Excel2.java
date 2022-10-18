package Practice;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Excel2 {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		
		FileInputStream File = new FileInputStream ("C:\\Users\\Admin\\Downloads\\Excel_21.09.2022.xlsx");
		
		Sheet Data = WorkbookFactory.create(File).getSheet("Sheet1");
		
		int data = Data.getLastRowNum();
		System.out.println(data);
		
		for (int i=0;i<Data.getLastRowNum();i++) {
			for (int j=0;j<Data.getRow(i).getLastCellNum();j++) {
				
				String Excel = Data.getRow(i).getCell(j).getStringCellValue();
				
				System.out.print(Excel+  " ");
			}
			System.out.println();
		}
		
	}
}
