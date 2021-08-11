package selenium_Xpaths;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Amazon_Mobile 
{
     public static void main(String[] args) 
     {
	     WebDriver driver = new  ChromeDriver();
	     driver.manage().window().maximize();
	     driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	     driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
	     driver.get("https://www.amazon.in");
	     
	     
	     driver.findElement(By.xpath("//a[text()='Mobiles']")).click();
	     
	     driver.findElement(By.xpath("//span[text()='boAt']/../../../span/a/div")).click();
	     
	     driver.findElement(By.xpath("//span[text()='Redmi']/../../../span/a/div")).click();
	     
	     List<WebElement> product = driver.findElements(By.xpath("//div[@class='s-main-slot s-result-list s-search-results sg-row']//div[@data-component-type='s-search-result']//h2//span"));

	     for (int i = 0; i < product.size(); i++)
	     {
	     String productname = driver.findElement(By.xpath("(//div[@class='s-main-slot s-result-list s-search-results sg-row']//div[@data-component-type='s-search-result']//h2//span)["+(i+1)+"]")).getText();
	     String proceed = "//span[contains(text(),'"+productname+"')]/../../../..//a[@class='a-size-base a-link-normal a-text-normal' or @class='a-size-mini a-link-normal a-text-normal']/span[1]/span[2]/span[2]";
	    
	     String productprice =driver.findElement(By.xpath(proceed)).getText();
	     System.out.println(i + " ) " + productname + " price = " + productprice);
	     }
	     System.out.println(product.size());
	 }
}
