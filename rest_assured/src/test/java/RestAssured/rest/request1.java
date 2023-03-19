package RestAssured.rest;

import org.testng.annotations.Test;
import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.equalTo;
import io.restassured.RestAssured;

public class request1 {

	@Test
	public void get_Request() {
		RestAssured.baseURI = "https://reqres.in/";

		given().log().all().header("Content-Type", "application/jason").when().get("/api/users?page=2").then().log()
				.all().assertThat().statusCode(200).body("page", equalTo(2));
	}

}
