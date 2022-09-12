package DDF_Framework;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.poi.hssf.record.PageBreakRecord.Break;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Primus_bank_login {
	
	public static void main(String[] args) throws IOException, InterruptedException {
		
		
    	System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		WebDriver driver = new ChromeDriver();		
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();	
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get("http://primusbank.qedgetech.com");
		
 		
		FileInputStream fileinput = new FileInputStream("C:\\Users\\Public\\URL Fetching//AllAppUrl.xlsx");	      
      	XSSFWorkbook workbook = new XSSFWorkbook(fileinput);
      	
          XSSFSheet 	sheetno = workbook.getSheet("sheet2");
          int row =   sheetno.getLastRowNum();
          
          System.out.println("The row no. is : " + row);
          
           int cell = sheetno.getRow(0).getLastCellNum();
         
          System.out.println("the last cell no : " +  cell);
          
          for(int i=0; i<=row; row++) 	   
        	  
          {        
        	  
        	XSSFRow current_row = sheetno.getRow(i);
        	
         	String firstname = current_row.getCell(0).getStringCellValue();     
    		String lastname = current_row.getCell(1).getStringCellValue();
    		
      		 driver.findElement(By.xpath("//*[@type='text']")).sendKeys(firstname);
      		   
      		 driver.findElement(By.xpath("//*[@type='password']")).sendKeys(lastname);
      		 
      		 driver.findElement(By.xpath("//*[@name='login']")).click();
      		 
      		Thread.sleep(2000);
      		
      		driver.switchTo().alert().accept();
      	    
      		 
      		Thread.sleep(2000);
      		
      	//	driver.navigate().back();
      		 
      		 driver.findElement(By.xpath("//*[@type='text']")).clear();
      		 driver.findElement(By.xpath("//*[@type='password']")).clear();
      		 
      	//	 driver.navigate().back();
      	
      	//	driver.switchTo().alert().accept();
      	    
	}

	
	}
}

	

