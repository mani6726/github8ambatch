import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class Dropdown {

	public static void main(String[] args) throws Throwable {
		// TODO Auto-generated method stub
		
	
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\ELCOT\\eclipse-workspace\\demo\\Actions\\lib\\driver\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.flipkart.com/");
	driver.findElement(By.cssSelector("div > div > button")).click();
    driver.findElement(By.xpath("//input[@name='q']")).sendKeys("iphone 7");
    driver.findElement(By.xpath("//input[@name='q']")).sendKeys(Keys.ENTER);
    Thread.sleep(3000);
driver.findElement(By.xpath("//div[@data-id='MOBEMK62PN2HU7EE']")).click();
Set<String> wid = driver.getWindowHandles();
System.out.println(wid);
 for (String id : wid) {
	 if(!wid.equals(id)) {
		 driver.switchTo().window(id);
	 }
	
}
 Thread.sleep(3000);
 driver.findElement(By.xpath("//button[@class='_2AkmmA _2Npkh4 _2MWPVK']")).click();
 Thread.sleep(3000);
 System.out.println(driver.findElement(By.xpath("//div[text()='Amount Payable']")).getText());
	}

}
