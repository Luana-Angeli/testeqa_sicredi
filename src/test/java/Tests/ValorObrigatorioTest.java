package Tests;

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
		simulador.tempo("");
		simulador.meses();
		simulador.simular();

        //simulador.tempo(" ");
		//Assert.assertEquals("Obrigatório", simulador.validarMensagemTempoObrigatorio());
	 	
		//if (simulador.tempo("0")){
		//	Assert.assertEquals("Valor esperado não confere", simulador.validarMensagemTempoValorIncorreto());	
		//}if else (simulador.tempo(" ")){
		//	Assert.assertEquals("Obrigatório", simulador.validarMensagemTempoObrigatorio());	
		//}

	}

}
