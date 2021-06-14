

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Question1 {
public static void main(String[] args) throws InterruptedException {
	
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\ASUS\\eclipse-workspace\\sel1\\driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://en-gb.facebook.com/");
		driver.manage().window().maximize();
        WebElement createbtn = driver.findElement(By.xpath("(//a[@role='button'])[2]"));
        createbtn.click();
        Thread.sleep(2000);
        WebElement dmonth = driver.findElement(By.id("month"));
       Select s=new Select(dmonth);
       boolean b = s.isMultiple();
       System.out.println(b);
       
      // s.selectByVisibleText("Jan");
       //s.selectByValue("4");
       //s.selectByIndex(9);
     //to get all selected options
       List<WebElement> all = s.getAllSelectedOptions();
      for (int i = 0; i < all.size(); i++) {
		WebElement element = all.get(i);
		String text = element.getText();
		System.out.println("all selected options "+text);
		
		//to get first selected options
		//WebElement first = s.getFirstSelectedOption();
		//String firstText = first.getText();
	  //System.out.println("first selected option "+firstText);
      }
}
}	
		