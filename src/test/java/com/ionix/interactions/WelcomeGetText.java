package com.ionix.interactions;

import com.ionix.appqa.base.BasePageObjectModel;
import com.ionix.ui.WelcomePage;
import io.appium.java_client.MobileBy;

public class WelcomeGetText extends BasePageObjectModel {

    public String welcomeMessage() {
        return getText(MobileBy.xpath(WelcomePage.WELCOME_MESSAGE));
    }
}
