package io.cucumber.grupo;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import org.openqa.selenium.WebDriver;
import io.cucumber.java.pt.*;
import io.cucumber.grupo.configuracao.Configuracao;

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

	@Entao("devo ver o item {string}")
	public void devo_ver_o_item(String string) throws InterruptedException{
		Thread.sleep(5000);		
		String item = Configuracao.seletorQueryCss("h3[id='privacy-text']").getText();
		assertEquals(string, item);	
	}

	@Entao("devo ver {string}")
	public void devo_ver_os_itens(String string) {
	  String itens = Configuracao.seletorQueryCss("ul[class='category-group']").getText();
		String mudaLetras = itens.replace("í", "i").replace("á", "a");
		assertTrue(mudaLetras.contains(string)); 
		if(string.equals("Cookies de Publicidade e Redes Sociais")) {
			Configuracao.fechar();			
		}
	}
}