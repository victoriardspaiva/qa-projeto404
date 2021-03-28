package io.cucumber.grupo.configuracao;

import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Configuracao {
    
    public static WebDriver browser;
    
    public static void abrir(String url) {
        if(browser == null){
        System.setProperty("webdriver.chrome.driver", "driver/chromedriver.exe");
        browser = new ChromeDriver();
        browser.manage().window().maximize();
    }
    browser.get(url);
}

public static void fechar(){
    browser.close();
    browser = null;
}

public static WebElement seletorQueryCss(String seletor){
    return browser.findElement(By.cssSelector(seletor));
}

public static List<WebElement> seletorQueryCssTodos(String seletor){
    return browser.findElements(By.cssSelector(seletor));
}

    
}