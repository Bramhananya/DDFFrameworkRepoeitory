package DDF_Framework;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Create_New_Sheet {
	
	public static void main(String[] args) throws IOException {
		
		FileInputStream fileinput = new FileInputStream("C:\\Users\\lenovo\\newbhima//StudentInformation.xlsx");
		XSSFWorkbook work = new XSSFWorkbook(fileinput);
		work.createSheet("Sample2Sheet");
		
		FileOutputStream fileoutput = new FileOutputStream("C:\\Users\\lenovo\\newbhima//StudentInformation.xlsx");
		work.write(fileoutput);
		work.close();
		fileinput.close();
		fileoutput.close();
		
	}

}
