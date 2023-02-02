package com.serenity.base.utils;

import com.serenity.base.pageobject.ChallengeQA.LoginPage;
import com.serenity.base.pageobject.ChallengeQA.RegistroPage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.ArrayList;
import java.util.concurrent.TimeUnit;

import static org.junit.Assert.assertEquals;

public class Utils {

    public LoginPage loginPage;
    public RegistroPage RegistroPage;

    public WebDriver webDriver;




    public void pause(Integer seconds) {
        try {
            TimeUnit.SECONDS.sleep(seconds);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public void cambiarPesataña(){

        ArrayList<String> tabs2 = new ArrayList<String> (webDriver.getWindowHandles());
        webDriver.switchTo().window(tabs2.get(1));
        webDriver.close();
        webDriver.switchTo().window(tabs2.get(0));


    }


    public void validarMensajeWebElement(String mensaje, WebElement webElement){
        assertEquals(mensaje, webElement.getText());
    }


    public void clicBoton(String boton) {
        switch (boton.toLowerCase()) {
            case "login":
                loginPage.btnLogin.click();
                break;
            case "register":
                RegistroPage.btnRegister.click();
                break;
        }

    }
}
