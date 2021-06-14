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

public class Day10qus2 {
public static void main(String[] args) throws AWTException, InterruptedException {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\ASUS\\eclipse-workspace\\sel1\\driver\\chromedriver.exe");
	WebDriver d1=new ChromeDriver();
	d1.get("https://www.snapdeal.com/");
	d1.manage().window().maximize();
	WebElement btnsearch = d1.findElement(By.id("inputValEnter"));
   btnsearch.sendKeys("iphone7",Keys.ENTER);
   Actions a=new Actions(d1);
   Thread.sleep(2000);
   WebElement product = d1.findElement(By.xpath("(//img[@class='product-image '])[1]"));
   a.contextClick(product).perform();
   Thread.sleep(2000);
   Robot r1=new Robot();  
   r1.keyPress(KeyEvent.VK_DOWN);
   r1.keyRelease(KeyEvent.VK_DOWN);
   r1.keyPress(KeyEvent.VK_ENTER);
   r1.keyRelease(KeyEvent.VK_ENTER);
   Thread.sleep(3000);
   String windowHandle = d1.getWindowHandle();
   System.out.println(windowHandle);
   Set<String> windowHandles = d1.getWindowHandles();
   System.out.println(windowHandles);
 
   for(String v : windowHandles) {
if(!windowHandle.equals(v)) {
	d1.switchTo().window(v);
   
}
}
  WebElement addCart=d1.findElement(By.id("add-cart-button-id"));
  addCart.click();
  WebElement price = d1.findElement(By.xpath("//div[@class='you-pay']"));
  String text = price.getText();
  System.out.println(text);
}

}