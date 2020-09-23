package Tests;

import io.restassured.RestAssured;
import org.junit.Test;
import static io.restassured.RestAssured.*;

public class PocRest {

    @Test
    public void poc(){
        String response = given().expect().statusCode(404)
                .when().get("http://correiosapi.apphb.com/cep/91530030")
                .then().extract().asString();

        System.out.println(response);
    }
}
