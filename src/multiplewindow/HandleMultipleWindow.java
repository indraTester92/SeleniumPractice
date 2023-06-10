package multiplewindow;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandleMultipleWindow {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		WebDriver driver;
		driver= new ChromeDriver();
		
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		driver.manage().window().maximize();
		//driver.findElement(By.id("openwindow")).click();
		driver.findElement(By.linkText("Open Tab")).click();
		//System.out.println(driver.getWindowHandle());
		
		//String parentWindow = driver.getWindowHandle();
		Set<String> windows = driver.getWindowHandles();
		Iterator <String> it = windows.iterator();
		String ParentWindow = it.next();
		String childWindow = it.next();
		
		driver.switchTo().window(childWindow);
		driver.findElement(By.linkText("Access all our Courses")).click();
		
		
		/*
		Iterator<String> it =windows.iterator();
		while(it.hasNext()) {
			
			String child_window = it.next();
			driver.switchTo().window(child_window);
			if(!parentWindow.equals(child_window)) {
				
				driver.manage().window().maximize();
				driver.findElement(By.linkText("Access all our Courses")).click();
			}
			driver.switchTo().window(parentWindow);
		}
		*/
		
		
		//driver.manage().window().maximize();
		//driver.findElement(By.linkText("Access all our Courses")).click();
		
		System.out.println("Selenium demo couse");
		
		
	}

}
