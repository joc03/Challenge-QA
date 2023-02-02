package com.serenity.base.steps.ChallengeQA;

import com.serenity.base.pageobject.ChallengeQA.RegistroPage;
import com.serenity.base.utils.Utils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;


public class RegistroStep {

    private static final Logger logger = LoggerFactory.getLogger(RegistroStep.class);

    public RegistroPage RegistroPage;
    private Utils utils = new Utils();



    public void openBrowserRegistro(){
        RegistroPage.open();
    }

    public void clicRegister() {
        RegistroPage.btnRegister.click();;
    }

    public void validarMensajes(String mensaje) {
        utils.validarMensajeWebElement(mensaje, RegistroPage.txtMsg);

    }

    public void escribirCorreo(String correo) {
        RegistroPage.tbxEmail.sendKeys(correo);

    }

    public void escribirPassword(String pass) {
        RegistroPage.tbxPassword.sendKeys(pass);
    }


}
