package org.webtable;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Day10qus3 {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\ASUS\\eclipse-workspace\\sel1\\driver\\chromedriver.exe");
		WebDriver d1=new ChromeDriver();
	   d1.get("http://www.greenstechnologys.com/python-training.html");
		d1.manage().window().maximize();
		JavascriptExecutor js=(JavascriptExecutor)d1;
		WebElement txtuser = d1.findElement(By.xpath("(//button[@type='button'])[1]"));
		js.executeScript("arguments[0].click()", txtuser);
		
		WebElement txttestpaper = d1.findElement(By.xpath("//h3[text()='Selenium Test Papers']"));
		js.executeScript("arguments[0].click()", txttestpaper);
		WebElement day10task = d1.findElement(By.xpath("//h3[text()='Selenium Day 10 Task']"));
		js.executeScript("arguments[0].click()",day10task);
		WebElement txtwindows = d1.findElement(By.xpath("//button[text()='Windows Handling']"));
	    js.executeScript("arguments[0].click()", txtwindows);
	    String windowHandle = d1.getWindowHandle();
	    System.out.println(windowHandle);
		Set<String> windowHandles = d1.getWindowHandles();
		for (String s : windowHandles) {
			if(!s.equals(windowHandle)) {
				d1.switchTo().window(s);
			}
			
		}
		
		
		WebElement Qus1 = d1.findElement(By.xpath("//pre[contains(text(),'QUESTION 12')]"));
		String text = Qus1.getText();
		System.out.println(text);
	
	}

}
