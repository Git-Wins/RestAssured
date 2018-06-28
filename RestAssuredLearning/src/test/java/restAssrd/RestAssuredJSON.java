package restAssrd;

import org.testng.annotations.Test;

import static io.restassured.RestAssured.*;
import static io.restassured.matcher.RestAssuredMatchers.*;
//import static io.restassured.module.jsv.JsonSchemaValidator.*;
import static org.hamcrest.Matchers.*;

public class RestAssuredJSON {
	@Test
	public void getSimple() {

		when().
		get("http://md5.jsontest.com?text=test").
		then().
			body("md5", equalTo("098f6bcd4621d373cade4e832627b4f6")).
		and().
			body("original", equalTo("test"));
	}
}
