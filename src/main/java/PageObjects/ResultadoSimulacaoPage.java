package PageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.cucumber.messages.internal.com.google.common.io.ByteArrayDataInput;
import support.TestBase;

import java.util.concurrent.TimeUnit;

public class ResultadoSimulacaoPage extends TestBase {

	private WebDriver driver;

	public ResultadoSimulacaoPage(WebDriver driver) {
		this.driver = driver;
	}

	public String mensagemResultado() {
		String texto = new WebDriverWait(driver, 10).until(ExpectedConditions.visibilityOfElementLocated(texto1))
				.getText();// espera explicita
		return texto;
	}

	public String valorResultado() {
		String valor = new WebDriverWait(driver, 10).until(ExpectedConditions.visibilityOfElementLocated(valor1))
				.getText();
		return valor;

	}
	
	/*criar um metodo que varra a tabela de resultados da situação.
	 * 1-procurar coluna do tempo: primeira coluna tempo(meses)
	 * 2-encontrar a linhas dos registros
	 * 3-procurar coluna do valor: segunda coluna valor
	 * 4-validar valores.
	 */
	
	

	private By texto1 = By.cssSelector("span[class='texto']");
	private By valor1 = By.cssSelector("span[class='valor']");
}
