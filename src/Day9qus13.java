import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Day9qus13 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\ASUS\\eclipse-workspace\\sel1\\driver\\chromedriver.exe");
		WebDriver d1=new ChromeDriver();
		d1.get(" http://output.jsbin.com/osebed/2");
		d1.manage().window().maximize();
		WebElement btnfruit = d1.findElement(By.id("fruits"));
	    Select s=new Select(btnfruit);
	    //to check wheather multiple options 
	    boolean b = s.isMultiple();
	    System.out.println(b);
	    s.selectByVisibleText("Banana");
	    s.selectByIndex(1);
	    s.selectByValue("orange");
	    s.selectByValue("grape");
	   
	    List<WebElement> op = s.getOptions();
	    for (int i= 0; i < op.size(); i++) {
	    	if (i%2==0) {
	    WebElement Element = op.get(i);
             String text = Element.getText();
             System.out.println(text);
	    	}
	    	else  
	    	{
            	 System.out.println("not selected options");
             }
	}
	    }
            // To get first selected options
            // WebElement first = s.getFirstSelectedOption();
             //String text2 = first.getText();
		     //System.out.println("first selected option "+text2);
	    }
	    

