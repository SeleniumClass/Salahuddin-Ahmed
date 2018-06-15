package com.eshop;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GcrEshop {

	public static void main(String[] args) throws Throwable {
		//Open Google Chrome browser
		System.setProperty("webdriver.chrome.driver", "./Driver/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		//Maximize the Window
		driver.manage().window().maximize();
		Thread.sleep(5000);
		driver.get("http://www.gcrit.com/build3/");
		
		//Wait 20 second
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS); 
		
		driver.findElement(By.xpath("(//*[starts-with(text(),'My Account')])")).click();
		
		driver.findElement(By.xpath("(//*[contains(text(),'')]//following::input)[2]")).sendKeys("bugbusterpro@gmail.com");
		driver.findElement(By.xpath("(//*[contains(text(),'')]//following::input)[3]")).sendKeys("Myselenium1");
		
		driver.findElement(By.xpath("//*[starts-with(text(),'Sign In')]")).click();
		driver.findElement(By.xpath("//*[starts-with(text(),'Catalog')]")).click();
		driver.findElement(By.xpath("//*[starts-with(text(),'new products')]")).click();
		
		List<WebElement> productList = driver.findElements(By.xpath("//div[contains(@class,'content')]//tr"));
		
		int count = productList.size();
		System.out.println("Number of new product listed: " + count);
				
		Thread.sleep(5000);
		//driver.close();
	

	}



}
