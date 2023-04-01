package reqres.CRUDOperations;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.response.ValidatableResponse;

public class GetAllUsersTest {
	
	@Test
	public void getAllUsersTest() {
		//step 1: Create prerequisites
		
		//step 2: send the request
		Response response = RestAssured.get("https://reqres.in/api/users");
		
		//step 3: validate the response
		ValidatableResponse val = response.then();
		val.assertThat().statusCode(200);
		val.log().all();
	
	}

}
