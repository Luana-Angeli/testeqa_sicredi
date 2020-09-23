package tasks;

import io.restassured.path.json.JsonPath;

import static io.restassured.RestAssured.given;

public class RestTask {

    public static JsonPath getMesesValores(){
        return given().expect().statusCode(200)
                .when().get("http://5b847b30db24a100142dce1b.mockapi.io/api/v1/simulador")
                .then().extract().jsonPath();
    }
}
