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
	private WebElement element;

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

	// Exercicio 4:
//	-> ao inves de passar uma string do mes, o metodo de validacao deve receber uma listagem de meses e uma listagem de valores: OK;
//
//	-> vamos precisar de dois for's, uma para os meses e outro para os valores: OK;
//
//	-> caso encontre todos os valores corretos retornar true, caso contrario false;

	public Boolean tabelaResultadoTempo2(List<String> mesesValor, List<String> valores) {

		List<WebElement> mesesList = wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(tempoMeses));
		List<WebElement> valorList = wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(valorMeses));

		for (int m = 0; m < mesesValor.size(); m++) {
			for (int v = 0; v < valores.size(); v++) {
				if (mesesValor.get(m).equals(mesesList.get(m).getText())) {
					if (valores.get(v).equals(valorList.get(v).getText())) {
						// if (mesesValor.get(m).equals(mesesList.get(m).getText())
						// && valores.get(v).equals(valorList.get(v).getText())) {
						System.out.println(mesesList.get(m).getText());
						System.out.println(valorList.get(v).getText());

						break;

						// }
					}
					System.out.println("");
				}

			}

		}
		return false;

	}

	//lista de booleanos
	
	
	
	
	
	
	private By texto1 = By.cssSelector("span[class='texto']");
	private By valor1 = By.cssSelector("span[class='valor']");

	// busca elemento da tabela resulta coluna tempo e valores
	private By tempoMeses = By.cssSelector("tbody > tr > td:nth-child(1)");
	private By valorMeses = By.cssSelector("tbody > tr > td:nth-child(2)");

}
