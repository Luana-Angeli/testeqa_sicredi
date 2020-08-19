package PageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import support.TestBase;

import java.util.concurrent.TimeUnit;

public class ResultadoSimulacaoPage extends TestBase {

	private WebDriver driver;

	public ResultadoSimulacaoPage(WebDriver driver) {
		this.driver = driver;
	}

	public String mensagemResultado() {
		String texto = new WebDriverWait(driver, 10)
				.until(ExpectedConditions.visibilityOfElementLocated(texto1)).getText();
		return texto;
	}

	private By texto1 = By.cssSelector("span[class='texto']");
}
