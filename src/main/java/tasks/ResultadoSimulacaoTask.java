package tasks;

import org.openqa.selenium.WebDriver;

import objects.ResultadoSimulacaoObject;
import objects.SimuladorInvestimentoPoupancaObject;

public class ResultadoSimulacaoTask {
	ResultadoSimulacaoObject simulador;

	public ResultadoSimulacaoTask(WebDriver driver) {
		simulador = new ResultadoSimulacaoObject();
	}
}
