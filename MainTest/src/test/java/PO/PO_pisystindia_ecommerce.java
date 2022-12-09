package PO;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class PO_pisystindia_ecommerce {
	WebDriver driver;
	
	public PO_pisystindia_ecommerce(WebDriver driver) {
		// TODO Auto-generated constructor stub
		this.driver = driver;
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
	
	
	@FindBy(how = How.XPATH, using = "(//div[@class ='nano-content']/ul/li)[3]/a/i")
	WebElement productButton;
	public void pressProductButton() {
		productButton.click();
	}
	
	@FindBy(how = How.XPATH, using = "(//ul[@style='display: block;']/li)[1]/a")
	WebElement categoryButton;
	public void pressCategoryButton() {
		categoryButton.click();
	}
	
	@FindBy(how = How.XPATH, using = "(//a[@class ='ti-pencil-alt'])[1]")
	WebElement editCategoryNameButton;
	public void pressEditCategoryNameButton() {
		editCategoryNameButton.click();
	}
	
	@FindBy(how = How.XPATH, using = "//input[@id = 'category_name']")
	WebElement categoryName;
	public void sendCategoryName(String category_name) {
		categoryName.sendKeys(category_name);
	}
	
	@FindBy(how = How.XPATH, using = "//button[@type = 'submit']")
	WebElement updateButton;
	public void pressUpdateButton() {
		updateButton.click();
	}
	
	@FindBy(how = How.XPATH , using = "(//a[@class ='ti-image'])[1]")
	WebElement editCategoryImageButton;
	public void pressEditCategoryImageButton() {
		editCategoryImageButton.click();
	}
	
	@FindBy(how = How.XPATH,using = "//input[@class ='file-name input-flat']")
	WebElement categoryImage;
	public void sendCategoryImage(String category_image) {
		categoryImage.sendKeys(category_image);
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
	
	
	public void validData(String user_name, String user_pass,String category_name,String category_image) {
		try {
			login(user_name, user_pass);
			Thread.sleep(3000);
			
			pressProductButton();
			Thread.sleep(3000);
			
			pressCategoryButton();
			Thread.sleep(3000);
			
			pressEditCategoryNameButton();
			Thread.sleep(3000);
			
			categoryName.clear();
			Thread.sleep(3000);
			
			sendCategoryName(category_name);
			Thread.sleep(3000);
			
			pressUpdateButton();
			Thread.sleep(3000);
			
			pressEditCategoryImageButton();
			Thread.sleep(3000);
			
			sendCategoryImage(category_image);
			Thread.sleep(3000);
			
			pressUpdateButton();
			Thread.sleep(3000);

			
			
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	}
	
	public void InvalidData_numericData(String user_name, String user_pass,String category_name,String category_image) {
		try {
			login(user_name, user_pass);
			Thread.sleep(3000);
			
			pressProductButton();
			Thread.sleep(3000);
			
			pressCategoryButton();
			Thread.sleep(3000);
			
			pressEditCategoryNameButton();
			Thread.sleep(3000);
			
			categoryName.clear();
			Thread.sleep(3000);
			
			sendCategoryName(category_name);
			Thread.sleep(3000);
			
			pressUpdateButton();
			Thread.sleep(3000);
			
			
			
			
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	}
	
	public void SpecialCharacter(String user_name, String user_pass,String category_name,String category_image) {
		try {
			login(user_name, user_pass);
			Thread.sleep(3000);
			
			pressProductButton();
			Thread.sleep(3000);
			
			pressCategoryButton();
			Thread.sleep(3000);
			
			pressEditCategoryNameButton();
			Thread.sleep(3000);
			
			categoryName.clear();
			Thread.sleep(3000);
			
			sendCategoryName(category_name);
			Thread.sleep(3000);
			
			pressUpdateButton();
			Thread.sleep(3000);
			
			
			
			
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	}
	
	public void Dublicate(String user_name, String user_pass,String category_name,String category_image) {
		try {
			login(user_name, user_pass);
			Thread.sleep(3000);
			
			pressProductButton();
			Thread.sleep(3000);
			
			pressCategoryButton();
			Thread.sleep(3000);
			
			pressEditCategoryNameButton();
			Thread.sleep(3000);
			
			categoryName.clear();
			Thread.sleep(3000);
			
			sendCategoryName(category_name);
			Thread.sleep(3000);
			
			pressUpdateButton();
			Thread.sleep(3000);
			
			
			
			
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	}
	
	public void BlankSpace(String user_name, String user_pass,String category_name,String category_image) {
		try {
			login(user_name, user_pass);
			Thread.sleep(3000);
			
			pressProductButton();
			Thread.sleep(3000);
			
			pressCategoryButton();
			Thread.sleep(3000);
			
			pressEditCategoryNameButton();
			Thread.sleep(3000);
			
			categoryName.clear();
			Thread.sleep(3000);
			
			sendCategoryName(category_name);
			Thread.sleep(3000);
			
			pressUpdateButton();
			Thread.sleep(3000);
			
			
			
			
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	}
	
	public void DoubleSpace(String user_name, String user_pass,String category_name,String category_image) {
		try {
			login(user_name, user_pass);
			Thread.sleep(3000);
			
			pressProductButton();
			Thread.sleep(3000);
			
			pressCategoryButton();
			Thread.sleep(3000);
			
			pressEditCategoryNameButton();
			Thread.sleep(3000);
			
			categoryName.clear();
			Thread.sleep(3000);
			
			sendCategoryName(category_name);
			Thread.sleep(3000);
			
			pressUpdateButton();
			Thread.sleep(3000);
			
			
			
			
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	}
	
	public void MaxChar(String user_name, String user_pass,String category_name,String category_image) {
		try {
			login(user_name, user_pass);
			Thread.sleep(3000);
			
			pressProductButton();
			Thread.sleep(3000);
			
			pressCategoryButton();
			Thread.sleep(3000);
			
			pressEditCategoryNameButton();
			Thread.sleep(3000);
			
			categoryName.clear();
			Thread.sleep(3000);
			
			sendCategoryName(category_name);
			Thread.sleep(3000);
			
			pressUpdateButton();
			Thread.sleep(3000);
			
			
			
			
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	}
	
	
	

}
