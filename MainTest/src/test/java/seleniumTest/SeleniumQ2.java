package seleniumTest;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;


import io.github.bonigarcia.wdm.WebDriverManager;

public class SeleniumQ2 {
	WebDriver driver;
	public void screenshot() throws IOException {
		
		File screenShotFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		
		FileUtils.copyFile(screenShotFile, new File(".//Screenshots/screen.png"));

	}
	

	public void register() {
		// TODO Auto-generated method stub
		try {

			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
			
			driver.get("https://www.nopcommerce.com/en/register?returnUrl=%2Fen");
			Thread.sleep(3000);
			driver.manage().window().maximize();
			Thread.sleep(3000);
			
			
			WebElement firstName = driver.findElement(By.xpath("//input[@id = 'FirstName']"));
			WebElement lastName = driver.findElement(By.xpath("//input[@id = 'LastName']"));
			WebElement email = driver.findElement(By.xpath("//input[@id = 'Email']"));
			WebElement cEmail = driver.findElement(By.xpath("//input[@id = 'ConfirmEmail']"));
			WebElement userName = driver.findElement(By.xpath("//input[@id = 'Username']"));
			WebElement country = driver.findElement(By.xpath("//select[@id = 'CountryId']"));
			WebElement timeZone = driver.findElement(By.xpath("//select[@id = 'TimeZoneId']"));
			WebElement password = driver.findElement(By.xpath("//input[@id = 'Password']"));
			WebElement cPassword = driver.findElement(By.xpath("//input[@id = 'ConfirmPassword']"));
			
			WebElement company = driver.findElement(By.xpath("//select[@id = 'Details_CompanyIndustryId']"));
			
			WebElement register = driver.findElement(By.xpath("//input[@id = 'register-button']"));
					
			
			firstName.sendKeys("Amit");
			Thread.sleep(3000);
			lastName.sendKeys("Nitnaware");
			Thread.sleep(3000);
			email.sendKeys("amitnitnware00022@gmail.com");
			Thread.sleep(3000);
			cEmail.sendKeys("amitnitnware00022@gmail.com");
			Thread.sleep(3000);
			userName.sendKeys("Amit20033");
			Thread.sleep(3000);
			
			Select selectCountry = new Select(country);
			selectCountry.selectByVisibleText("India");
			Thread.sleep(3000);
			
			Select selectTime = new Select(timeZone);
			selectTime.selectByVisibleText("(UTC-10:00) Hawaii");
			Thread.sleep(3000);
			
			password.sendKeys("pass@12345");
			cPassword.sendKeys("pass@12345");
			Thread.sleep(3000);
			
			Select selectCompany = new Select(company);
			selectCompany.selectByVisibleText("I am student");
			Thread.sleep(3000);
			
			
			register.click();
			Thread.sleep(5000);
			
			screenshot();
		
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		
	}

	public static void main(String args[]) {
		SeleniumQ2 obj = new SeleniumQ2();
		obj.register();
		
	
	}

}
