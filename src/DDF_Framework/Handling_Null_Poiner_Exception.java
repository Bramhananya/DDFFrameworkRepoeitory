package DDF_Framework;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Handling_Null_Poiner_Exception {
	
	public static void main(String[] args) throws IOException {
		
		               FileInputStream fileinput = new FileInputStream("C:\\Users\\lenovo\\newbhima//StudentInformation.xlsx");
		               XSSFWorkbook work = new XSSFWorkbook(fileinput);
		               XSSFSheet sheet =   work.getSheet("Sheet1");
		               
		                int lastrowno =     sheet.getLastRowNum();
		                System.out.println("The last row no.is : " + lastrowno);
		               
		                Row count = sheet.getRow(1);
		               int lastcellno = count.getLastCellNum();
		               System.out.println("The last cell no. is : " + lastcellno);
		             
		               String data;
		               
		                 try {
		            	   		               
		                 Cell cellno = count.getCell(7);
		                 String str =  cellno.getStringCellValue();
		                 System.out.println("The cell no.is : " + str );
		               
		               } catch (Exception e) {
						
		            	   data =   "     "  ;
		            	   System.out.println("No data is found ! ");
						
					}
		               
		        fileinput.close();
		        work.close();
		
	}

}
