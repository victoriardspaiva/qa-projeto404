package io.cucumber.grupo;

import static org.junit.Assert.assertEquals;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import io.cucumber.grupo.configuracao.Configuracao;
import io.cucumber.java.pt.*;

public class CasoDeTeste2Steps {
	public WebDriver browser;

	String[] menuElements;
	int counter = 0;

	@Quando("clico no menu servicos")
	public void clico_no_menu_servicos() throws InterruptedException {
		Configuracao.seletorQueryCss("div[data-id='primaryLink2_Servios']").click();
		Thread.sleep(2000);
	}

	@Entao("devo ver os servicos abaixo")
	public void devo_ver_os_servicos_abaixo(io.cucumber.datatable.DataTable dataTable) throws InterruptedException {
		Thread.sleep(5000);
	    	By mySelector = By.xpath("//*[@id=\"primaryLink2_Servios\"]/div/div/ul");
	    	List<WebElement> myElements = Configuracao.browser.findElements(mySelector);  
	    
	    	for(WebElement e : myElements) {
	    		String aux = e.getText();    	
	    		menuElements = aux.split("\n");	    		
	    	}
	    
	    	for (int i = 0; i < menuElements.length; i++) {
	    		String line = dataTable.row(i).get(0);
	    		if(menuElements[i].equals(line)) {
	    			counter++;
	    		}
		}
	    	assertEquals(22, counter);
	    	Configuracao.fechar();

	}

	@E("clico no item do menu cloud")
	public void clico_no_clico_no_item_do_menu_cloud() throws InterruptedException {
		Thread.sleep(2000);
		Configuracao.seletorQueryCss("a[href='/br-pt/services/cloud-index']").click();
	}

	@Entao("devo encontrar o titulo de {string}")
	public void devo_encontrar_o_titulo_de(String string) {
		String textoElement = Configuracao.seletorQueryCss("h1[class='rte-inline col-xs-12 page-title ']").getText();
		assertEquals("Serviços de Cloud", textoElement);
		Configuracao.fechar();
	}

}