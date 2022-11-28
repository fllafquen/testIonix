package com.ionix.interactions;

import com.ionix.appqa.base.BasePageObjectModel;
import com.ionix.ui.RegisterPage;
import io.appium.java_client.MobileBy;

public class RegisterGetText extends BasePageObjectModel {

    public String username() {
        return getText(MobileBy.xpath(RegisterPage.USERNAME));
    }

    public String registerPage() {
        return getText(MobileBy.xpath(RegisterPage.MODULO_REGISTER));
    }

    public String password() {
        return getText(MobileBy.xpath(RegisterPage.PASSWORD));
    }

    public String alertPassword() {
        return getText(MobileBy.xpath(RegisterPage.ALERT_PASSWORD));
    }

    public String alertRepeatPassword() {
        return getText(MobileBy.xpath(RegisterPage.ALERT_REPEAT_PASSWORD));
    }

    public String alertEmail() {
        return getText(MobileBy.xpath(RegisterPage.ALERT_EMAIL));
    }

    public String repeatPassword() {
        return getText(MobileBy.xpath(RegisterPage.REPEAT_PASSWORD));
    }

    public String email() {
        return getText(MobileBy.xpath(RegisterPage.EMAIL));
    }

    public String usernameMessage() {
        return getText(MobileBy.xpath(RegisterPage.ALERT_USERNAME));
    }

    public String messageNoEmail() {
        return getText(MobileBy.xpath(RegisterPage.ALERT_CREATE_ACCOUNT_EMAIL_EMPTY));
    }

}
