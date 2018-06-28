package restAssrd;

import org.testng.annotations.Test;

import static io.restassured.RestAssured.*;
import static io.restassured.matcher.RestAssuredMatchers.*;
//import static io.restassured.module.jsv.JsonSchemaValidator.*;
import static org.hamcrest.Matchers.*;

public class RestAssuredXML {

	@Test
	public void getXMLSimple() {

		when().
			get("http://parabank.parasoft.com/parabank/services/bank/customers/12212/").
		then().
			assertThat().body("customer.id", equalTo("12212")).
			and().
			assertThat().body("customer.firstName", equalTo("John")).
			and().
			assertThat().body("customer.lastName", equalTo("Smith"));
	}
}
