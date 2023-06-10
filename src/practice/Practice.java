package practice;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.apache.commons.lang3.time.StopWatch;
import org.openqa.selenium.By;
import org.openqa.selenium.SearchContext;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Practice {
	
	//long finish;
	@SuppressWarnings("unused")
	public static void main(String args[]) throws InterruptedException {
		//int finish = 0;
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.saucedemo.com/inventory.html");

		driver.findElement(By.xpath("//input[@id='user-name']")).sendKeys("standard_user");
		driver.findElement(By.xpath("//input[@id='password']")).sendKeys("secret_sauce");
		driver.findElement(By.xpath("//input[@id='login-button']")).click();
		Thread.sleep(2000);
		
		//nt start = (int) System.currentTimeMillis();
		//System.out.println(start);
		
		//StopWatch watch = new StopWatch();
		//watch.start();
		
		List<WebElement> products = driver.findElements(By.xpath("//div[@class='inventory_item']"));
		
		
		//WebElement prod = products.stream().filter(p->p.getText().contains("Backpack")).findFirst().orElse(null);
		/*
		for(WebElement prods : products) {
			
			if(prods.getText().contains("Backpack")) {
				prods.findElement(By.xpath("//button[@class='btn btn_primary btn_small btn_inventory']")).click();
				watch.stop();
				//finish = (int) System.currentTimeMillis();
				//System.out.println(finish);
				break;
			}
		}
		*/
		
	
		//System.out.println("Time Elapsed :" + watch.getTime(TimeUnit.MILLISECONDS));
		//int timeElapsed = (int) (finish - start);
		//System.out.println(timeElapsed);
		
		
		for(int i=0; i<products.size(); i++) {
			if(products.get(i).getText().contains("Backpack")) {
				 driver.findElements(By.xpath("//button[@class='btn btn_primary btn_small btn_inventory']")).get(i).click();
				break;
			}
			else {
				System.out.println("Product Not Found");
				break;
			}
		}
		
		
		
		// ...
		//long finish = System.currentTimeMillis();
		//long timeElapsed = finish - start;
	}

}
