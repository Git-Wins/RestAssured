package restAssrd;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import junit.framework.Assert;

import static io.restassured.RestAssured.*;
import static org.hamcrest.Matchers.*;
//import static org.hamcrest.Matchers.;

import org.json.simple.JSONObject;

public class RestAssuredJSON5POST {
	@Test
	public void getSimple() {
		
		//setting the baseURI
		RestAssured.baseURI = "http://restapi.demoqa.com/customer";
		
		//Creating a request
		RequestSpecification request = RestAssured.given();
		
		//JSONObject is a class that is present in org.json.simple package. This class is a programmatic representation of a JSON string
		
		//Creating an obj for JSONObject and adding Key-Value pairs using the 'put' method
		JSONObject requestParams = new JSONObject();
		requestParams.put("FirstName", "Winston");
		requestParams.put("LastName", "Amal");
		requestParams.put("UserName", "winsAmal123");
		requestParams.put("Password", "password123");
	 	requestParams.put("Email",  "samplewins@gmail.com");
	 	
	 	//add a header stating the request body is a JSON
	 	request.header("Content-Type", "application/json");
	 	
	 	//adding JSON to the body of the request
	 	request.body(requestParams.toJSONString());
	 	
	 	//getting the Response
	 	Response resp = request.post("/register");
	 	
	 	int statusCode = resp.getStatusCode();
	 	System.out.println("The statusCode: " +statusCode);
	 	
	 	Assert.assertEquals(statusCode, 200);
	 	
	 	//System.out.println(resp.body().asString());
	}
}
