package DDF_Framework;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Fetching_Girls_Inf {
		
	public static void main(String[] args) throws IOException {
		
		FileInputStream fileinput = new FileInputStream("C:\\Users\\lenovo\\GirlsDetails//GirlsDetailsInf.xlsx");
		XSSFWorkbook work = new XSSFWorkbook(fileinput);
	    XSSFSheet sheet =	work.getSheet("Sheet1");
	    
	     int rowno =  sheet.getLastRowNum();
	     System.out.println("The last row no is : " + rowno);
	     
	        Row row1 = sheet.getRow(0);
	        int  lastcellno =   row1.getLastCellNum();
	        System.out.println("The last cell no. is : " + lastcellno);
	        System.out.println("---------------------------------------------------------------------------------------------------------------------------");	  
	        
	        org.apache.poi.ss.usermodel.Cell c1 =  row1.getCell(0);
	        org.apache.poi.ss.usermodel.Cell c2 =  row1.getCell(1);
	        org.apache.poi.ss.usermodel.Cell c3 =  row1.getCell(2);
	        org.apache.poi.ss.usermodel.Cell c4 =  row1.getCell(3);
	        org.apache.poi.ss.usermodel.Cell c5 =  row1.getCell(4);
	          	        
	      String s1 =  c1.getStringCellValue();
	       String s2 =     c2.getStringCellValue();
	       String s3 = c3.getStringCellValue();
	        String s4 = c4.getStringCellValue();
	        String s5 =   c5.getStringCellValue();
	        
	        System.out.println(c1);
	        System.out.println(c2);	        
	        System.out.println(c3);	        
	        System.out.println(c4);
	        System.out.println(c5);
	        
	         Row r =     sheet.getRow(1);
	         
	         org.apache.poi.ss.usermodel.Cell count1 =  r.getCell(0);
	         org.apache.poi.ss.usermodel.Cell count2 =   r.getCell(1);
	         org.apache.poi.ss.usermodel.Cell count3 =    r.getCell(2);
	         org.apache.poi.ss.usermodel.Cell count4 =    r.getCell(3);
	         org.apache.poi.ss.usermodel.Cell count5 =   r.getCell(4);
	         
	           System.out.println( );	         
	         System.out.println( count1 + "     " + count2 + "    " +count3 + "      " +count4 + "    " + count5 + "     ");
	         System.out.println("---------------------------------------------------------------------------------------------------------------------------");
	         
	      System.out.println( count1);
	      System.out.println( count2);
	      System.out.println( count3);
	      System.out.println( count4);
	      System.out.println( count5);
	      
	      System.out.println("---------------------------------------------------------------------------------------------------------------------------");
	     for(int t = 0; t<rowno;t++) {
	            	XSSFRow allrows =   sheet.getRow(t);
	            	
	            	for(int c = 0; c<lastcellno;c++) {
	            		
	            	String str	 = allrows.getCell(c).toString();
	            	System.out.print("           : " + str);
	            		
	            	}
	            	   System.out.println();
	               }
	               
	     System.out.println("---------------------------------------------------------------------------------------------------------------------------");
	        		fileinput.close();
	        		work.close();
	        		
	}
	
}







