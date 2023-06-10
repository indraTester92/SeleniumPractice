package dynamicdropdown;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandleDynamicDropdown {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		WebDriver driver ;
		
		driver = new ChromeDriver();
		
		driver.get("https://www.google.com/maps/@23.7000294,87.0724153,15z");
		
		driver.findElement(By.xpath("//input[@id='searchboxinput']")).sendKeys("Asansol");
		Thread.sleep(2000);
		
		List<WebElement> stations = driver.findElements(By.xpath("//div[@class='sbse']"));
		
		for(WebElement station : stations) {
			
			if(station.getText().contains("Asansol West Bengal")) {
				
				//((WebElement) stations).click();
			
				
				station.click();
				break;
			}
		}
		
		
		
		
		////div[@class='sbse']
		
	}

}
