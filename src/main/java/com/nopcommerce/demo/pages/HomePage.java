package com.nopcommerce.demo.pages;

import com.aventstack.extentreports.Status;
import com.nopcommerce.demo.customlisteners.CustomListeners;
import com.nopcommerce.demo.utilities.Utility;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.testng.Reporter;

public class HomePage extends Utility {

    @CacheLookup
    @FindBy(className = "page-title")
    WebElement verifyPageTitle;

    @CacheLookup
    @FindBy(xpath = "//h2[contains(text(),'Welcome to our store')]")
    WebElement verifyWelcomeText;

    @CacheLookup
    @FindBy(xpath = "//a[contains(text(),'Electronics ')]")
    WebElement electronics;

    @CacheLookup
    @FindBy(xpath = "//body/div[6]/div[2]/ul[1]/li[2]/ul[1]/li[2]/a[1]")
    WebElement cellPhone;

    @CacheLookup
    @FindBy(xpath = "//a[contains(text(),'')]")
    WebElement logOut;









    //1.1 create method with name "selectMenu" it has one parameter name "menu" of type
    public void selectMenu(String menu){
        By topMenuBar = By.xpath("//ul[@class='top-menu notmobile']/li/a[text() = '" + menu + " ']");
        clickOnElement(topMenuBar);
        CustomListeners.test.log(Status.PASS, "Select Menu");
        Reporter.log("Select Menu" + topMenuBar.toString());
    }
    public String verifyPageNavigation(){

        CustomListeners.test.log(Status.PASS, "Able to verify Page navigation");
        Reporter.log("Verify Page navigation" + verifyPageTitle.toString());
        return getTextFromElement(verifyPageTitle);
    }
    public void mouseHoverOnElectronics() throws InterruptedException {
        Thread.sleep(2000);
        mouseHoverToElement(electronics);
        CustomListeners.test.log(Status.PASS, "Mouse Hover On Electronics");
        Reporter.log("Mouse Hovering on Electronics" + electronics.toString());
    }
    public void mouseHoverAndClickOnCellPhones(){

        mouseHoverToElementAndClick(cellPhone);
        CustomListeners.test.log(Status.PASS, "Mouse Hover and click on Cell Phones");
        Reporter.log("Mouse Hovering and click on Cell Phones" + cellPhone.toString());
    }

    public String verifyWelcomeStoreText(){
        CustomListeners.test.log(Status.PASS, "Verify Welcome Store text");
        Reporter.log("Verifying Welcome Store text" + verifyWelcomeText.toString());
        return getTextFromElement(verifyWelcomeText);

    }
    public void clickOnLogoutLink() {

        clickOnElement(logOut);
        CustomListeners.test.log(Status.PASS, "Click on Logout link");
        Reporter.log("Click on Logout link" + logOut.toString());
    }

}
