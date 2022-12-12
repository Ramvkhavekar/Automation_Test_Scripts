package generic_script;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Generic_Excel {
	public static String getdata(String sheet,int row,int cell) throws EncryptedDocumentException, IOException
	{
		FileInputStream fis = new FileInputStream("./excel/new.xlsx");
		Workbook book = WorkbookFactory.create(fis);
		 Cell cel = book.getSheet(sheet).getRow(row).getCell(cell);
		String val = cel.getStringCellValue();
		System.out.println(val);
		return val;
	}

}
