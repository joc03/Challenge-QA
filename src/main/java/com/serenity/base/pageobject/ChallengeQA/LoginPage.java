package com.serenity.base.pageobject.ChallengeQA;

import net.serenitybdd.core.pages.PageObject;
import net.thucydides.core.annotations.DefaultUrl;
import net.thucydides.core.annotations.NamedUrl;
import net.thucydides.core.annotations.NamedUrls;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

@DefaultUrl("http://localhost:4000/login")


public class LoginPage extends PageObject{

    @FindBy(id = "email")
    public WebElement tbxEmail;

    @FindBy(id = "password")
    public WebElement tbxPassword;

    @FindBy(id = "login")
    public WebElement btnLogin;

    @FindBy(id = "msg")
    public WebElement txtMsg;

    }
