package org.webtable;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Webhandling {
public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\ASUS\\eclipse-workspace\\sel1\\driver\\chromedriver.exe");
	WebDriver d1=new ChromeDriver();
	d1.get("https://www.flipkart.com/");
	d1.manage().window().maximize();
	WebElement closelogin = d1.findElement(By.xpath("//button[@class='_2KpZ6l _2doB4z']"));
	closelogin.click();
	WebElement search = d1.findElement(By.name("q"));
	search.sendKeys("iphone",Keys.ENTER);
	Thread.sleep(3000);
	WebElement product = d1.findElement(By.xpath("//div[text()='APPLE iPhone SE (Black, 64 GB)']"));
    product.click();
    String par = d1.getWindowHandle();
   System.out.println(par);
   Set<String> all = d1.getWindowHandles();
    System.out.println(all);
    for(String x:all) {
    	if(!par.equals(x)) {
    		d1.switchTo().window(x);
    	}
    }
WebElement addcart = d1.findElement(By.xpath("//button[text()='ADD TO CART']"));
 addcart.click();
}
}
