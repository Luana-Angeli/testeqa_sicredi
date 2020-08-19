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
	
	public void mensagemResultado() {
	
		driver.findElement(resultado);
				
		
	}
	
	
	private By resultado = By.xpath("//span[@class=\"texto\"]");

}
