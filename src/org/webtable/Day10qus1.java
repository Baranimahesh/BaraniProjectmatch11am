package org.webtable;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Day10qus1 {
public static void main(String[] args) throws AWTException, InterruptedException {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\ASUS\\eclipse-workspace\\sel1\\driver\\chromedriver.exe");
	WebDriver d1=new ChromeDriver();
	d1.get("https://www.amazon.com/");
	d1.manage().window().maximize();
	WebElement btnsearch = d1.findElement(By.id("twotabsearchtextbox"));
   btnsearch.sendKeys("iphones x",Keys.ENTER);
   WebElement btnproduct = d1.findElement(By.xpath("(//span[text()='Apple iPhone X, 64GB, Space Gray - Fully Unlocked (Renewed Premium)'])"));
   Actions a=new Actions(d1);
   Robot r1=new Robot();
   a.contextClick(btnproduct).perform();
   r1.keyPress(KeyEvent.VK_DOWN);
   r1.keyRelease(KeyEvent.VK_DOWN);
   r1.keyPress(KeyEvent.VK_ENTER);
   r1.keyRelease(KeyEvent.VK_ENTER);
   String windowHandle = d1.getWindowHandle();
   System.out.println(windowHandle);
   Set<String> windowHandles = d1.getWindowHandles();
   System.out.println(windowHandles);
   for(String v : windowHandles) {
if(!windowHandle.equals(v)) {
	d1.switchTo().window(v);
}
}
   Thread.sleep(3000);
	WebElement txtprice = d1.findElement(By.xpath("(//span[text()='$409.00'])"));
	   String text=txtprice.getText();
	   System.out.println("Price is "+text);
	   System.out.println("Price is "+text);
	   System.out.println("Price is "+text);
	   System.out.println("Price is "+text);
	   System.out.println("Price is "+text);

   }
   
   
   
}

