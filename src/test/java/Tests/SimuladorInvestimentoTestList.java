package tests;

import org.junit.Assert;
import org.junit.Test;
import pageObjects.ResultadoSimulacaoPage;
import pageObjects.SimuladorInvestimentoPage;
import support.TestBase;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SimuladorInvestimentoTestList extends TestBase {

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
//
//		Assert.assertEquals("Em 12 meses você terá guardado", resultado.mensagemResultado());
//		Assert.assertEquals("R$ 262", resultado.valorResultado());
//		
//		Assert.assertEquals("R$ 507", resultado.tabelaResultadoTempo("24"));
//		Assert.assertEquals("R$ 756", resultado.tabelaResultadoTempo("36"));
//		Assert.assertEquals("R$ 1.008", resultado.tabelaResultadoTempo("41"));
//		Assert.assertEquals("R$ 1.263", resultado.tabelaResultadoTempo("60"));
//		

		List<String> mesesValor = new ArrayList<String>();
		mesesValor.add("24");
		mesesValor.add("36");
		mesesValor.add("48");
		mesesValor.add("60");

		List<String> valores = new ArrayList<String>(Arrays.asList("R$ 507","R$ 756","R$ 1.008","R$ 1.263"));

		Assert.assertEquals(4, resultado.tabelaResultadoTempo2(mesesValor, valores));
	}
}
