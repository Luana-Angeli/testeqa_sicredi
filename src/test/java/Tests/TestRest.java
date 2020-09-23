package tests;

import io.restassured.path.json.JsonPath;
import org.junit.Assert;
import org.junit.Test;
import tasks.RestTask;

import java.util.List;

import static io.restassured.RestAssured.given;

public class TestRest {

	@Test
	public void validarIdAPI() {
		JsonPath sicredi = RestTask.getMesesValores();
		Assert.assertEquals(1, sicredi.get("id"));
	}

	@Test
	public void validarMesesAPI() {
		JsonPath sicredi = RestTask.getMesesValores();
		String mes = sicredi.get("meses[3]");
		System.out.println(mes);
	}




}
