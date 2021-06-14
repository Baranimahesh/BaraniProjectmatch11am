import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Test {
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\ASUS\\eclipse-workspace\\sel1\\driver\\chromedriver.exe");
	WebDriver d1=new ChromeDriver();
	d1.get(" http://demo.guru99.com/test/newtours/register.php");
	d1.manage().window().maximize();
	WebElement dropcountry = d1.findElement(By.name("country"));
Select s=new Select(dropcountry);
List<WebElement> drop = s.getOptions();
for (WebElement Element : drop) {
	String attribute = Element.getAttribute("value");
	System.out.println(attribute);
	
}
//for (int i = 0; i < drop.size(); i++) {
//WebElement Element = drop.get(i);
//String text = Element.getText();
//System.out.println(text);
}
}		
	
	
	//boolean b = s.isMultiple();
//	System.out.println(b);
//	s.selectByIndex(4);
//	s.selectByValue("country");
//	List<WebElement> all = s.getAllSelectedOptions();
//	for (int i = 0; i < all.size(); i++) {
//		WebElement ele = all.get(i);
//	String text = ele.getText();
//	System.out.println(text);
//	}
//}
//}
//}