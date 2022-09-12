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

public class Url_Fetching {
	
	public static void main(String[] args) throws IOException, InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		driver.get("https://facebook.com");
		
		String title = driver.getTitle();
		System.out.println("The title of the page is  => "+ title);
		
		Thread.sleep(2000);
		
		FileInputStream fileinput = new FileInputStream("C:\\Users\\Public\\URL Fetching//AllAppUrl.xlsx");
		XSSFWorkbook work = new XSSFWorkbook(fileinput);
		
		    XSSFSheet sheet = work.getSheet("Sheet1");
		    
		  int lastrowno =  sheet.getLastRowNum();
		  System.out.println("The last row no.is : " + lastrowno);
		
		 Row rows = sheet.getRow(1);
		int lastcelllno =  rows.getLastCellNum();
		System.out.println("The last cell no. is s : " + lastcelllno);
		
		
		
		for(int r =1; r<=lastrowno; r++) {
			
		Row rown = 	sheet.getRow(r);
		
		String rrr    = rown.getCell(0).getStringCellValue();
		
		String ttt  = rown.getCell(1).getStringCellValue();
		
		driver.findElement(By.xpath("//input[@id='email']")).sendKeys(rrr);
		driver.findElement(By.xpath("//input[@id='pass']")).sendKeys(ttt);
		
		driver.findElement(By.xpath("//*[@type='submit']")).click();
		
		Thread.sleep(3000);
		
		driver.navigate().back();
		
		 driver.findElement(By.xpath("//input[@id='email']")).clear();
		 driver.findElement(By.xpath("//input[@id='pass']")).clear();
		 
			Thread.sleep(4000);
	
		System.out.println("All test cases passed.............");
		
		System.out.println("All accounts are successfully hacked..................");
				 	
		}
	
			//	System.out.println();
	}
	
}
