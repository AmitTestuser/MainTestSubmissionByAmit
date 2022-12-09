package TestCase;

import java.io.InputStream;
import java.util.concurrent.TimeUnit;

import org.json.JSONObject;
import org.json.JSONTokener;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import PO.PO_xlogist_coupon;
import Utility.BrowserManager;


public class TestCase_xlogist_coupon {
	WebDriver driver;
	JSONObject xlogist;

	
	@BeforeClass
	public void beforeClass()throws Exception{
		InputStream details = null;
		try {
			String fileName = "data/xlogist_coupon.json";
			details = getClass().getClassLoader().getResourceAsStream(fileName);
			JSONTokener tokener = new JSONTokener(details);
			
			xlogist = new JSONObject(tokener);
			
			
		
			
			
		}catch(Exception e) {
			e.printStackTrace();
		}
		
	
	}
	
	@BeforeMethod
	@Parameters({"browser","url"})
	public void setup(String browser, String url) throws InterruptedException {
		driver = BrowserManager.getDriver(browser); 
		Thread.sleep(3000);
		driver.get(url);
		Thread.sleep(3000);
		driver.manage().window().maximize();
		Thread.sleep(3000);
		driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
		Thread.sleep(3000);

		
	}
	
	
	@Test(description ="Testing xlogist coupon for valid data", priority =1)
	public void addcoupon_validData() {
	
		String user_name = xlogist.getJSONObject("valid").getString("user_Name");
		String user_pass = xlogist.getJSONObject("valid").getString("user_Pass");
		String enter_coupon = xlogist.getJSONObject("valid").getString("coupon_name");
		
		PO_xlogist_coupon obj = PageFactory.initElements(driver, PO_xlogist_coupon.class);
		obj.validData(user_name, user_pass, enter_coupon);
		
		
	}
	
	
	@Test(description ="Testing xlogist coupon for Invalid data", priority =2)
	public void addcoupon_InvalidData_numericData() {
	
		String user_name = xlogist.getJSONObject("Invalid").getString("user_Name");
		String user_pass = xlogist.getJSONObject("Invalid").getString("user_Pass");
		String enter_coupon = xlogist.getJSONObject("Invalid").getString("coupon_name");
		
		PO_xlogist_coupon obj = PageFactory.initElements(driver, PO_xlogist_coupon.class);
		obj.InvalidData_numericData(user_name, user_pass, enter_coupon);
		
	}
	
	
	@Test(description ="Testing xlogist coupon with special char", priority =3)
	public void addcoupon_InvalidData_SpecialCharacter() {
	
		String user_name = xlogist.getJSONObject("SpecialCharacter").getString("user_Name");
		String user_pass = xlogist.getJSONObject("SpecialCharacter").getString("user_Pass");
		String enter_coupon = xlogist.getJSONObject("SpecialCharacter").getString("coupon_name");
		
		PO_xlogist_coupon obj = PageFactory.initElements(driver, PO_xlogist_coupon.class);
		obj.SpecialCharacter(user_name, user_pass, enter_coupon);
		
	}
	
	
	@Test(description ="Testing xlogist coupon with Dublicate", priority =4)
	public void addcoupon_InvalidData_Dublicate() {
	
		String user_name = xlogist.getJSONObject("Dublicate").getString("user_Name");
		String user_pass = xlogist.getJSONObject("Dublicate").getString("user_Pass");
		String enter_coupon = xlogist.getJSONObject("Dublicate").getString("coupon_name");
		
		PO_xlogist_coupon obj = PageFactory.initElements(driver, PO_xlogist_coupon.class);
		obj.Dublicate(user_name, user_pass, enter_coupon);
		
	}
	
	@Test(description ="Testing xlogist coupon with BlankSpace", priority =5)
	public void addcoupon_InvalidData_BlankSpace() {
	
		String user_name = xlogist.getJSONObject("BlankSpace").getString("user_Name");
		String user_pass = xlogist.getJSONObject("BlankSpace").getString("user_Pass");
		String enter_coupon = xlogist.getJSONObject("BlankSpace").getString("coupon_name");
		
		PO_xlogist_coupon obj = PageFactory.initElements(driver, PO_xlogist_coupon.class);
		obj.BlankSpace(user_name, user_pass, enter_coupon);
		
	}
	
	@Test(description ="Testing xlogist coupon with DoubleSpace", priority =6)
	public void addcoupon_InvalidData_DoubleSpace() {
	
		String user_name = xlogist.getJSONObject("DoubleSpace").getString("user_Name");
		String user_pass = xlogist.getJSONObject("DoubleSpace").getString("user_Pass");
		String enter_coupon = xlogist.getJSONObject("DoubleSpace").getString("coupon_name");
		
		PO_xlogist_coupon obj = PageFactory.initElements(driver, PO_xlogist_coupon.class);
		obj.DoubleSpace(user_name, user_pass, enter_coupon);
		
	}
	
	
	@Test(description ="Testing xlogist coupon with MaxChar", priority =7)
	public void addcoupon_InvalidData_MaxChar() {
	
		String user_name = xlogist.getJSONObject("MaxChar").getString("user_Name");
		String user_pass = xlogist.getJSONObject("MaxChar").getString("user_Pass");
		String enter_coupon = xlogist.getJSONObject("MaxChar").getString("coupon_name");
		
		PO_xlogist_coupon obj = PageFactory.initElements(driver, PO_xlogist_coupon.class);
		obj.MaxChar(user_name, user_pass, enter_coupon);
		
	}
}
