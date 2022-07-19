package reforco11;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class teste_senai {
	private WebDriver driver;
	
	@Before
	public void abrirNavegador() {
		System.setProperty("webdriver.chrome.driver","C:\\Program Files\\chromedriver\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
	}
	
	
	@Test
	public void testeSenai() {
		driver.get("https://informatica.sp.senai.br/");
		driver.findElement(By.id("Busca1_txtFiltro")).sendKeys("informatica");
		driver.findElement(By.id("Busca1_btnBusca")).click();
	}
	
	@Test
	public void testeML() {
		driver.get("https://www.mercadolivre.com.br/");
		driver.findElement(By.id("cb1-edit")).sendKeys("carro");
		driver.findElement(By.className("nav-search-btn")).click();
	}
	
}
