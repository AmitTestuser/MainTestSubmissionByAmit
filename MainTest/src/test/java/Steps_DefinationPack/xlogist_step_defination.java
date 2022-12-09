package Steps_DefinationPack;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import PageObjectCucumber.PO_xlogist;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class xlogist_step_defination {
WebDriver driver;
PO_xlogist obj;

@Given("chrome browser")
public void chrome_browser() {
		WebDriverManager.chromedriver().setup();
	    driver = new ChromeDriver();
	    driver.manage().window().maximize();
}

@When("user opens URL {string}")
public void user_opens_url(String string) {
   driver.get(string);
}

@When("user enters emails as {string} and password as {string}")
public void user_enters_emails_as_and_password_as(String string, String string2) {
    obj.sendUsername(string);
    obj.sendUserPass(string2);
}

@When("user click on login")
public void user_click_on_login() {
    obj.press_signButton();
}

@When("user click on location")
public void user_click_on_location() {
    obj.pressLocationButton();;
}

@When("user click on Country")
public void user_click_on_country() {
    obj.pressCountryButton();
}

@When("user click on add new Country")
public void user_click_on_add_new_country() {
   obj.pressAddNewButton();
}

@When("user enters city as {string}")
public void user_enters_city_as(String string) {
   obj.sendCountry(string);
}

@When("user click on update button")
public void user_click_on_update_button() {
   obj.pressUpdateCountry();
}

@When("closes browser")
public void closes_browser() {
    driver.close();
}
}
