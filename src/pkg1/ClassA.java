package pkg1;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class ClassA{

	
public static void main(String args[]) throws InterruptedException, IOException {
		
System.setProperty("webdriver.chrome.driver", "E:\\TK_Testing\\Automation\\chromedriver_win32 (1)\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.flipkart.com/");
		
		Thread.sleep(1000);
		
   
         WebElement emailField=driver.findElement(By.xpath("//input[@class='_2IX_2- VJZDxU']"));
         emailField.sendKeys("tilottama.kadam25@gmail.com");
         
         WebElement password=driver.findElement(By.xpath("//input[@class='_2IX_2- _3mctLh VJZDxU']"));
         password.sendKeys("tilottama12345");
         
         WebElement ftnbutton=driver.findElement(By.xpath("(//button[@type='submit'])[2]"));
         ftnbutton.click();
         
         Thread.sleep(4000);
         for(int i=1;i<=10;i++)
         {         
        	 
         getScreenShot(driver);
         }
         
         //WebElement phoneNumber=driver.findElement(By.xpath("(//input[@class='_2IX_2- VJZDxU'])[2]"));
         
   //phoneNumber.sendKeys("9527142964");
        
	}
	public static void getScreenShot(WebDriver driver) throws IOException, InterruptedException
	{
         Date date=new Date();
         System.out.println(false);
         SimpleDateFormat frmt=new SimpleDateFormat("hhmmss");
         String time=frmt.format(date);
         
         TakesScreenshot ts=(TakesScreenshot)driver;
         File source=ts.getScreenshotAs(OutputType.FILE);
        
		File dest=new File("E:\\TK_Testing\\Automation\\Screenshot\\"+time+".jpg");
		FileHandler.copy(source, dest);
   
		 Thread.sleep(2000);
      
        }
	
	
	 

}