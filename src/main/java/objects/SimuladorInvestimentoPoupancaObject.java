package objects;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class SimuladorInvestimentoPoupancaObject {

	private WebDriver driver;
	private WebDriverWait espera;

	public SimuladorInvestimentoPoupancaObject(WebDriver driver) {

		this.driver = driver;
		this.espera = new WebDriverWait(driver, 20);

	}

	public List<WebElement> informeSeuPerfil() {
		return espera.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(
				By.cssSelector("div[class='relative campoObrigatorio clearfix'] > input")));
	}

	public WebElement valorAplicar() {
		return espera.until(ExpectedConditions.visibilityOfElementLocated(By.id("valorAplicar")));
	}

	public WebElement valorInvestir() {
		return espera.until(ExpectedConditions.visibilityOfElementLocated(By.id("valorInvestir")));
	}

	public WebElement tempo() {
		return espera.until(ExpectedConditions.visibilityOfElementLocated(By.id("tempo")));
	}

	public WebElement meses() {

		 return espera.until(ExpectedConditions.visibilityOfElementLocated(By.linkText("Meses")));
		// return espera.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.cssSelector("ul[class='listaSelect'] >li > a")));
	}

	public WebElement simular() {
		return espera.until(ExpectedConditions
				.visibilityOfElementLocated(By.xpath("//button[@class='btn btnAmarelo btnSimular']")));
	}

}