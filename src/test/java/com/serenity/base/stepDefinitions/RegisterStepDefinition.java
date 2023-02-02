package com.serenity.base.stepDefinitions;

import com.serenity.base.steps.ChallengeQA.RegistroStep;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;

public class RegisterStepDefinition {
@Steps
    RegistroStep registroStep;

    @Given("el usuario se encuentre en la pagina de Registro")
    public void elUsuarioSeEncuentreEnLaPaginaDeRegistro() { registroStep.openBrowserRegistro();
    }
    @And("hago click en el boton Register")
    public void hagoClickEnElBotonRegister() { registroStep.clicRegister();
    }

    @Then("mostrara el mensaje {string} al costado del boton Register")
    public void mostraraElMensajeAlCostadoDelBotonRegister(String mensaje) { registroStep.validarMensajes(mensaje);
    }

    @When("ingresa sus datos en la casillas con su correo {string}")
    public void ingresaSusDatosEnLaCasillasConSuCorreo(String correo) { registroStep.escribirCorreo(correo);
    }

    @And("ingresa sus datos en la casillas con su contraseña {string}")
    public void ingresaSusDatosEnLaCasillasConSuContraseña(String pass) { registroStep.escribirPassword(pass);
    }

    @When("escribo {string} en el campo password")
    public void escriboEnElCampoPassword(String pass) { registroStep.escribirPassword(pass);
    }

    @When("escribo {string} en el campo email")
    public void escriboEnElCampoEmail(String email) { registroStep.escribirCorreo(email);
    }


}
