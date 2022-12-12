package test_script;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.testng.Assert;
import org.testng.annotations.Test;

import generic_script.Base_Test;
import generic_script.Generic_Excel;
import pom_script.Generic_POM;

public class Test1 extends Base_Test  {
	@Test
	public void test1() throws EncryptedDocumentException, IOException
	{
		String us = Generic_Excel.getdata("Sheet1", 0, 0);
		String pass = Generic_Excel.getdata("Sheet1", 1, 0);
		
		Generic_POM gp = new Generic_POM(driver);
		gp.usn(us);
		gp.psw(pass);
		//Assert.fail();
		gp.log();
	
	
		
	}
	

}
