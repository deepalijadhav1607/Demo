package Parameterization;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Excel {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		
		String path ="C:\\Users\\Admin\\Desktop\\ExcelPractice.xlsx";
		
		FileInputStream Data = new FileInputStream(path);
		
		String Data1 = WorkbookFactory.create(Data).getSheet("Sheet1").getRow(2).getCell(0).getStringCellValue();
		
		System.out.println(Data1);
	}
}
                                    