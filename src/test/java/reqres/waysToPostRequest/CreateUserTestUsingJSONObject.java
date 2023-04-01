package reqres.waysToPostRequest;

import static io.restassured.RestAssured.*;

import org.json.simple.JSONObject;
import org.testng.annotations.Test;

import io.restassured.http.ContentType;

public class CreateUserTestUsingJSONObject {
	@Test
	public void createUserTest() {
		// step 1: create prerequisites
		
		baseURI = "https://reqres.in" ;
		JSONObject obj = new JSONObject();
		obj.put("name", "vamsi");
		obj.put("job", "test engineer");
		
		given()
			.body(obj)
			.contentType(ContentType.JSON)
		.when()
			.post("/api/users")
		.then()
			.log().all()
			.assertThat()
				.statusCode(201)
				.contentType(ContentType.JSON);
		
		
		
		
	}

}
