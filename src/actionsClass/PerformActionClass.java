package actionsClass;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class PerformActionClass {

		public static void main(String[] args) throws InterruptedException {
		WebDriver driver;
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		
		
		driver.get("https://mousetester.com/");
		Thread.sleep(4000);
		/*
		Actions action = new Actions(driver);
		//WebElement element = driver.findElement(By.xpath("(//button[@type='submit'])[1]"));
		//WebElement element = driver.findElement(By.xpath("(//input[@placeholder='Email Address'])[1]"));
		//WebElement element = driver.findElement(By.linkText("About"));
		//action.moveToElement(element).build().perform();
		
		//WebElement element_1 = driver.findElement(By.linkText("Portfolio"));
		//element_1.click();
		
		     driver.switchTo().parentFrame();
		     driver.switchTo().frame(driver.findElement(By.xpath("(//iframe[@class='demo-frame lazyloaded'])[1]")));
		     WebElement from_element = driver.findElement(By.xpath("(//ul[@id='gallery']//li//img)[1]"));
		     WebElement to_element = driver.findElement(By.xpath("//div[@id='trash']"));
		     
		     
		     action.clickAndHold(from_element).moveToElement(to_element).release(to_element).build().perform();
		*/
		 Actions action = new Actions(driver);
		 //driver.switchTo().parentFrame();
	     //driver.switchTo().frame(driver.findElement(By.xpath("(//iframe[@class='demo-frame lazyloaded'])[1]")));
	     //WebElement from_element = driver.findElement(By.xpath("(//ul[@id='gallery']//li//img)[1]"));
	     //WebElement to_element = driver.findElement(By.xpath("//div[@id='trash']"));
		
		
		 //action.dragAndDrop(from_element, to_element).build().perform();
		 WebElement doubble_click = driver.findElement(By.xpath("//div[@id='clickMe']"));
		 action.doubleClick(doubble_click).build().perform();
		 
		 
		 
		 
		 
		 
		/*
		WebElement button = driver.findElement(By.xpath("(//button[@type='submit'])[1]"));
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		wait.until(ExpectedConditions.visibilityOf(button));
		button.click();
		*/
		
		}
		
		
}
