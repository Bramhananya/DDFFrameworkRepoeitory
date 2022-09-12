package DDF_Framework;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Reading_Dataa {
	
	public static void main(String[] args) throws IOException {
		
		FileInputStream fileinput = new FileInputStream("C:\\Users\\lenovo\\newbhima//StudentInformation.xlsx");
		XSSFWorkbook work = new XSSFWorkbook(fileinput);		
		XSSFSheet sheet = work.getSheet("Sheet1");
		
		int  lastrowno = sheet.getLastRowNum();
		System.out.println("The last row no is : " + lastrowno);
		
     	Row rows =	sheet.getRow(0);
     	int   cellastno = rows.getLastCellNum();
     	System.out.println("The last cell no is : " + cellastno );
     	
     	
          Cell c1 = 	rows.getCell(0);
     	   Cell c2 =	rows.getCell(1);
	      Cell c3 =	rows.getCell(2);
	      
	     String name = c1.getStringCellValue();
	     String name2 = c2.getStringCellValue();
	     String name3= c3.getStringCellValue();
	     
	     System.out.println("Name of the living city : " + c1);
	     System.out.println("Name of the student : " + c2);
	     System.out.println("Payment of the student : " + c3);
	     
	     
	     Row row2  =  sheet.getRow(1);
	    
	    Cell cc1 =   row2.getCell(0);
	    Cell cc2 =   row2.getCell(1);
	     Cell cc3 =  row2.getCell(2);
	     
	     System.out.println("Name of the living city : " + cc1);
	     System.out.println("Name of the student : " + cc2);
	     System.out.println("Payment of the student : " + cc3); 
	     
	     for(int r = 0; r<lastrowno; r++)
	    	 
	     {
	    	 
	    	XSSFRow rrow =    sheet.getRow(r);
	    	 
	    	 for(int c = 0; c<cellastno; c++) {
	    		 
	    		String print = rrow.getCell(c).toString();
	    		System.out.print("      : " + print);
	    		
	    	 }
	    	 System.out.println();
	     }
	     
	     
	     fileinput.close();
	     work.close();
	     
		
	}

}
