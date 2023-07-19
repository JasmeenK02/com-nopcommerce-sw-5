package com.nopcommerce.demo.pages;

import com.aventstack.extentreports.Status;
import com.nopcommerce.demo.customlisteners.CustomListeners;
import com.nopcommerce.demo.utilities.Utility;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.testng.Reporter;

public class CellPhonePage extends Utility {


    @CacheLookup
    @FindBy(xpath = "//h1[(text() = 'Cell phones')]")
    WebElement verifyCellPhoneText;

    @CacheLookup
    @FindBy(xpath = "//a[contains(text(),'List')]")
    WebElement listViewTab;

    @CacheLookup
    @FindBy(xpath = "//h2[@class = 'product-title']//a[(text() = 'Nokia Lumia 1020')]")
    WebElement productName;


    public String verifyCellPhoneText(){
        CustomListeners.test.log(Status.PASS, "Able to verify Cell Phone text");
        Reporter.log("Verifying Cell Phone text" + verifyCellPhoneText.toString());

        return getTextFromElement(verifyCellPhoneText);
    }

    public void clickOnListViewTab(){

        clickOnElement(listViewTab);
        CustomListeners.test.log(Status.PASS, "Click on List View tab");
        Reporter.log("Clicking on List View tab" + listViewTab.toString());
    }
    public void clickOnNokiaLumia1020Link(){
        clickOnElement(productName);
        CustomListeners.test.log(Status.PASS, "Click on Nokia Lumia 1020 link");
        Reporter.log("Clicking on Nokia Lumia 1020 link" + productName.toString());
    }
}
