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

public class RestAssuredJSON6PUT {
	@Test
	public void getSimple() {

		//setting the baseURI
		RestAssured.baseURI = "http://jsonplaceholder.typicode.com";
		RestAssured.basePath = "/posts/";

		//Creating a request
		RequestSpecification request = RestAssured.given();

		//Creating an obj for JSONObject and adding Key-Value pairs using the 'put' method
		JSONObject requestParams = new JSONObject();
		requestParams.put("userId", "33");
		requestParams.put("id", "003");
		requestParams.put("title", "winsAmal123");
		requestParams.put("body", "password123");

		//add a header stating the request body is a JSON
		request.header("Content-Type", "application/json");

		//adding JSON to the body of the request
		request.body(requestParams.toJSONString());

		//getting the Response
		Response resp = request.put("/100");

		int statusCode = resp.getStatusCode();
		System.out.println("The statusCode: " +statusCode);

		Assert.assertEquals(statusCode, 200);
		request.then().body("title", equalTo("this is projectdebug.com"));
		
			

		//System.out.println(resp.body().asString());
	}
}
