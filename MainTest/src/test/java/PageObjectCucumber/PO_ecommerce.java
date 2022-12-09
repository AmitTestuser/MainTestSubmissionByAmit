package PageObjectCucumber;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class PO_ecommerce {
	
	WebDriver driver;
	public PO_ecommerce(WebDriver driver) {
		// TODO Auto-generated constructor stub
		PageFactory.initElements(driver, this);

	}
	

	@FindBy(how = How.XPATH, using = "//input[@id = 'useremail']")
	WebElement userName;
	public void sendUsername(String user_name) {
		userName.sendKeys(user_name);
	}
	
	@FindBy(how = How.XPATH, using = "//input[@id = 'password']")
	WebElement userPass;
	public void sendUserPass(String user_pass) {
		userPass.sendKeys(user_pass);
	}
	
	@FindBy(how = How.XPATH, using = "//button[@type = 'submit']")
	WebElement signButton;
	public void press_signButton() {
		signButton.click();
	}
	
	@FindBy(how = How.XPATH, using ="(//div[@class= 'nano-content']/ul/li)[2]/a")
	WebElement location;
	public void pressLocationButton() {
		location.click();
	}
	
	@FindBy(how = How.XPATH, using ="(//ul[@style = 'display: block;']/li)[3]/a")
	WebElement city;
	public void pressCityButton() {
		city.click();
	}
	
	@FindBy(how = How.XPATH, using ="//div[@class = 'pull-right']/a")
	WebElement addNewCityButton;
	public void pressAddNewCityButton() {
		addNewCityButton.click();
	}
	
	@FindBy(how = How.XPATH, using ="//input[@id = 'city']")
	WebElement cityName;
	public void sendCityName(String city_name) {
		cityName.click();
	}
	
	@FindBy(how = How.XPATH, using ="//button[@type = 'submit']")
	WebElement updateCity;
	public void pressUpdateCity() {
		updateCity.click();
	}
	
	public void login(String user_name, String user_pass) {
		try {
			sendUsername(user_name);
			
			Thread.sleep(3000);
			
			sendUserPass(user_pass);
			
			Thread.sleep(3000);
			
			press_signButton();
			
			Thread.sleep(3000);
			
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	}
	
	public void addCity(String city_name) {
		try {
			
			pressLocationButton();
			Thread.sleep(3000);
			
			pressCityButton();
			Thread.sleep(3000);
			
			pressAddNewCityButton();
			Thread.sleep(3000);
			
			sendCityName(city_name);
			Thread.sleep(3000);
			
			pressUpdateCity();
			Thread.sleep(3000);
			
		
			
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	}
	

}
