package Tests;


import org.junit.Test;
import PageObjects.ResultadoSimulacaoPage;
import support.TestBase;

public class ResultadoSimulacaoTest extends TestBase {

	@Test
	public void simuladorInvestimento() throws InterruptedException{

		ResultadoSimulacaoPage resultado = new ResultadoSimulacaoPage(driver);

		
		resultado.mensagemResultado();
	
		
		
	
	
	}
	

}
