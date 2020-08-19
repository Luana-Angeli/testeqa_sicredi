package PageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import org.junit.Assert;
import support.TestBase;

public class ResultadoSimulacaoPage extends TestBase {

	private WebDriver driver;

	public ResultadoSimulacaoPage(WebDriver driver) {

		this.driver = driver;

	}

	public String mensagemResultado() {

		String texto = driver.findElement(resultado).getText();
        System.out.println(texto);
		return texto;

	}

	private By resultado = By.className("texto");

}
