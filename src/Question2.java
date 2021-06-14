

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Question2 {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\ASUS\\eclipse-workspace\\sel1\\driver\\chromedriver.exe");
		WebDriver d1=new ChromeDriver();
		d1.get("https://en-gb.facebook.com/");
		d1.manage().window().maximize();
		WebElement createbtn = d1.findElement(By.xpath("(//a[@role='button'])[2]"));
		createbtn.click();
		Thread.sleep(3000);
		WebElement ddnmonth = d1.findElement(By.id("month"));
		Select s=new Select(ddnmonth);
		s.selectByVisibleText("Aug");
		
		List<WebElement> op=s.getOptions();
		
		//for(int i=0; i< op.size(); i++) {
		//WebElement element=op.get(i);
		//String text=element.getText();
		//System.out.println(text);
		for (WebElement v : op) {
			String attribute = v.getAttribute("text");
			System.out.println(attribute);
		}
	}
}
