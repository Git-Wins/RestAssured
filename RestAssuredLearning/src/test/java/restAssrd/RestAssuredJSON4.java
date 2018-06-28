package restAssrd;

import org.testng.annotations.Test;

import io.restassured.response.Response;

import static io.restassured.RestAssured.*;
import static org.hamcrest.Matchers.*;
//import static org.hamcrest.Matchers.;

public class RestAssuredJSON4 {
	@Test
	public void getSimple() {

		given()
        .pathParam("country", "Finland").
       when()
            .get("http://restcountries.eu/rest/v1/name/{country}")
        .then()
        	.statusCode(200).
            body("name", equalTo("Finland"));
	}
}
