package Steps_DefinationPack;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import PageObjectCucumber.PO_ecommerce;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class ecommerce_step_defination {
	
WebDriver driver;
PO_ecommerce obj;


@Given("chrome browser")
public void chrome_browser() {
    WebDriverManager.chromedriver().setup();
    driver = new ChromeDriver();
    driver.manage().window().maximize();
}

@When("user opens URL {string}")
public void user_opens_url(String url) {
    driver.get(url);
}

@When("user enters emails as {string} and password as {string}")
public void user_enters_emails_as_and_password_as(String userName, String userPass) {
    obj.sendUsername(userName);
    obj.sendUserPass(userPass);
}

@When("user click on login")
public void user_click_on_login() {
    obj.press_signButton();
}

@When("user click on location")
public void user_click_on_location() {
    obj.pressLocationButton();
}

@When("user click on city")
public void user_click_on_city() {
    obj.pressCityButton();

}

@When("user click on add new city")
public void user_click_on_add_new_city() {
    // Write code here that turns the phrase above into concrete actions
    obj.pressAddNewCityButton();
}

@When("user enters city as {string}")
public void user_enters_city_as(String city) {
    // Write code here that turns the phrase above into concrete actions
    obj.sendCityName(city);
}

@When("user click on update button")
public void user_click_on_update_button() {
	obj.pressUpdateCity();
}

@When("closes browser")
public void closes_browser() {
    // Write code here that turns the phrase above into concrete actions
    driver.close();
}

}
