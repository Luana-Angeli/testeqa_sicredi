package tests;

import io.restassured.RestAssured;
import io.restassured.path.json.JsonPath;

import org.junit.Test;
import static io.restassured.RestAssured.*;

public class TestRest {
	
	@Test
	public void testAPI() {
		
		JsonPath response = given().expect().statusCode(200)
                .when().get("http://5b847b30db24a100142dce1b.mockapi.io/api/v1/simulador")
                .then().extract().jsonPath();

        System.out.println(response);
	}
	
	
	

}
