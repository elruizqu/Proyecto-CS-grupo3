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

    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\elena\\Downloads\\chromedriver_win32\\chromedriver.exe");
        System.out.println("Test initiated");
        driver = new ChromeDriver();
        //driver.get("https:\\amazon.com");
        driver.navigate().to("https:\\www.bancopopular.fi.cr");
        driver.manage().window().maximize();
        String appTitle = driver.getTitle();
        System.out.println("Nombre del sitio web: " + appTitle);

        System.out.println("URL actual: " + driver.getCurrentUrl());

        //Horario (1)
        /*driver.get("https:\\www.bancopopular.fi.cr/contacto/");
        String contacto = driver.findElement(By.xpath("//*[@id=\"contactenos\"]")).getText();
        System.out.println("contacto " + contacto);
        
        //Tipo de cambio (2)
        String compraDolar = driver.findElement(By.xpath("//*[@id=\"tipoCambioCompra\"]")).getText();
        String ventaDolar = driver.findElement(By.xpath("//*[@id=\"tipoCambioVenta\"]")).getText();
        System.out.println("Tipo de Compra del Dolar: " + compraDolar);
        System.out.println("Tipo de Venta del Dolar: " + ventaDolar);

        //busca y despliega informacion de credito (3 y 4)
        driver.findElement(By.xpath("//*[@id=\"bp-header\"]/div[5]")).click();
        driver.findElement(By.xpath("//*[@id=\"modal-seach__input\"]")).sendKeys("Creditos");
        Thread.sleep(1000);
        
        driver.findElement(By.xpath("//*[@id=\"bp-search-modal\"]/div/div/form/button/img")).click();

        //Banca movil (5)
        driver.findElement(By.xpath("//*[@id=\"bp-online__logo\"]")).click();
        driver.findElement(By.xpath("//*[@id=\"menu-item-12043\"]/a")).click();
        driver.findElement(By.xpath("//*[@id=\"C2__USER_NAME\"]")).sendKeys("xquesada992d");
        driver.findElement(By.xpath("//*[@id=\"C2__QUE_21AA8B8279AB849B5250\"]")).sendKeys("Lapicero135");
        
        Thread.sleep(1000);
        
        driver.findElement(By.xpath("//*[@id=\"C2__BUT_21AA8B8279AB849B2246\"]")).click();
        
        //servicios destacados (6)
        driver.get("https:\\www.bancopopular.fi.cr/contacto/");
        
        //servicios destacados (7)
        driver.get("https:\\www.bancopopular.fi.cr/personas/");
        
        //buscar informacion de covid (8) Tiempos de covid
        driver.findElement(By.xpath("//*[@id=\"bp-header\"]/div[5]")).click();
        driver.findElement(By.xpath("//*[@id=\"modal-seach__input\"]")).sendKeys("covid");
        driver.findElement(By.xpath("//*[@id=\"bp-search-modal\"]/div/div/form/button/img")).click();
        driver.findElement(By.xpath("//*[@id=\"content\"]/div/div/div[2]/main/div/div[2]/h3/a")).click();
      
        // Validar Informacion de sostenibilidad e impacto ambiental(9)
    driver.navigate().to("https:\\www.bancopopular.fi.cr/sostenibilidad-y-comunicacion/");
    driver.navigate().to("https:\\www.bancopopular.fi.cr/impacto-ambiental/");  
    String impactoAmbiental= driver.findElement(By.xpath("//*[@id=\"wrapper\"]")).getText();
    System.out.println("Informacion de impacto ambiental: "+impactoAmbiental);
    driver.navigate().back();
    driver.navigate().back();
         */
        
        
        //formulario 10
        driver.findElement(By.xpath("//*[@id=\"bp-header\"]/div[2]/div[1]/a/img")).click();
        driver.findElement(By.xpath("//*[@id=\"form-field-name\"]")).sendKeys("Elena Ruiz Quesada");
        driver.findElement(By.xpath("//*[@id=\"form-field-email\"]")).sendKeys("elena87517@hotmail.com");
        driver.findElement(By.xpath("//*[@id=\"form-field-tel\"]")).sendKeys("87542165");
        driver.findElement(By.xpath("//*[@id=\"form-field-id_num\"]")).sendKeys("405460254");
        driver.findElement(By.xpath("//*[@id=\"form-field-message\"]")).sendKeys("Consulta de prueba");
        
        Thread.sleep(1000);//Dar click en Acepto terminos y condiciones.
        
        driver.findElement(By.xpath("//*[@id=\"nuestros-productos\"]/div/div/div[2]/div/div/div[3]/div/form/div/div[7]/button")).click();
        //WebElement checkBx = driver.findElement(By.xpath("//*[@id=\"form-field-accept\"]"));
        //checkBx.click();
    }

}
