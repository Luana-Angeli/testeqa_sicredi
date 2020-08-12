package support;

import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;

public class TestBase {

	public WebDriver driver;

	@Before
	public void setUp() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://www.sicredi.com.br/html/ferramenta/simulador-investimento-poupanca/");

	}
	
	//@After
	//public void tearDown() {
		
	//	driver.quit();
	//}
	

}
