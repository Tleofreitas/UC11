package br.com.testeGameMANIA;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TesteGameMania {
	private WebDriver driver;
	
	@Before
	public void Setup() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "D:\\Protegido\\Cursos\\Full-Stack--SENAI\\Front End\\UC11\\chromedriver\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		Thread.sleep(3000);
	}
	
	@Test
	public void AbrirNavegador () throws InterruptedException {
		//Teste do Link
		driver.get("http://localhost:4200/");
		Thread.sleep(3000);
		
		//Teste das Categorias
		driver.findElement(By.id("playstation")).click();
		Thread.sleep(3000);
		driver.findElement(By.id("xbox")).click();
		Thread.sleep(3000);
		driver.findElement(By.id("nintendo")).click();
		Thread.sleep(3000);
		driver.findElement(By.id("retro")).click();
		Thread.sleep(3000);
		
		//Teste da Home 1
		driver.findElement(By.id("home")).click();
		Thread.sleep(3000);
		
		//Teste dos Botões das Categorias
		driver.findElement(By.id("playstation_")).click();
		Thread.sleep(3000);
		driver.findElement(By.id("xbox_")).click();
		Thread.sleep(3000);
		driver.findElement(By.id("nintendo_")).click();
		Thread.sleep(3000);
		driver.findElement(By.id("retro_")).click();
		Thread.sleep(3000);
		
		//Teste da Home 2
		driver.findElement(By.id("home2")).click();
		Thread.sleep(3000);
		
		//Teste da Barra de Pesquisa
		driver.findElement(By.id("pesquisar")).sendKeys("God of War");
		driver.findElement(By.id("pesquisar")).sendKeys(Keys.ENTER);
		Thread.sleep(3000);

		//Teste do Whats
		driver.findElement(By.id("whats")).click();
		Thread.sleep(3000);
		
		//Teste do Facebook
		driver.findElement(By.id("face")).click();
		Thread.sleep(3000);
		
		//Teste do Instagram
		driver.findElement(By.id("insta")).click();
		Thread.sleep(3000);
		
		//Teste de Login
		driver.findElement(By.id("login")).click();
		Thread.sleep(3000);
		WebElement inputEmail = driver.findElement(By.id("email"));
		WebElement inputSenha = driver.findElement(By.id("senha"));	
		WebElement botao = driver.findElement(By.id("logar"));
		
		String[] listaSenhas = { "", "testando", "teste123" };
			
		for(int tentativas = 0; tentativas < 3; tentativas++) {
			
			inputEmail.clear();
			inputSenha.clear();			
			Thread.sleep(3000);
			
			inputEmail.sendKeys("teste@email.com");
			Thread.sleep(1500);
			inputSenha.sendKeys(listaSenhas[tentativas]);
			Thread.sleep(1500);
			botao.click();
					
		}
		
	}

}
