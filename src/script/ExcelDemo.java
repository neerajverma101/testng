package script;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

import generic.IAutoCons;

public class ExcelDemo {

	public static void main(String[] args) throws EncryptedDocumentException, InvalidFormatException, IOException {
		FileInputStream fis = new FileInputStream(IAutoCons.INPUT_PATH);
		// open excel file
		Workbook wb=WorkbookFactory.create(fis);
		Sheet s=wb.getSheet("Sheet1");
		Row r=s.getRow(0);
		Cell c=r.getCell(0);
		String value=c.getStringCellValue();
		System.out.println(value);
		//write data
		c.setCellValue("manager");
		FileOutputStream fos=new FileOutputStream(IAutoCons.INPUT_PATH);
		wb.write(fos);
		wb.close();
		

	}

}
