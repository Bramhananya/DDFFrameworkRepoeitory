package DDF_Framework;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Fetchinf_data {
	
	      public static void main(String[] args) throws IOException  {

          	FileInputStream fileinput = new FileInputStream("C:\\Users\\lenovo\\newbhima//StudentInformation.xlsx");	      
          	XSSFWorkbook workbook = new XSSFWorkbook(fileinput);
          	
              XSSFSheet 	sheetno = workbook.getSheet("sheet2");
              int row =   sheetno.getLastRowNum();            
              System.out.println("The row no. is : " + row);
              
             int cell = sheetno.getRow(0).getLastCellNum();
              System.out.println("the last cell no : " +  cell);
              
              
             for(int i = 0;i<row;i++){
            	XSSFRow allnames =  sheetno.getRow(i);
            
            	      for(int c =0; c<cell;c++) {
            	    	  
            	 String  allcellname =  allnames.getCell(c).toString();
            	 System.out.print("      : " +  allcellname);
            	 
             }
            	  System.out.println();
       }
              
                   
	}
}
	


