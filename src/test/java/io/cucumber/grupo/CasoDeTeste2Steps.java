package io.cucumber.grupo;

import static org.junit.Assert.assertEquals;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import io.cucumber.grupo.configuracao.Configuracao;
import io.cucumber.java.pt.Dado;
import io.cucumber.java.pt.Entao;

public class CasoDeTeste2Steps {
	public WebDriver browser;

	@Entao("clico no menu servicos devo ver os servicos disponiveis")
	public void clico_no_menu_servicos_devo_ver_os_servi_os_disponiveis() throws InterruptedException {
		Configuracao.browser.findElement(By.xpath("//*[@id=\"navigation-menu\"]/div[2]/div[1]")).click();
		Thread.sleep(2000);
	}

	@Dado("clico no menu servicos")
	public void clico_no_menu_servicos() {
		Configuracao.browser.findElement(By.xpath("//*[@id=\"navigation-menu\"]/div[2]/div[1]")).click();
	}

	@Dado("clico no clico no item do menu cloud")
	public void clico_no_clico_no_item_do_menu_cloud() throws InterruptedException{
        Thread.sleep(5000);
        Configuracao.seletorQueryCss("a[href='/br-pt/services/cloud-index']").click();      
    }

	@Entao("devo encontrar o titulo de {string}")
	public void devo_encontrar_o_titulo_de(String string) {
		String textoElement = Configuracao.seletorQueryCss("h1[class='rte-inline col-xs-12 page-title ']").getText();
		assertEquals("Serviços de Cloud", textoElement);
		Configuracao.fechar();
	}

}