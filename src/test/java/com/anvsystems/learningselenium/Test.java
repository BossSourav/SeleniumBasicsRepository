package com.anvsystems.learningselenium;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import net.bytebuddy.asm.Advice.Enter;

public class Test {

	public static void main(String[] args) throws InterruptedException
	{
		
		//System.out.println(System.getProperty("os.name"));
				System.setProperty("webdriver.chrome.driver","./binaries/chromedriver.exe");
				WebDriver driver = new ChromeDriver();
				driver.get("https://www.amazon.in/?&ext_vrnc=hi&tag=googhydrabk1-21&ref=pd_sl_7hz2t19t5c_e&adgrpid=58355126069&hvpone=&hvptwo=&hvadid=678711876615&hvpos=&hvnetw=g&hvrand=11924447850963018206&hvqmt=e&hvdev=c&hvdvcmdl=&hvlocint=&hvlocphy=1007799&hvtargid=kwd-10573980&hydadcr=14453_2371562");
				Thread.sleep(2000);
				driver.findElement(By.id("nav-link-accountList")).click();
//				Thread.sleep(1000);
//				driver.findElement(By.name("q")).sendKeys(Keys.ENTER);
				Thread.sleep(9000);
				driver.quit();
				
	}
}
