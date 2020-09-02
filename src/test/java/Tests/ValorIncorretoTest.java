package Tests;

import org.junit.Assert;
import org.junit.Test;
import pageObjects.SimuladorInvestimentoPage;
import support.TestBase;

public class ValorIncorretoTest extends TestBase {

	@Test
	public void simuladorInvestimento() {

		SimuladorInvestimentoPage simulador = new SimuladorInvestimentoPage(driver);
		simulador.informeSeuPerfil();
		simulador.valorAplicar("30.00");
		simulador.valorInvestir("30.00");
		simulador.tempo("0");
		simulador.meses();
		simulador.simular();

		Assert.assertEquals("Valor esperado não confere", simulador.validarMensagemTempoValorIncorreto());
	}
}
