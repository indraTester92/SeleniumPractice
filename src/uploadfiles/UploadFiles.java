package uploadfiles;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class UploadFiles {

	public static void main(String args[]) throws AWTException, InterruptedException {
		
		WebDriver driver; 
		driver= new ChromeDriver();
		
		driver.get("https://cgi-lib.berkeley.edu/ex/perl5/fup.html");
		
		Thread.sleep(3000);
	
		driver.findElement(By.xpath("//input[@name='upfile']")).click();
		
		Robot r = new Robot();
		
		r.delay(2000);
		StringSelection file = new StringSelection("/Users/indrajitchakraborty/Downloads/demo_pdf.pdf");
		
		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(file,null);
		
		
		 
		r.keyPress(KeyEvent.VK_CONTROL);
		r.keyPress(KeyEvent.VK_V);
		
		r.keyRelease(KeyEvent.VK_CONTROL);
		r.keyRelease(KeyEvent.VK_V);
		
		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);
		
		
		
		//driver.findElement(By.xpath("//input[@id='js-file-input']")).sendKeys("/Users/indrajitchakraborty/Downloads/demo_pdf.pdf");
	}
}
//https://ps.uci.edu/~franklin/doc/file_upload.html