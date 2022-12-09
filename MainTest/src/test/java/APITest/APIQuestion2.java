package APITest;

import static io.restassured.RestAssured.given;

import java.io.IOException;
import java.io.InputStream;
import java.util.HashMap;
import java.util.LinkedHashMap;

import org.json.JSONObject;
import org.json.JSONTokener;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.relevantcodes.extentreports.LogStatus;


import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import io.restassured.specification.ResponseSpecification;

public class APIQuestion2 {
	
ResponseSpecification res;

	
	RequestSpecification req_spec;
	
	
	String str = "";
	
	JSONObject login;
	
	@BeforeClass
	public void setSpecification() throws IOException {
		InputStream detail = null;
		try {
			res = RestAssured.expect();
			
			res.statusLine("HTTP/1.1 200 OK");
			res.contentType(ContentType.JSON);
			
			
			String path = "data/login.json";
			
			detail = getClass().getClassLoader().getResourceAsStream(path);
			JSONTokener tokener = new JSONTokener(detail);
			login = new JSONObject(tokener);
			
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		finally
		{
			if(detail!= null)
			{
				detail.close();
				
			}
		}
		
	}
	
	@Test(priority = 1)
	public void loginuser_ValidData() {
	
		
		HashMap<String, String> params = new HashMap<String, String>();
		
	
		String userName = login.getJSONObject("valid").getString("user_name");
		params.put("username", userName);
		
		String userPassword = login.getJSONObject("valid").getString("user_password");
		params.put("password", userPassword);
		
		
	
		
		RestAssured.baseURI = "https://arcadia.pisystindia.com/";

		Response resp = (Response) given().when().contentType("application/json").body(params).post("api/login").then().contentType(ContentType.JSON).extract().response();
		
		System.out.println("op is"+resp.asPrettyString());
		

	}
	
	
	@Test(priority = 2)
	public void loginuser_InvalidData() {	
		HashMap<String, String> params = new HashMap<String, String>();
			
		String userName = login.getJSONObject("Invalid").getString("user_name");
		params.put("username", userName);
			
		String userPassword = login.getJSONObject("Invalid").getString("user_password");
		params.put("password", userPassword);
	
		RestAssured.baseURI = "https://arcadia.pisystindia.com/";

		Response resp = (Response) given().when().contentType("application/json").body(params).post("api/login").then().contentType(ContentType.JSON).extract().response();
		System.out.println("op is"+resp.asPrettyString());
	
		
		
		
	}

}
