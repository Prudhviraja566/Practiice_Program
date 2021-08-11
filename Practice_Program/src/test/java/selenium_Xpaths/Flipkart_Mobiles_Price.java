package selenium_Xpaths;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Flipkart_Mobiles_Price 
{
    public static void main(String[] args) 
    {
	   WebDriver driver = new ChromeDriver();
	   driver.manage().window().maximize();
	   driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	   driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
	   driver.get("https://www.flipkart.com");
	   
	   driver.findElement(By.xpath("//button[text()='✕']")).click();
    	
	   
	   driver.findElement(By.xpath("//div[text()='Mobiles']")).click();
	   
	   driver.findElement(By.xpath("//p[text()='Realme']")).click();
	   
	  List<WebElement> Title = driver.findElements(By.xpath("//div[contains(@class,'_4rR01T')]"));
	  
	   for(WebElement wb : Title)
	   {
		   System.out.println(wb.getText());
	   }
	   
	   List<WebElement> price = driver.findElements(By.xpath("//div[starts-with(text(),'realme ')]/../../../div[@class='_3pLy-c row']/div[@class='col col-5-12 nlI3QM']/div[@class='_3tbKJL']//div[@class='_30jeq3 _1_WHN1']"));
	   for(WebElement wb : price)
	   {
		   System.out.println(wb.getText());
	   }
	}
}
