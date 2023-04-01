package reqres.responseValidation;

import static io.restassured.RestAssured.baseURI;
import static io.restassured.RestAssured.when;

import org.testng.Assert;
import org.testng.annotations.Test;

import io.restassured.response.Response;

public class ResponseBodyValidation {
	
	@Test
	public void getAllUsers() {
		baseURI = "https://reqres.in"; 
		Response rsp = when()
			.get("/api/unknown");
		rsp.then()
			.assertThat()
				.statusCode(200)
				.log().all();
		
		String actValue = rsp.jsonPath().get("data[3].name");     // no need to give initial dot, json will add automatically
		
		Assert.assertEquals(actValue, "aqua sky");
	}
}
