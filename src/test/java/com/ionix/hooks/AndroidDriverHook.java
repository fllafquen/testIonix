package com.ionix.hooks;

import com.ionix.appqa.drivers.AndroidDriverInit;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;

public class AndroidDriverHook {

    @Before()
    public void beforeScenario(){
        AndroidDriverInit.initialize();
    }

    //TODO create screenshot after each step

    @After()
    public void afterScenario(Scenario scenario){
        AndroidDriverInit.quit();
    }

}
