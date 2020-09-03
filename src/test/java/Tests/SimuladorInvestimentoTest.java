package tests;

import pageObjects.ResultadoSimulacaoPage;
import org.junit.Assert;
import org.junit.Test;
import pageObjects.SimuladorInvestimentoPage;
import support.TestBase;

public class SimuladorInvestimentoTest extends TestBase {

	@Test
	public void simuladorInvestimento() {

		SimuladorInvestimentoPage simulador = new SimuladorInvestimentoPage(driver);
		simulador.informeSeuPerfil();
		simulador.valorAplicar("20.00");
		simulador.valorInvestir("20.00");
		simulador.tempo("12");
		simulador.meses();
		simulador.simular();

		ResultadoSimulacaoPage resultado = new ResultadoSimulacaoPage(driver);

		Assert.assertEquals("Em 12 meses você terá guardado", resultado.mensagemResultado());
		Assert.assertEquals("R$ 262", resultado.valorResultado());

//		Assert.assertEquals("Tempo (Meses)", resultado.tabelaResultadoTempo());
	}

}
