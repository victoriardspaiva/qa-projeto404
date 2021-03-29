package io.cucumber.grupo;

import static org.junit.Assert.assertEquals;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import io.cucumber.grupo.configuracao.Configuracao;
import io.cucumber.java.pt.*;

public class CasoDeTeste3Steps {
	public WebDriver browser;

	// assinatura repetida na feature 1
	@Dado("aceito os termos LGPD para teste")
	public void aceito_os_termos_LGPD() throws InterruptedException {
		Configuracao.seletorQueryCss("#onetrust-pc-btn-handler").click();
		Thread.sleep(3000);
		Configuracao.seletorQueryCss(".save-preference-btn-handler.onetrust-close-btn-handler").click();
	}

	@Dado("clico no menu carreiras")
	public void clico_no_menu_carreiras() throws Exception {
		Thread.sleep(3000);
		Configuracao.seletorQueryCss("div[data-id='primaryLink4_Carreiras'] span").click();
	}

	@Dado("clico no item procurar por vagas")
	public void procurarVagas() throws InterruptedException {
		Thread.sleep(3000);
		Configuracao.seletorQueryCss("a[href='/br-pt/careers/jobsearch']").click();
	}
	
	@Dado("digito no campo de busca Desenvolvedor")
	public void digito_no_campo_de_busca() {
		Configuracao.browser.findElement(By.id("job-search-hero-bar")).sendKeys("Desenvolvedor");
	}

	@Dado("clico no botao procurar")
	public void clico_no_botao_procurar() {
		Configuracao.seletorQueryCss(".button-container.col-xs-2").click();
	}

	@Entao("devo encontrar vagas para programadores")
	public void devo_encontrar_vagas_para_programadores() {
		assertEquals(true, Configuracao.seletorQueryCssTodos(".upper-set-jobs.job-listing-block.col-xs-12").size() > 0);
		Configuracao.fechar();
	}

}