package DDF_Framework;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Counting_Rowsand_Columns {
	
	public static void main(String[] args) throws IOException {
		
		FileInputStream fileinput = new FileInputStream("C:\\Users\\lenovo\\newbhima//StudentInformation.xlsx");
		XSSFWorkbook workbook = new XSSFWorkbook(fileinput);
		XSSFSheet sheet1 = workbook.getSheet("Sheet1");
		XSSFSheet sheet2 = workbook.getSheet("Sheet2");
		
	    int lastrowno =	sheet1.getLastRowNum();
	    System.out.println("The last row no. is : " + lastrowno);	
	    
	        int lastrow = sheet2.getLastRowNum();
	        System.out.println("The last row no. is : " + lastrow);
	        
	        fileinput.close();
	        workbook.close();
	        
	        System.out.println("The test cese is pass");
	        
	}	
}

