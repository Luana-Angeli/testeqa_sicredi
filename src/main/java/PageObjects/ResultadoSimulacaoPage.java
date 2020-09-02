package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.cucumber.messages.internal.com.google.common.io.ByteArrayDataInput;
import support.TestBase;

import java.awt.List;
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

	// Exercicio 3: 
	public void tabelaResultadoTempo() {
		driver.findElements(tempoMeses).get(0).getText();

	}

	public void tabelaResultadoValor() {
		driver.findElements(valorMeses).get(1).getText();
	}

	private By texto1 = By.cssSelector("span[class='texto']");
	private By valor1 = By.cssSelector("span[class='valor']");

	// busca elemento da tabela resulta coluna tempo
	private By tempoMeses = By.cssSelector("div[class='maisOpcoes'] > table > thead > tr > th");
	private By valorMeses = By.cssSelector("div[class='maisOpcoes'] > table > thead > tr > th");
}
