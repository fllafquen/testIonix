package com.ionix.appqa.base;

import com.ionix.appqa.drivers.AndroidDriverInit;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import org.openqa.selenium.By;

public class BasePageObjectModel {
    String actor;

    public AndroidDriver<AndroidElement> getDriver() {
        return AndroidDriverInit.driver;
    }

    public AndroidElement find(By by) {
        return getDriver().findElement(by);
    }

    public void inputText(By by, String text) {
        AndroidElement element = find(by);
        element.clear();
        element.sendKeys(text);
    }

    public void tap(By by) {
        find(by).click();
    }

    public String getText(By by) {
        return find(by).getText();
    }

    public boolean displayed(By by) {
        return find(by).isDisplayed();
    }
}
