package com.nopcommerce.demo.pages;

import com.aventstack.extentreports.Status;
import com.nopcommerce.demo.customlisteners.CustomListeners;
import com.nopcommerce.demo.utilities.Utility;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.testng.Reporter;

public class LoginPage extends Utility {

    @CacheLookup
    @FindBy(id = "Email")
    WebElement emailField;
    @CacheLookup
    @FindBy(name = "Password")
    WebElement passwordField;
    @CacheLookup
    @FindBy(xpath = "//button[contains(text(),'Log in')]")
    WebElement loginButton;

    @CacheLookup
    @FindBy(xpath = "//div[@class]")
    WebElement errorMessage;



    public void enterEmailId(String email){

        sendTextToElement(emailField,email);
        CustomListeners.test.log(Status.PASS, "Enter EmailId" + email);
        Reporter.log("Enter email" + email + "to email field" + emailField.toString());
    }
    public void enterPassword(String password){

        sendTextToElement(passwordField,password);
        CustomListeners.test.log(Status.PASS, "Enter Password" + password);
        Reporter.log("Enter password" + password + "to password field" + passwordField.toString());
    }
    public void clickOnLoginButton(){

        clickOnElement(loginButton);
        CustomListeners.test.log(Status.PASS, "Click on Login Button");
        Reporter.log("Click on Login Button" + loginButton.toString());

    }

}
