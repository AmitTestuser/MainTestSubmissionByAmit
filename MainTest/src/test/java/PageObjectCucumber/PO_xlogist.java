package PageObjectCucumber;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class PO_xlogist {
	
	WebDriver driver;
	public PO_xlogist(WebDriver driver) {
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
	WebElement country;
	public void pressCountryButton() {
		country.click();
	}
	
	@FindBy(how = How.XPATH, using ="//div[@class = 'pull-right']/a")
	WebElement addNewButton;
	public void pressAddNewButton() {
		addNewButton.click();
	}
	
	@FindBy(how = How.XPATH, using ="//input[@id = 'city']")
	WebElement	countryName;
	public void sendCountry(String country_name) {
		countryName.click();
	}
	
	@FindBy(how = How.XPATH, using ="//button[@type = 'submit']")
	WebElement updateCountry;
	public void pressUpdateCountry() {
		updateCountry.click();
	}
	
	

	
	
}
