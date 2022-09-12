package DDF_Framework;

import java.io.FileInputStream;

import java.io.IOException;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

                           /* code for counting the no.of columns present in the rows  */
                                    
public class Counting_CellNo {
	
	public static void main (String[]args) throws IOException {
		
		FileInputStream fileinput = new FileInputStream("C:\\Users\\lenovo\\newbhima//StudentInformation.xlsx");
		XSSFWorkbook work = new XSSFWorkbook(fileinput) ;
		
	    XSSFSheet sheet1 = 	work.getSheet("Sheet1");
	    XSSFSheet sheet2 = work.getSheet("Sheet2");
	    
	      Row rowno = sheet1.getRow(0);
	       Row row2 =   sheet2.getRow(1);
	       
	        int cellno1 =  rowno.getLastCellNum();
		   System.out.println("The last cell no.is : " + cellno1);
		   
	      	int cellno2 =   row2.getLastCellNum();
	      	System.out.println("The last cxell no. is : " + cellno2 );
				      	
	      	fileinput.close();
	      	work.close();
		
	}
	
}
