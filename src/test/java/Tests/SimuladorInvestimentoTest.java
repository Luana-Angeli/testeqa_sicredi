package Tests;

import org.junit.Test;

import PageObjects.SimuladorInvestimentoPage;
import support.TestBase;

public class SimuladorInvestimentoTest extends TestBase {

	@Test
	public void simuladorInvestimento() {

		SimuladorInvestimentoPage simulador = new SimuladorInvestimentoPage(driver);

		simulador.clicarPraVoce();

		simulador.valorAplicar();

		simulador.valorInvestir();
		
		simulador.tempo();
		
		simulador.meses();
		
		simulador.simular();

	}

}
