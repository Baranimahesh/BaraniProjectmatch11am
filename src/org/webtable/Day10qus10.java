package org.webtable;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Day10qus10 {
public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\ASUS\\eclipse-workspace\\sel1\\driver\\chromedriver.exe");
	WebDriver d1=new ChromeDriver();
	d1.get("https://www.flipkart.com/");
	d1.manage().window().maximize();
// d1.manage()).timesout().implicitWait(timeout,timeUnit.seconds);
	WebElement closelogin = d1.findElement(By.xpath("//button[@class='_2KpZ6l _2doB4z']"));
	closelogin.click();
	
	WebElement search = d1.findElement(By.name("q"));
	search.sendKeys("mask",Keys.ENTER);
	WebElement btnm = d1.findElement(By.xpath("(//a[@class='s1Q9rs'])[1]"));
	btnm.click();
	WebElement btnpincode = d1.findElement(By.xpath("(//form[@class='N79-rD'])"));
	btnpincode.click();
	btnpincode.sendKeys("600119",Keys.ENTER);   
}
}
