package com.anvsystems.learningselenium;





import org.openqa.selenium.By;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;



public class GoogleBot {
	public static void main(String[] args) throws InterruptedException
	{
		//System.out.println(System.getProperty("os.name"));
		System.setProperty("webdriver.chrome.driver","./binaries/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
//		driver.get("https://www.google.com");
//		driver.findElement(By.name("q")).sendKeys("Automation");
//		driver.findElement(By.name("q")).sendKeys(Keys.ENTER);
		driver.get("https://www.amazon.com");
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("shirts");
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys(Keys.ENTER);
		
		Thread.sleep(10000);
		driver.quit();
		
	
	}

}
