package practice;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class redbus {
	@Test	
	public void redbus() throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("https://www.redbus.in");
		driver.findElement(By.id("src")).sendKeys("Banglore"+Keys.ENTER);
		driver.findElement(By.xpath("//text[text()='Bangalore']/ancestor::li[@class='sc-iwsKbI jTMXri cursorPointing']")).click();
		driver.findElement(By.id("dest")).sendKeys("Hubli"+Keys.ENTER);
		driver.findElement(By.xpath("//text[text()='Hubli']/ancestor::div[@class='sc-htpNat kWSbju']")).click();
		driver.findElement(By.xpath("//span[text()='Date']")).click();
		WebElement ele = driver.findElement(By.xpath("//div[text()='Jun' and text()='2024']/ancestor::div[@class='sc-jzJRlG dPBSOp']/descendant::span[@class='DayTiles__CalendarDaysSpan-sc-1xum02u-1 fgdqFw']"));
		Thread.sleep(2000);
		
//		Actions act = new Actions(driver);
//		act.moveToElement(ele).perform();
		
		String value = ele.getCssValue("background");
		System.out.println(value);
		driver.findElement(By.xpath("//button[text()='SEARCH BUSES']")).click();
		//driver.findElement(By.id("search_button")).click();
		Thread.sleep(2000);
		//driver.close();
	}
}
