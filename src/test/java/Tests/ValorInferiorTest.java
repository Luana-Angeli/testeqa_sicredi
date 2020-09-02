package tests;

import org.junit.Assert;
import org.junit.Test;
import pageObjects.SimuladorInvestimentoPage;
import support.TestBase;

public class ValorInferiorTest extends TestBase {

	@Test
	public void simuladorInvestimento() {

		SimuladorInvestimentoPage simulador = new SimuladorInvestimentoPage(driver);
		simulador.informeSeuPerfil();
		simulador.valorAplicar("10.00");
		simulador.valorInvestir("10.00");
		simulador.tempo("12");
		simulador.meses();
		simulador.simular();

		Assert.assertEquals("Valor m�nimo de 20.00", simulador.validarMensagemValorInferiorAplicar());
		Assert.assertEquals("Valor m�nimo de 20.00", simulador.validarMensagemValorInferiorInvestir());
		//Assert.assertEquals("Valor esperado n�o confere", simulador.validarMensagemTempoValorIncorreto());	
		
		
		
        //simulador.tempo(" ");
		//Assert.assertEquals("Obrigat�rio", simulador.validarMensagemTempoObrigatorio());
	 	
		//if (simulador.tempo("0")){
		//	Assert.assertEquals("Valor esperado n�o confere", simulador.validarMensagemTempoValorIncorreto());	
		//}if else (simulador.tempo(" ")){
		//	Assert.assertEquals("Obrigat�rio", simulador.validarMensagemTempoObrigatorio());	
		//}
		
		
		
		
	}

}
