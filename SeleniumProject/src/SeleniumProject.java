/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *
 * @author owenm
 */
import static java.awt.SystemColor.text;
import org.openqa.selenium.*;
import org.openqa.selenium.support.ui.*;
import org.openqa.selenium.chrome.ChromeDriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumProject {

    /**
     * @param args the command line arguments
     */
    static WebDriver driver;

    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\owenm\\Downloads\\chromedriver_win32\\chromedriver.exe");
        System.out.println("Test initiated");
        driver = new ChromeDriver();
        //driver.get("https:\\amazon.com");
        driver.navigate().to("https:\\www.bancopopular.fi.cr"); 
        //driver.manage().window().maximize();
        String appTitle = driver.getTitle();
        System.out.println("Nombre del sitio web: " + appTitle);
        
        
        System.out.println( "URL actual: " +driver.getCurrentUrl());
        
       String compraDolar= driver.findElement(By.xpath("//*[@id=\"tipoCambioCompra\"]")).getText();
       String ventaDolar= driver.findElement(By.xpath("//*[@id=\"tipoCambioVenta\"]")).getText();
       System.out.println("Tipo de Compra del Dolar: "+compraDolar);
       System.out.println("Tipo de Venta del Dolar: "+ventaDolar);
       
       
       driver.get("https:\\www.bancopopular.fi.cr/contacto/"); 
       driver.findElement(By.id(""));
      //driver.findElement(By.className("elementor-button-wrapper")).click();
       
      
       
    }

}
