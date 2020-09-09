package tests;

import org.junit.Assert;
import org.junit.Test;
import pageObjects.SimuladorInvestimentoPage;
import support.TestBase;

public class ValorObrigatorioTest extends TestBase {

	@Test
	public void simuladorInvestimento() {

		SimuladorInvestimentoPage simulador = new SimuladorInvestimentoPage(driver);
		simulador.informeSeuPerfil();
		simulador.valorAplicar("10.00");
		simulador.valorInvestir("10.00");
		simulador.tempo(" ");
		simulador.meses();
		simulador.simular();

		Assert.assertEquals("Obrigatório", simulador.validarMensagemTempoObrigatorio());
		

	}

}
