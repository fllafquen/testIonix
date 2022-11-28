package com.ionix.tasks;

import com.ionix.appqa.base.BasePageObjectModel;
import io.appium.java_client.MobileBy;
import net.thucydides.core.annotations.Step;

import static com.ionix.ui.RegisterPage.*;

public class Register extends BasePageObjectModel {

    @Step("{0} set username {string}")
    public void setUsername(String txtUsername) {
        inputText(MobileBy.xpath(USERNAME), txtUsername);
    }

    @Step("{0} presiona el botón SUBMIT")
    public void tapBtnSubmit() {
        tap(MobileBy.xpath(BTN_SUBMIT));
    }

    @Step("{0} ingresa Password {string}")
    public void setPassword(String pass) {
        inputText(MobileBy.xpath(PASSWORD), pass);
    }

    @Step("{0} ingresa Repeat Password {string}")
    public void setRepeatPassword(String repeatPass) {
        inputText(MobileBy.xpath(REPEAT_PASSWORD), repeatPass);
    }

    @Step("{0} ingresa Email {string}")
    public void setEmail(String mail) {
        inputText(MobileBy.xpath(EMAIL), mail);
    }
}
