package PageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class SimuladorInvestimentoPage {

	private WebDriver driver;
	private WebDriverWait espera;

	public SimuladorInvestimentoPage(WebDriver driver) {

		this.driver = driver;
		this.espera = new WebDriverWait(driver, 10);

	}

	public void informeSeuPerfil() {
		driver.findElements(informeSeuPerfil).get(0).click();

	}

	public void valorAplicar(String valor) {
		driver.findElement(valorAplicar).sendKeys(valor);
	}

	public void valorInvestir() {
		driver.findElement(valorInvestir).sendKeys("20.00");
	}

	public String validarMensagemValorInferior() {

		return espera.until(ExpectedConditions.visibilityOfElementLocated(mensagemValorInferior)).getText();

	}

	public void tempo() {
		driver.findElement(tempo).sendKeys("12");

	}

	public void meses() {
		driver.findElement(meses).click();
		driver.findElements(selecionarTempo).get(0).click();

	}

	public void simular() {
		driver.findElement(simular).click();

	}

	private By informeSeuPerfil = By.cssSelector("div[class='relative campoObrigatorio clearfix'] > input");
	private By valorAplicar = By.id("valorAplicar");
	private By mensagemValorInferior = By.id("valorAplicar-error");
	private By valorInvestir = By.id("valorInvestir");
	private By tempo = By.id("tempo");
	private By meses = By.linkText("Meses");
	private By selecionarTempo = By.cssSelector("ul[class='listaSelect'] >li > a");
	private By simular = By.xpath("//button[@class='btn btnAmarelo btnSimular']");

}
