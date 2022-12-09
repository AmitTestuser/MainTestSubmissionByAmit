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

import PO.PO_pisystindia_ecommerce;
import PO.PO_xlogist_coupon;
import Utility.BrowserManager;

public class TestCase_pisystindia_ecommerce {
	WebDriver driver;
	JSONObject pisystindia;

	
	@BeforeClass
	public void beforeClass()throws Exception{
		InputStream details = null;
		try {
			String fileName = "data/pisystindia_ecommerce.json";
			details = getClass().getClassLoader().getResourceAsStream(fileName);
			JSONTokener tokener = new JSONTokener(details);
			
			pisystindia = new JSONObject(tokener);
		
			
			
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
	
	@Test(description ="Testing ecommerce  for valid data", priority =1)
	public void ecommerce_validData() {
	
		String user_name = pisystindia.getJSONObject("valid").getString("user_Name");
		String user_pass = pisystindia.getJSONObject("valid").getString("user_Pass");
		String category_name = pisystindia.getJSONObject("valid").getString("category_Name");
		String category_image = pisystindia.getJSONObject("valid").getString("category_Image");
		PO_pisystindia_ecommerce obj = PageFactory.initElements(driver, PO_pisystindia_ecommerce.class);
		
		obj.validData(user_name, user_pass, category_name, category_image);
		
	}
	
	@Test(description ="Testing ecommerce for Invalid data", priority =2)
	public void ecommerce_InvalidData_numericData() {
	
		String user_name = pisystindia.getJSONObject("Invalid").getString("user_Name");
		String user_pass = pisystindia.getJSONObject("Invalid").getString("user_Pass");
		String category_name = pisystindia.getJSONObject("Invalid").getString("category_Name");
		String category_image = pisystindia.getJSONObject("Invalid").getString("category_Image");
		PO_pisystindia_ecommerce obj = PageFactory.initElements(driver, PO_pisystindia_ecommerce.class);
		
		obj.InvalidData_numericData(user_name, user_pass, category_name, category_image);
	}
	
	@Test(description ="Testing ecommerce for SpecialCharacter", priority =3)
	public void ecommerce_SpecialCharacter() {
	
		String user_name = pisystindia.getJSONObject("SpecialCharacter").getString("user_Name");
		String user_pass = pisystindia.getJSONObject("SpecialCharacter").getString("user_Pass");
		String category_name = pisystindia.getJSONObject("SpecialCharacter").getString("category_Name");
		String category_image = pisystindia.getJSONObject("SpecialCharacter").getString("category_Image");
		PO_pisystindia_ecommerce obj = PageFactory.initElements(driver, PO_pisystindia_ecommerce.class);
		
		obj.SpecialCharacter(user_name, user_pass, category_name, category_image);		
	}
	
	@Test(description ="Testing ecommerce for Dublicate", priority =4)
	public void ecommerce_Dublicate() {
	
		String user_name = pisystindia.getJSONObject("Dublicate").getString("user_Name");
		String user_pass = pisystindia.getJSONObject("Dublicate").getString("user_Pass");
		String category_name = pisystindia.getJSONObject("Dublicate").getString("category_Name");
		String category_image = pisystindia.getJSONObject("Dublicate").getString("category_Image");
		PO_pisystindia_ecommerce obj = PageFactory.initElements(driver, PO_pisystindia_ecommerce.class);
		
		obj.Dublicate(user_name, user_pass, category_name, category_image);
		
	}
	
	@Test(description ="Testing ecommerce for BlankSpace", priority =5)
	public void ecommerce_BlankSpace() {
	
		String user_name = pisystindia.getJSONObject("BlankSpace").getString("user_Name");
		String user_pass = pisystindia.getJSONObject("BlankSpace").getString("user_Pass");
		String category_name = pisystindia.getJSONObject("BlankSpace").getString("category_Name");
		String category_image = pisystindia.getJSONObject("BlankSpace").getString("category_Image");
		PO_pisystindia_ecommerce obj = PageFactory.initElements(driver, PO_pisystindia_ecommerce.class);
		
		obj.BlankSpace(user_name, user_pass, category_name, category_image);;
		
	}
	
	@Test(description ="Testing ecommerce for DoubleSpace", priority =6)
	public void ecommerce_DoubleSpace() {
	
		String user_name = pisystindia.getJSONObject("DoubleSpace").getString("user_Name");
		String user_pass = pisystindia.getJSONObject("DoubleSpace").getString("user_Pass");
		String category_name = pisystindia.getJSONObject("DoubleSpace").getString("category_Name");
		String category_image = pisystindia.getJSONObject("DoubleSpace").getString("category_Image");
		PO_pisystindia_ecommerce obj = PageFactory.initElements(driver, PO_pisystindia_ecommerce.class);
		
		obj.DoubleSpace(user_name, user_pass, category_name, category_image);
		
	}
	
	@Test(description ="Testing ecommerce for MaxChar", priority =7)
	public void ecommerce_MaxChar() {
	
		String user_name = pisystindia.getJSONObject("MaxChar").getString("user_Name");
		String user_pass = pisystindia.getJSONObject("MaxChar").getString("user_Pass");
		String category_name = pisystindia.getJSONObject("MaxChar").getString("category_Name");
		String category_image = pisystindia.getJSONObject("MaxChar").getString("category_Image");
		PO_pisystindia_ecommerce obj = PageFactory.initElements(driver, PO_pisystindia_ecommerce.class);
		
		obj.MaxChar(user_name, user_pass, category_name, category_image);
		
	}
	
	
}
