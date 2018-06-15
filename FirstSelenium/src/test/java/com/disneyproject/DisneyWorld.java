package com.disneyproject;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
//import org.openqa.selenium.By;
//import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
//import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DisneyWorld {

	public static void main(String[] args) throws Throwable {
	    
		//Open Google Chrome browser
		System.setProperty("webdriver.chrome.driver", "./Driver/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		//Maximize the Window
		driver.manage().window().maximize();
		
		//Wait 20 second
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS); 
		
		//Launch Disney World website
		driver.get("https://disneyworld.disney.go.com/");
		
		//Wait 20 second
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS); 
		
		//driver.findElement(By.xpath("(//*[starts-with(text(),'My Account')])")).click();
		WebElement signin = driver.findElement(By.xpath("(//*[starts-with(text(),'Sign In or Create Account')])"));
		signin.click();
		
		//driver.findElement(By.xpath("(//*[@id='loginPageUsername'])]//following::input)")).sendKeys("bugbusterpro@gmail.com");
		//driver.findElement(By.xpath("(//*[@id='loginPagePassword'])]//following::input)")).sendKeys("Myselenium1");
		
						
		WebElement email = driver.findElement(By.xpath("(//*[@id='loginPageUsername']"));
		email.sendKeys("bugbusterpro@gmail.com");
		
		WebElement password = driver.findElement(By.xpath("//*[@id='loginPagePassword']"));
		password.sendKeys("Myselenium1");
		
		Thread.sleep(2000);
		
		
		WebElement loginbtn = driver.findElement(By.xpath("(//*[@class='buttonText'])[1]"));
		loginbtn.click();
		
		Thread.sleep(2000);
		driver.close();

	
	}

		
	}

