package selenium_Xpaths;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Dynamic_Xpath 
{
     public static void main(String[] args) throws InterruptedException 
     {
	    	WebDriver driver = new ChromeDriver();
	    	driver.manage().window().maximize();
	    	
	    	driver.get("https://www.amazon.in/");
	    	
	    	
	    	WebElement Sreach = driver.findElement(By.cssSelector("input#twotabsearchtextbox"));
	    	
	    	Sreach.click();
	    	Sreach.sendKeys("Redmi", Keys.ENTER);
	    	
	    	List<WebElement> Title=driver.findElements(By.cssSelector("span.a-size-medium"));
	    	int count = 1;
	    	
	    	for(WebElement wb : Title)
	    	{
	    		System.out.println(count + " ) " + wb.getText());
	    		count++;
	    	}
	    		    	
	    	
	    	List<WebElement>  price = driver.findElements(By.xpath("//span[@class='a-size-medium a-color-base a-text-normal']/../../../following-sibling::div[@class='sg-row']//span[@class='a-price']"));
	    	
	    	int count1 = 1;
	    	
	    	
	    	
	    	for(WebElement wb : price )
	    	{
	    		System.out.println(count1 + " ) " +wb.getText());
	    		count1++;
	    	}
	    	
	    	
	    	System.out.println(price.size());
	    	System.out.println(Title.size());
	    	
	    	driver.close();
     }
}



