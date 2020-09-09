package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import support.TestBase;

import java.util.List;

public class ResultadoSimulacaoPage extends TestBase {

	private WebDriver driver;
	private WebDriverWait wait;

	public ResultadoSimulacaoPage(WebDriver driver) {
		this.driver = driver;
		wait = new WebDriverWait(driver, 10);
	}

	public String mensagemResultado() {
		String texto = wait.until(ExpectedConditions.visibilityOfElementLocated(texto1)).getText();// espera explicita
		return texto;
	}

	public String valorResultado() {
		String valor = wait.until(ExpectedConditions.visibilityOfElementLocated(valor1)).getText();
		return valor;

	}

	// Exercicio 3:
	/*
	 * percorrer a lista de meses - dentro dela eu vou pegar a posicao 0,1,2,3
	 * percorrer a lista de valores - dentro dele eu vou pegar a posicao 0,1,2,3
	 * 
	 * depois de pegar os dois valores, eu vou criar a condição para validar se o
	 * mes esta com o valores esperado
	 */

	public String tabelaResultadoTempo() {

		List<WebElement> mesesList = wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(tempoMeses));
		List<WebElement> valorList = wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(valorMeses));

		for (int m = 0; m < mesesList.size(); m++) {
			for (int v = 0; v < valorList.size(); v++) {
				if (mesesList.get(m).equals(valorList.get(v))) {

					return mesesList.get(0).getText();

				}
			}
		}
		return null;

	}

	private By texto1 = By.cssSelector("span[class='texto']");
	private By valor1 = By.cssSelector("span[class='valor']");

	// busca elemento da tabela resulta coluna tempo e valores
	private By tempoMeses = By.cssSelector("tbody > tr > td:nth-child(1)");
	private By valorMeses = By.cssSelector("tbody > tr > td:nth-child(2)");

}
