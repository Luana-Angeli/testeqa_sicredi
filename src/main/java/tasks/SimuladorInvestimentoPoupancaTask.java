package tasks;

import org.openqa.selenium.WebDriver;

import objects.SimuladorInvestimentoPoupancaObject;

public class SimuladorInvestimentoPoupancaTask {
	SimuladorInvestimentoPoupancaObject simulador;

	public SimuladorInvestimentoPoupancaTask(WebDriver driver) {
		simulador = new SimuladorInvestimentoPoupancaObject(driver);
	}

	public void escolherPerfil() {
		simulador.informeSeuPerfil().get(0).click();
	}

	public String informarAplicacao(String valor) {
		simulador.valorAplicar().sendKeys(valor);
		return valor;

	}

	public String informarInvestimento(String valor) {
		simulador.valorInvestir().sendKeys(valor);
		return valor;
	}

	public String tempo(String valor) {
		simulador.tempo().sendKeys(valor);
		return valor;

	}

	public void meses() {
		simulador.meses().click(); // VER COM AMARAL
		// simulador.selectTempo().get(0).click();
		// alterar para  for passando o valor por parâmetro
	}

	public void simular() {
		simulador.simular().click();
	}

}
