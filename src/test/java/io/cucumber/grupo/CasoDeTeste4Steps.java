package io.cucumber.grupo;

import org.openqa.selenium.By;

import io.cucumber.grupo.configuracao.Configuracao;
import io.cucumber.java.pt.Dado;
import io.cucumber.java.pt.Entao;

public class CasoDeTeste4Steps {

    @Dado("clico no menu sobre a accenture")
    public void clico_no_menu_sobre_a_accenture() throws InterruptedException {
        Thread.sleep(3000);
        Configuracao.browser.findElement(By.xpath("//*[@id=\"navigation-menu\"]/div[5]/div[1]")).click();
    }

    @Dado("clico no item do menu sobre a accenture")
    public void clico_no_item_do_menu_sobre_a_accenture() throws InterruptedException {
        Thread.sleep(5000);
        Configuracao.seletorQueryCss("div[data-id='primaryLink5_SobreaAccenture']").click();
    }

    @Entao("devo ver o destaque em {string}")
    public void devo_ver_o_destaque_em(String string) throws InterruptedException {
        Configuracao.seletorQueryCss(".sectionTitle");
        Configuracao.fechar();        
    }
}