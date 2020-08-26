package Tests;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import PageObjects.ResultadoSimulacaoPage;
import PageObjects.SimuladorInvestimentoPage;
import support.TestBase;

public class ValorInferiorTest extends TestBase {

	@Test
	public void simuladorInvestimento() {

		SimuladorInvestimentoPage simulador = new SimuladorInvestimentoPage(driver);
		simulador.informeSeuPerfil();
		simulador.valorAplicar("10.00");
		simulador.valorInvestir();
		simulador.tempo();
		simulador.meses();
		simulador.simular();

		Assert.assertEquals("Valor mínimo de 20.00", simulador.validarMensagemValorInferior());

	}

}
