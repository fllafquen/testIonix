package com.ionix.steps;

import com.ionix.BaseTest;
import io.cucumber.java.es.*;
import org.junit.jupiter.api.Assertions;

public class RegisterStepDef extends BaseTest {


    @Dado("que (.*) entra al modulo (.*)$")
    public void isAlreadyOnRegisterPage(String actor, String modulo) {
        String titleText = registerGetText.registerPage();
        Assertions.assertEquals(modulo, titleText);
    }

    @Entonces("(.*) encuentra el campo Username con texto (.*)$")
    public void findSetUsername(String actor, String name) {
        String titleText = registerGetText.username();
        Assertions.assertEquals(name, titleText);
    }

    @Entonces("(.*) encuentra el campo Password con texto (.*)$")
    public void findSetPassword(String actor, String name) {
        String titleText = registerGetText.password();
        Assertions.assertEquals(name, titleText);
    }

    @Entonces("(.*) encuentra el campo Repeat password con texto (.*)$")
    public void findSetRepeatPassword(String actor, String name) {
        String titleText = registerGetText.repeatPassword();
        Assertions.assertEquals(name, titleText);
    }

    @Entonces("(.*) encuentra el campo Email con texto (.*)$")
    public void findSetEmail(String actor, String name) {
        String titleText = registerGetText.email();
        Assertions.assertEquals(name, titleText);
    }

    @Cuando("(.*) ingresa (.*) en campo Username$")
    public void setUsername(String actor, String text) {
        register.setUsername(text);
    }

    @Y("(.*) presiona el botón SUBMIT$")
    public void tapBtnSubmit(String actor) {
        register.tapBtnSubmit();
    }

    @Entonces("se despliega mensaje informando (.*)$")
    public void seeAlertNoEmail( String text) {
        String message = registerGetText.messageNoEmail();
        Assertions.assertEquals(text, message);
    }


    @Y("(.*) ingresa la password (.*)$")
    public void setPassword(String actor, String pass) {
        register.setPassword(pass);
    }
    @Y("(.*) ingresa repeat password (.*)$")
    public void setRepeatPassword(String actor, String repeatPass) {
        register.setRepeatPassword(repeatPass);
    }

    @Y("(.*) ingresa el email (.*)$")
    public void SetMail(String actor, String mail) {
        register.setEmail(mail);
    }


    @Entonces("aparece el mensaje de Username (.*)$")
    public void findAlertUsernameMessage( String text) {
        String message = registerGetText.usernameMessage();
        Assertions.assertEquals(text, message);
    }

    @Pero("aparece el mensaje de Password (.*)$")
    public void findAlertPassword(String text) {
        String message = registerGetText.alertPassword();
        Assertions.assertEquals(text, message);
    }

    @Pero("aparece el mensaje de Repeat Password (.*)$")
    public void findAlertRepeatPassword(String text) {
        String message = registerGetText.alertRepeatPassword();
        Assertions.assertEquals(text, message);
    }

    @Pero("aparece el mensaje de Email (.*)$")
    public void findAlertEmail(String text) {
        String message = registerGetText.alertEmail();
        Assertions.assertEquals(text, message);
    }


}
