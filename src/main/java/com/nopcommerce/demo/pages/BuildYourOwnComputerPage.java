package com.nopcommerce.demo.pages;

import com.aventstack.extentreports.Status;
import com.nopcommerce.demo.customlisteners.CustomListeners;
import com.nopcommerce.demo.utilities.Utility;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.testng.Reporter;

public class BuildYourOwnComputerPage extends Utility {

    @CacheLookup
    @FindBy(id = "product_attribute_1")
    WebElement processor;


    @CacheLookup
    @FindBy(id = "product_attribute_2")
    WebElement ram;

    @CacheLookup
    @FindBy(id = "product_attribute_3_7")
    WebElement hddRadio;

    @CacheLookup
    @FindBy(id = "product_attribute_4_9")
    WebElement osRadio;

    @CacheLookup
    @FindBy(id = "product_attribute_4_9")
    WebElement software;

    @CacheLookup
    @FindBy(xpath = "//span[@id='price-value-1']")
    WebElement verifyPrice;

    @CacheLookup
    @FindBy(id = "add-to-cart-button-1")
    WebElement addToCart;

    @CacheLookup
    @FindBy(xpath = "//div[@class='bar-notification success']/p")
    WebElement verifyProductAddedMessage ;

    @CacheLookup
    @FindBy(xpath = "//span[@class = 'close']")
    WebElement crossButton;

    @CacheLookup
    @FindBy(xpath = "//span[contains(text(),'Shopping cart')]")
    WebElement shoppingCart;

    @CacheLookup
    @FindBy(xpath = "//button[contains(text(),'Go to cart')]")
    WebElement goToCart;



    public void selectProcessor(String text){

        selectByVisibleTextFromDropDown(processor, text);
        CustomListeners.test.log(Status.PASS, "Able to select Processor" + text);
        Reporter.log("Select Processor from DropDown" + processor.toString());
    }

    public void selectRam(String text){

        selectByVisibleTextFromDropDown(ram, text);
        CustomListeners.test.log(Status.PASS, "Able to select RAM" + text);
        Reporter.log("Select RAM from DropDown" + ram.toString());
    }
    public void selectHDDRadioButton(){

        clickOnElement(hddRadio);
        CustomListeners.test.log(Status.PASS, "Able to Select HDD Radio Button");
        Reporter.log("Select HDD Radio Button" + hddRadio.toString());

    }
    public void selectOSRadioButton(){

        clickOnElement(osRadio);
        CustomListeners.test.log(Status.PASS, "Able to select OS Radio Button");
        Reporter.log("Select OS Radio Button" + osRadio.toString());
    }
    public void selectSoftware() throws InterruptedException{
        Thread.sleep(5000);
        clickOnElement(software);
        CustomListeners.test.log(Status.PASS, "Select Software");
        Reporter.log("Select Software" + software.toString());
    }
    public String verifyCorrectPrice(){

        CustomListeners.test.log(Status.PASS, "Able to verify Correct Price");
        Reporter.log("Verify Correct Price" + verifyPrice.toString());
        return getTextFromElement(verifyPrice);
    }
    public void clickAddToCartButton(){

        clickOnElement(addToCart);
        CustomListeners.test.log(Status.PASS, "Able to click Add To Cart Button");
        Reporter.log("Click On Add To Cart Button" + addToCart.toString());

    }
    public String verifyProductHasBeenAddedText(){
        CustomListeners.test.log(Status.PASS, "Verified 'Product Has Been Added' text");
        Reporter.log("Verify 'Product Has Been Added' text" + verifyProductAddedMessage.toString());
        return getTextFromElement(verifyProductAddedMessage);
    }
    public void closeBar(){

        clickOnElement(crossButton);
        CustomListeners.test.log(Status.PASS, "Able to Close Bar");
        Reporter.log("Close Bar" + crossButton.toString());
    }
    public void mouseHoverToShoppingCart(){
        mouseHoverToElement(shoppingCart);
        CustomListeners.test.log(Status.PASS, "Mouse Hover 'To Shopping Cart'");
        Reporter.log("Mouse Hovering To Shopping Cart" + shoppingCart.toString());
    }
    public void clickOnGoToCart() throws InterruptedException{
        Thread.sleep(2000);
        clickOnElement(goToCart);
        CustomListeners.test.log(Status.PASS, "Click On Go To Cart");
        Reporter.log("Clicking On Go To Cart" + goToCart.toString());
    }
}
