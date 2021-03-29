package io.cucumber.grupo;

import static org.junit.Assert.assertEquals;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import io.cucumber.grupo.configuracao.Configuracao;
import io.cucumber.java.pt.*;

public class CasoDeTeste2Steps {
	public WebDriver browser;

	@Quando("clico no menu servicos")
	public void clico_no_menu_servicos() throws InterruptedException {
		Configuracao.seletorQueryCss("div[data-id='primaryLink2_Servios']").click();
		Thread.sleep(2000);
	}

	// @Entao("devo ver os servicos abaixo")
	// public void verServicos() throws InterruptedException {
	// assertEquals(true,
	// Configuracao.seletorQueryCssTodos("#primaryLink2_Servios").size() > 0);
	// Thread.sleep(2000);
	// }

	@Entao("devo ver os servicos abaixo")
	public void devo_ver_os_servicos_abaixo(io.cucumber.datatable.DataTable dataTable) {
		// Write code here that turns the phrase above into concrete actions
		// For automatic transformation, change DataTable to one of
		// E, List<E>, List<List<E>>, List<Map<K,V>>, Map<K,V> or
		// Map<K, List<V>>. E,K,V must be a String, Integer, Float,
		// Double, Byte, Short, Long, BigInteger or BigDecimal.
		//
		// For other transformations you can register a DataTableType.
		throw new io.cucumber.java.PendingException();
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