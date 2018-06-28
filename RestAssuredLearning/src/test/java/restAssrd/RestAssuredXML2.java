package restAssrd;

import org.testng.Assert;
import org.testng.annotations.Test;

import io.restassured.path.xml.XmlPath;
import io.restassured.path.json.JsonPath;

import static io.restassured.RestAssured.*;
import static io.restassured.matcher.RestAssuredMatchers.*;
//import static io.restassured.module.jsv.JsonSchemaValidator.*;
import static org.hamcrest.Matchers.*;

public class RestAssuredXML2 {

	@Test
	public void getXMLSimple() {

		//given().pathParam("ID", "12212");
		
		// Get the response XML from the REST service and store it as a String
		String xml = get("http://parabank.parasoft.com/parabank/services/bank/customers/12212/").andReturn().asString();

		// Retrieve the values to be checked from the XML as a String
		XmlPath xmlPath = new XmlPath(xml).setRoot("customer");
		String customerId = xmlPath.getString("id");
		String firstName = xmlPath.getString("firstName");
		String lastName = xmlPath.getString("lastName");

		// Perform the required checks
		Assert.assertEquals(customerId, "12212");
		Assert.assertEquals(firstName, "John");
		Assert.assertEquals(lastName, "Smith");
	}
}
