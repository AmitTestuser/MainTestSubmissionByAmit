package APITest;

import java.io.IOException;
import java.io.InputStream;
import java.util.HashMap;

import org.json.JSONObject;
import org.json.JSONTokener;
import org.json.simple.JSONArray;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import static io.restassured.RestAssured.*;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import io.restassured.specification.ResponseSpecification;

public class APIQuestion1 {
	
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
	
	@Test(priority=1)
	public void getBanner_validPath() {
		
		RestAssured.baseURI = "https://arcadia.pisystindia.com/";
				
		Response resp = (Response)given().header("Authorization",str).when().get("api/getBanner").then().contentType(ContentType.JSON).extract().response();
				
		System.out.println("GetBanner output:"+resp.body().asPrettyString());
		
	}

	
	@Test(priority=2)
	public void getBanner_InvalidPath() {
		Response resp =null;
		try {
		RestAssured.baseURI = "https://arcadia.pisystindia.com/";
				
		
			resp = (Response)given().header("Authorization",str).when().get("api/getBanne").then().contentType(ContentType.JSON).extract().response();

		} catch (Exception e) {
			// TODO: handle exception
			System.out.println("Invalid path");
			e.printStackTrace();
		}
		

		
		
	}

}
