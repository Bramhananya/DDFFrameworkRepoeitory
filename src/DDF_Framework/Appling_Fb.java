package DDF_Framework;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;



public class Appling_Fb {
	
 public static void main(String[] args) throws IOException, InterruptedException{
		
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		
		WebDriver  driver=new ChromeDriver();
		
		driver.get("http://orangehrm.qedgetech.com");
		System.out.println(" Url entered successfully : code modified");
		System.out.println("Shreekant");
		
		
		FileInputStream fis=new FileInputStream("C:\\All Practice Chart//Primusbanklogin.xlsx");
		
		XSSFWorkbook workbook=new XSSFWorkbook(fis);
		
		XSSFSheet sheet=workbook.getSheet("sheet2");
		
	int rowcount=	sheet.getLastRowNum();
	
	System.out.println("no of records in xcellsheet : " + rowcount);
	
	
		  
	   	//	System.out.println(alertmsg);
	   		
	   		Thread.sleep(2000);
	   		
	   	//	driver.switchTo().alert().accept();
	    	   
		 
		// Thread.sleep(2000);
		 
	//	driver.navigate().back();
		 
	///	Thread.sleep(2000);
		
	}
	//	System.out.println();
 }
 
//}



