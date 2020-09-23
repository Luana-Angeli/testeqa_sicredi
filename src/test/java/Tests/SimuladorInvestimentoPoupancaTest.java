package tests;

import org.junit.Test;

import support.TestBase;
import tasks.SimuladorInvestimentoPoupancaTask;

public class SimuladorInvestimentoPoupancaTest extends TestBase {
	
	@Test
	public void simuladorInvestimentoPoupanca() {
		
		SimuladorInvestimentoPoupancaTask simuladorPoupanca = new SimuladorInvestimentoPoupancaTask(driver);
		
		simuladorPoupanca.escolherPerfil();
		simuladorPoupanca.informarAplicacao("20.00");
		simuladorPoupanca.informarInvestimento("20.00");
		simuladorPoupanca.tempo("12");
		simuladorPoupanca.meses();
		simuladorPoupanca.simular();
		
		
		
		
	}
	

}
