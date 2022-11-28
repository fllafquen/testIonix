package com.ionix.steps;

import com.ionix.BaseTest;
import io.cucumber.java.es.Cuando;
import io.cucumber.java.es.Entonces;
import org.junit.jupiter.api.Assertions;

public class WelcomeStepDef extends BaseTest {

    @Entonces("se despliega el mensaje de bienvenida (.*)$")
    public void findWelcomeMessage(String message) {
        String titleText = welcomeGetText.welcomeMessage();
        Assertions.assertEquals(message, titleText);
    }

    @Cuando("(.*)presiona el botòn volver a registro$")
    public void tapBackBtn(String actor) {
        welcome.tapReturn();
    }
}
