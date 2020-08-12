package PageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;

public class SimuladorInvestimentoPage {

	private WebDriver driver;

	public SimuladorInvestimentoPage(WebDriver driver) {

		this.driver = driver;

	}

	public void clicarPraVoce() {
		driver.findElement(paraVoce).click();
	}

	public void valorAplicar() {
		driver.findElement(valorAplicar).sendKeys("20,00");
	}

	public void valorInvestir() {
		driver.findElement(valorInvestir).sendKeys("20.00");
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

	private By paraVoce = By.xpath("//input[@value='paraVoce']");
	private By valorAplicar = By.id("valorAplicar");
	private By valorInvestir = By.id("valorInvestir");
	private By tempo = By.id("tempo");
	private By meses = By.linkText("Meses");
	private By selecionarTempo = By.cssSelector("ul[class='listaSelect'] >li > a");
	private By simular = By.xpath("//button[@class='btn btnAmarelo btnSimular']");

}
