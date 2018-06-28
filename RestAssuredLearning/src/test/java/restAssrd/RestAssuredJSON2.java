package restAssrd;

import org.testng.annotations.Test;

import static io.restassured.RestAssured.*;
import static io.restassured.matcher.RestAssuredMatchers.*;
//import static io.restassured.module.jsv.JsonSchemaValidator.*;
import static org.hamcrest.Matchers.*;

public class RestAssuredJSON2 {
	@Test
	public void getSimple() {

		when().
		get("http://freegeoip.net/json/yahoo.com").
		then().
			body("city",equalTo("Sunnyvale"));//.
		//and().
			//body("visibility", equalTo(10000));
	}
}
