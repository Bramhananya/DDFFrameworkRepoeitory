package DDF_Framework;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Writing_Datas_In_Sheet {
	
	public static void main(String[] args) throws IOException {
		
		FileInputStream fileinput = new FileInputStream("C:\\Users\\lenovo\\GirlsDetails//GirlsDetailsInf.xlsx");          
		XSSFWorkbook work= new XSSFWorkbook(fileinput);
		XSSFSheet sheet = work.getSheet("Sheet1");
		
		Row firstrow = sheet.getRow(1);
		Cell cellno1 = firstrow.createCell(1);
		cellno1.setCellValue("Mounami");
		
		FileOutputStream fileoutput = new FileOutputStream("C:\\Users\\lenovo\\GirlsDetails//GirlsDetailsInf.xlsx");
		work.write(fileoutput);
				
		fileinput.close();
		work.close();
		fileoutput.close();
				
	}

}
