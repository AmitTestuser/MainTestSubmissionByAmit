package PO;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import org.openqa.selenium.support.How;
public class PO_xlogist_coupon {
	WebDriver driver;
	
	public PO_xlogist_coupon(WebDriver driver) {
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
	
	@FindBy(how = How.XPATH, using = "(//div[@class = 'nano-content']/ul/li)[8]")
	WebElement coupon;
	public void pressCoupon() {
		coupon.click();
	}
	
	@FindBy(how = How.XPATH, using = "//div [@class = 'pull-right']/a")
	WebElement addCoupon;
	public void pressAddCoupon() {
		addCoupon.click();
	}
	
	@FindBy(how = How.XPATH, using = "//input[@id ='coupon_name']")
	WebElement enterCoupon;
	public void sendCoupon(String enter_coupon) {
		enterCoupon.sendKeys(enter_coupon);
	}
	
	@FindBy(how = How.XPATH, using = "//button [@type ='submit']")
	WebElement submitButton;
	public void pressSubmitButton() {
		submitButton.click();
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
	
	public void validData(String user_name, String user_pass, String enter_coupon ) {
		
		try {
			
			login(user_name, user_pass);
			
			Thread.sleep(3000);
			
			pressCoupon();
			
			Thread.sleep(3000);
			
			pressAddCoupon();
			
			Thread.sleep(3000);
			
			sendCoupon(enter_coupon);
			
			Thread.sleep(3000);
			
			pressSubmitButton();
			
			Thread.sleep(3000);
			
			
			
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		
	}
	
	
public void InvalidData_numericData(String user_name, String user_pass, String enter_coupon ) {
		
		try {
			
			login(user_name, user_pass);
			
			Thread.sleep(3000);
			
			pressCoupon();
			
			Thread.sleep(3000);
			
			pressAddCoupon();
			
			Thread.sleep(3000);
			
			sendCoupon(enter_coupon);
			
			Thread.sleep(3000);
			
			pressSubmitButton();
			
			Thread.sleep(3000);
			
			
			
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		
		
	}




public void SpecialCharacter(String user_name, String user_pass, String enter_coupon ) {
	
	try {
		
		login(user_name, user_pass);
		
		Thread.sleep(3000);
		
		pressCoupon();
		
		Thread.sleep(3000);
		
		pressAddCoupon();
		
		Thread.sleep(3000);
		
		sendCoupon(enter_coupon);
		
		Thread.sleep(3000);
		
		pressSubmitButton();
		
		Thread.sleep(3000);
		
		
		
	} catch (Exception e) {
		// TODO: handle exception
		e.printStackTrace();
	}
	
	
	
}


public void Dublicate(String user_name, String user_pass, String enter_coupon ) {
	
	try {
		
		login(user_name, user_pass);
		
		Thread.sleep(3000);
		
		pressCoupon();
		
		Thread.sleep(3000);
		
		pressAddCoupon();
		
		Thread.sleep(3000);
		
		sendCoupon(enter_coupon);
		
		Thread.sleep(3000);
		
		pressSubmitButton();
		
		Thread.sleep(3000);
		
		
		
	} catch (Exception e) {
		// TODO: handle exception
		e.printStackTrace();
	}
	
	
	
}

public void BlankSpace(String user_name, String user_pass, String enter_coupon ) {
	
	try {
		
		login(user_name, user_pass);
		
		Thread.sleep(3000);
		
		pressCoupon();
		
		Thread.sleep(3000);
		
		pressAddCoupon();
		
		Thread.sleep(3000);
		
		sendCoupon(enter_coupon);
		
		Thread.sleep(3000);
		
		pressSubmitButton();
		
		Thread.sleep(3000);
		
		
		
	} catch (Exception e) {
		// TODO: handle exception
		e.printStackTrace();
	}
	
	
	
}


public void DoubleSpace(String user_name, String user_pass, String enter_coupon ) {
	
	try {
		
		login(user_name, user_pass);
		
		Thread.sleep(3000);
		
		pressCoupon();
		
		Thread.sleep(3000);
		
		pressAddCoupon();
		
		Thread.sleep(3000);
		
		sendCoupon(enter_coupon);
		
		Thread.sleep(3000);
		
		pressSubmitButton();
		
		Thread.sleep(3000);
		
		
		
	} catch (Exception e) {
		// TODO: handle exception
		e.printStackTrace();
	}
	
}


public void MaxChar(String user_name, String user_pass, String enter_coupon ) {
	
	try {
		
		login(user_name, user_pass);
		
		Thread.sleep(3000);
		
		pressCoupon();
		
		Thread.sleep(3000);
		
		pressAddCoupon();
		
		Thread.sleep(3000);
		
		sendCoupon(enter_coupon);
		
		Thread.sleep(3000);
		
		pressSubmitButton();
		
		Thread.sleep(3000);
		
		
		
	} catch (Exception e) {
		// TODO: handle exception
		e.printStackTrace();
	}
	
}





}