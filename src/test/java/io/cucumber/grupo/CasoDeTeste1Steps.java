package io.cucumber.grupo;


import static org.junit.Assert.assertEquals;
import org.openqa.selenium.WebDriver;
import io.cucumber.java.pt.*;
import io.cucumber.grupo.configuracao.*;
import io.cucumber.grupo.CompartilhadoSteps;



public class CasoDeTeste1Steps {
	public WebDriver browser;  
	
	@Dado("que eu estou no site da accenture")
	public void que_eu_estou_no_site_da_accenture() {
	  CompartilhadoSteps.abrirSiteAccenture();
	}
	
	
	
	@Entao("aceito os termos LGPD")
	public void aceito_os_termos_LGPD() throws InterruptedException {
		Configuracao.seletorQueryCss("#onetrust-pc-btn-handler").click();
		Thread.sleep(3000);
		Configuracao.seletorQueryCss(".save-preference-btn-handler.onetrust-close-btn-handler").click();
	}


	@Dado("clico em configuracaes de cookie")
	public void clico_em_configuracaes_de_cookie() {
	    Configuracao.seletorQueryCss("#optanon-minimize-button").click();
	}

	@Entao("devo ver os itens")
	public void devo_ver_os_itens(io.cucumber.datatable.DataTable dataTable) {
	   assertEquals(true, Configuracao.seletorQueryCssTodos(".ot-sdk-container.groups-container").size() > 0);
	   Configuracao.fechar();
	}
}
