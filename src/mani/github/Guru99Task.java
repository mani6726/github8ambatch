package mani.github;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Guru99Task {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver","C:\\Users\\ELCOT\\eclipse-workspace\\Github\\Branchingtask\\github8ambatch\\lib\\driver\\chromedriver.exe" );
		WebDriver driver= new ChromeDriver();
		driver.get("https://www.guru99.com");
		
		System.out.println(driver.findElements(By.tagName("a")).size());
		
		WebElement subdriver=driver.findElement(By.xpath("//div[@class='row featured-boxes']"));
		int title =subdriver.findElements(By.tagName("b")).size();
				for (int i = 0; i <title; i++) {
					System.out.println(subdriver.findElements(By.tagName("b")).get(i).getText());
		}
				int link =subdriver.findElements(By.tagName("a")).size();
				for (int j = 0; j <link; j++) {
					System.out.println(subdriver.findElements(By.tagName("a")).get(j).getText());	
		
	
	}
	
		}
		}

