package Tests;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import PageObjects.SimuladorInvestimentoPage;
import support.TestBase;

public class SimuladorInvestimentoTest extends TestBase {

	@Test
	public void simuladorInvestimento() throws InterruptedException{

		SimuladorInvestimentoPage simulador = new SimuladorInvestimentoPage(driver);

		simulador.informeSeuPerfil();

		simulador.valorAplicar();

		simulador.valorInvestir();

		simulador.tempo();

		simulador.meses();

		simulador.simular();
		
		
	
	
	}
	

}
