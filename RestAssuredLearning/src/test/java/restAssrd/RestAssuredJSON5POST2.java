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

public class RestAssuredJSON5POST2 {
	@Test
	public void getSimple() {

		int a = 8, b = 9;
		Assert.assertEquals("Achacho", a, b);
	}
}
