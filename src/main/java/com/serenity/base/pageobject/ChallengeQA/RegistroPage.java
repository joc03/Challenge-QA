package com.serenity.base.pageobject.ChallengeQA;

import net.serenitybdd.core.pages.PageObject;
import net.thucydides.core.annotations.DefaultUrl;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
@DefaultUrl("http://localhost:4000/register")

public class RegistroPage extends PageObject {

    @FindBy(id = "email")
    public WebElement tbxEmail;

    @FindBy(id = "password")
    public WebElement tbxPassword;

    @FindBy(id = "register")
    public WebElement btnRegister;

    @FindBy(id = "msg")
    public WebElement txtMsg;

}
