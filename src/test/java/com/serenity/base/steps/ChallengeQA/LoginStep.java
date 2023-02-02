package com.serenity.base.steps.ChallengeQA;

import com.serenity.base.pageobject.ChallengeQA.LoginPage;
import com.serenity.base.utils.Utils;
import net.thucydides.core.annotations.Step;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class LoginStep {

    private static final Logger logger = LoggerFactory.getLogger(LoginStep.class);
    public LoginPage loginPage;
    private Utils utils =new Utils();

    @Step
    public void openBrowserLogin() {
        loginPage.open();
        logger.info("Inicializando la pagina");
    }

    public void validarCasillasVacias() {
      utils.validarMensajeWebElement("",loginPage.tbxEmail);
      utils.validarMensajeWebElement("",loginPage.tbxPassword);
    }

    public void validarMensajes(String mensaje) {
        utils.validarMensajeWebElement(mensaje,loginPage.txtMsg);


    }

    public void escribirCorreo(String correo) {
       loginPage.tbxEmail.sendKeys(correo);

    }

    public void escribirPassword(String pass) {
        loginPage.tbxPassword.sendKeys(pass);
    }

    public void clicLogin() {
        loginPage.btnLogin.click();;
    }
}
