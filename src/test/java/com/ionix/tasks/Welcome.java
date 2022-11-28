package com.ionix.tasks;

import com.ionix.appqa.base.BasePageObjectModel;
import io.appium.java_client.MobileBy;
import net.thucydides.core.annotations.Step;

import static com.ionix.ui.WelcomePage.BACK_TO_REGISTER;

public class Welcome extends BasePageObjectModel {

    @Step("{0} presiona el botón Volver")
    public void tapReturn() {
        tap(MobileBy.xpath(BACK_TO_REGISTER));
    }
}
