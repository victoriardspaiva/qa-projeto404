package io.cucumber.grupo;

import static org.junit.Assert.assertEquals;
import org.openqa.selenium.By;
import io.cucumber.grupo.configuracao.Configuracao;
import io.cucumber.java.pt.*;

public class CasoDeTeste3Steps {

	@Quando("clico no menu carreiras")
	public void clico_no_menu_carreiras() throws Exception {
		Thread.sleep(3000);
		Configuracao.seletorQueryCss("div[data-target='#primaryLink4_Carreiras']").click();
	}

	@E("clico no item procurar por vagas")
	public void procurarVagas() throws InterruptedException {
		Thread.sleep(3000);
		Configuracao.seletorQueryCss("a[href='/br-pt/careers/jobsearch']").click();
	}
	
	@E("digito no campo de busca Desenvolvedor")
	public void digito_no_campo_de_busca() {
		Configuracao.browser.findElement(By.id("job-search-hero-bar")).sendKeys("Desenvolvedor");
	}

	@E("clico no botao procurar")
	public void clico_no_botao_procurar() {
		Configuracao.seletorQueryCss(".button-container.col-xs-2").click();
	}

	@Entao("devo encontrar vagas para programadores")
	public void devo_encontrar_vagas_para_programadores() throws InterruptedException {
		Thread.sleep(3000);	
		assertEquals(true, Configuracao.seletorQueryCssTodos(".upper-set-jobs.job-listing-block.col-xs-12").size() > 0);
		Configuracao.fechar();
	}

}