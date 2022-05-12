package br.senai.sp.automacaoteste;

import java.util.concurrent.TimeUnit;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.By.ById;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.w3c.dom.html.HTMLTitleElement;

public class HomePage {
	private WebDriver driver;
	
	@Before
	public void Setup() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "D:\\Protegido\\SENAI\\UC11\\chromedriver\\chromedriver.exe");
		driver = new ChromeDriver();
		//driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
		//Thread.sleep(3000);
		driver.manage().window().maximize();		
	}
	
	@Test
	public void testeNavegarParaGoogle() throws InterruptedException {		
		driver.get("https://online.sp.senai.br/");
		driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);		
		driver.findElement(By.id("Busca1_txtFiltro")).sendKeys("gestão");
		driver.findElement(By.id("Busca1_btnBusca")).click();
		//driver.findElement(By.id("Busca1_btnBusca")).sendKeys(Keys.ENTER);
		
		//Menu Lateral Institucional
		Thread.sleep(3000);
		driver.findElement(By.xpath("//*[@id=\"nav\"]/li[2]/a")).click();
		//Menu Lateral Cursos - Cursos Livres
		Thread.sleep(3000);
		driver.findElement(By.xpath("//*[@id=\"nav\"]/li[3]/a")).click();
		Thread.sleep(1500);
		driver.findElement(By.xpath("//*[@id=\"MenuLateral_rptMenuEscola_rptSubMenu_1_lnkSubMenu_1\"]")).click();
	}
	
	@After
	public void FecharNavegador() throws InterruptedException {
		Thread.sleep(3000);
		driver.close();
	}	
}
