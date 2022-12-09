package seleniumTest;

import java.util.Scanner;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;


import io.github.bonigarcia.wdm.WebDriverManager;

public class SeleniumQ1 {
	public void visitPage() {
		
		
		try {
			WebDriverManager.chromedriver().setup();
			WebDriver driver = new ChromeDriver();
			
			driver.get("https://www.nopcommerce.com/en");
			Thread.sleep(3000);
			driver.manage().window().maximize();
			Thread.sleep(3000);
		
			WebElement userIcon = driver.findElement(By.xpath("(//ul[@class='navigation-top-menu navigation-top-menu-user-actions'])/li[3]"));
			WebElement registerLink = driver.findElement(By.xpath("((//ul[@class='navigation-top-menu-sublist'])[6]/li)[2]"));
			
			Actions action = new Actions(driver);
			
			action.moveToElement(userIcon); 
			Thread.sleep(3000);
			action.click(registerLink).build().perform(); 
			Thread.sleep(3000);
			
			
			
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	}
	
	public static void main(String args[]) {
		SeleniumQ1 obj = new SeleniumQ1();
		obj.visitPage();
		
	
	}

}
