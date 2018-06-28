package restAssrd;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

import static io.restassured.RestAssured.*;
import static org.hamcrest.Matchers.*;
//import static org.hamcrest.Matchers.;

public class RestAssuredJSON3GET {
	@Test
	public void getSimple() {
		
		//given().pathParam("id", "1"); INVALID

		RestAssured.baseURI = "https://jsonplaceholder.typicode.com/posts/1";
		
		RequestSpecification request = RestAssured.given();
		
		//when().get("https://jsonplaceholder.typicode.com/posts/1").
		request.then().
			statusCode(200).
			body("userId", equalTo(1)).
		and().
			body("id", greaterThan(0)).
		and().
			body("id", equalTo(1)).
		and().
			body("title", endsWith("rit")).
		and().
			body("title", containsString("excepturi"));
	}
}
