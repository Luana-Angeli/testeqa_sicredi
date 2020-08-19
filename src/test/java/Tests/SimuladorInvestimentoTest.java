package Tests;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import PageObjects.ResultadoSimulacaoPage;
import PageObjects.SimuladorInvestimentoPage;
import support.TestBase;

public class SimuladorInvestimentoTest extends TestBase {

	@Test
	public void simuladorInvestimento() {

		SimuladorInvestimentoPage simulador = new SimuladorInvestimentoPage(driver);
		simulador.informeSeuPerfil();
		simulador.valorAplicar();
		simulador.valorInvestir();
		simulador.tempo();
		simulador.meses();
		simulador.simular();
		
		ResultadoSimulacaoPage resultado = new ResultadoSimulacaoPage(driver);

		Assert.assertEquals("Em 23 meses você terá guardado", resultado.mensagemResultado());

	}

}
