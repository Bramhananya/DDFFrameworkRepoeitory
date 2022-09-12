package DDF_Framework;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Orange_Hrm {
	
	public static void main(String[] args) throws InterruptedException, IOException {
		
		
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		driver.get("http://orangehrm.qedgetech.com");
		
		String title = driver.getTitle();
		System.out.println("The title of the page is => "+ title);
		
		FileInputStream fileinput = new FileInputStream("C:\\Users\\Public\\URL Fetching//AllAppUrl.xlsx");
		XSSFWorkbook work = new XSSFWorkbook(fileinput);
		
		    XSSFSheet sheet = work.getSheet("Sheet2");
		    
		  int lastrowno =  sheet.getLastRowNum();
		  System.out.println("The last row no.is : " + lastrowno);
		
		 Row rows = sheet.getRow(1);
		int lastcelllno =  rows.getLastCellNum();
		System.out.println("The last cell no. is s : " + lastcelllno);
		
		
		
		for(int r =1; r<=lastrowno; r++) {
			
		Row rown = 	sheet.getRow(r);
		
		String rrr    = rown.getCell(0).getStringCellValue();
		
		String ttt  = rown.getCell(1).getStringCellValue();
		
		driver.findElement(By.id("txtUsername")).sendKeys(rrr);
		driver.findElement(By.id("txtPassword")).sendKeys(ttt);
		
		driver.findElement(By.id("btnLogin")).click();
	
		Thread.sleep(5000);
		
		driver.navigate().back();
		
		 driver.findElement(By.id("txtUsername")).clear();
		 
		 driver.findElement(By.id("txtPassword")).clear();
		 
			
		driver.quit();	
	
		 	
		}
	
			//	System.out.println();
	}
	
}

		
	


