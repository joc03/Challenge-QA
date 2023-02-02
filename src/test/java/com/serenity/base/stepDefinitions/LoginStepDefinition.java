package com.serenity.base.stepDefinitions;

import com.serenity.base.steps.ChallengeQA.LoginStep;
import com.serenity.base.utils.Utils;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;

public class LoginStepDefinition {
    @Steps
    public LoginStep loginStep;
    public Utils utils;
    @Given("el usuario se encuentre en la pagina de Login")
    public void elUsuarioSeEncuentreEnLaPaginaDeLogin() {
        loginStep.openBrowserLogin();
    }

    @And("las casillas de email y password se encuentran vacias")
    public void lasCasillasDeEmailYPasswordSeEncuentranVacias() {
        loginStep.validarCasillasVacias();
    }


    @When("ingresa sus datos en la casillas con su email {string}")
    public void ingresaSusDatosEnLaCasillasConSuEmail(String correo) { loginStep.escribirCorreo(correo);
    }

    @And("ingresa sus datos en la casillas con su password {string}")
    public void ingresaSusDatosEnLaCasillasConSuPassword(String pass) { loginStep.escribirPassword(pass);
    }

    @Then("mostrara el mensaje {string} al costado del boton Login")
    public void mostraraElMensajeAlCostadoDelBotonLogin(String mensaje) { loginStep.validarMensajes(mensaje);
    }

    @When("escribo el password {string} en el campo password")
    public void escriboElPasswordEnElCampoPassword(String pass) { loginStep.escribirPassword(pass);

    }

    @When("escribo el correo {string} en el campo email")
    public void escriboElCorreoEnElCampoEmail(String correo) { loginStep.escribirCorreo(correo);
    }

    @And("hago click en el boton Login")
    public void hagoClickEnElBotonLogin() { loginStep.clicLogin();
    }
}






