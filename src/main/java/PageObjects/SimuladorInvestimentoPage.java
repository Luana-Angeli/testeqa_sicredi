package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class SimuladorInvestimentoPage {

	private WebDriver driver;
	private WebDriverWait espera;

	public SimuladorInvestimentoPage(WebDriver driver) {

		this.driver = driver;
		this.espera = new WebDriverWait(driver, 20);

	}

	public void informeSeuPerfil() {
		driver.findElements(informeSeuPerfil).get(0).click();

	}

	public void valorAplicar(String valor) {
		driver.findElement(valorAplicar).sendKeys(valor);
	}

	public void valorInvestir(String valor) {
		driver.findElement(valorInvestir).sendKeys(valor);
	}

	public String validarMensagemValorInferiorAplicar() {
		return espera.until(ExpectedConditions.visibilityOfElementLocated(mensagemValorInferiorAplicar)).getText();
	}

	public String validarMensagemValorInferiorInvestir() {
		return espera.until(ExpectedConditions.visibilityOfElementLocated(mensagemValorInferiorInvestir)).getText();
	}

	public void tempo(String valor) {
		driver.findElement(tempo).sendKeys(valor);

	}

	public String validarMensagemTempoObrigatorio() {
		return espera.until(ExpectedConditions.visibilityOfElementLocated(mensagemTempoObrigatorio)).getText();
	}

	public String validarMensagemTempoValorIncorreto() {
		return espera.until(ExpectedConditions.visibilityOfElementLocated(mensagemTempoValorIncorreto)).getText();
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
	private By valorInvestir = By.id("valorInvestir");
	private By mensagemValorInferiorAplicar = By.id("valorAplicar-error");
	private By mensagemValorInferiorInvestir = By.id("valorInvestir-error");
	private By tempo = By.id("tempo");
	private By mensagemTempoObrigatorio = By.id("tempo-error");
	private By mensagemTempoValorIncorreto = By.id("tempo-error");
	private By meses = By.linkText("Meses");
	private By selecionarTempo = By.cssSelector("ul[class='listaSelect'] >li > a");
	private By simular = By.xpath("//button[@class='btn btnAmarelo btnSimular']");

}
