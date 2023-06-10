package frame;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.safari.SafariDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class LearnFrame {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.automationtesting.in/Frames.html");
		
		driver.findElement(By.linkText("Iframe with in an Iframe")).click();
		//Thread.sleep(2000);
		//driver.switchTo().frame(driver.findElement(By.xpath(" //iframe[@src='MultipleFrames.html']")));
		driver.switchTo().parentFrame();
		//driver.findElement(By.id("u_5_5")).click();
		driver.switchTo().frame(driver.findElement(By.cssSelector("iframe[src='SingleFrame.html']")));
		//driver.findElement(By.id("u_5_6")).click();
	
		
		
		WebElement input = driver.findElement(By.xpath("//input[@type='text']"));
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		wait.until(ExpectedConditions.visibilityOf(input));
		input.sendKeys("hbdhdvhd");
		
	}

}
