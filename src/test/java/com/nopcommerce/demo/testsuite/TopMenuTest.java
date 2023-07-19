package com.nopcommerce.demo.testsuite;

import com.nopcommerce.demo.customlisteners.CustomListeners;
import com.nopcommerce.demo.pages.HomePage;
import com.nopcommerce.demo.testbase.BaseTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

@Listeners(CustomListeners.class)
public class TopMenuTest extends BaseTest {


    HomePage homePage;


    @BeforeMethod
    public void inIt() {
        homePage = new HomePage();

    }


        @Test(groups = {"sanity","regression"})
       public void verifyPageNavigation(){
            homePage.selectMenu("Books");

            SoftAssert softAssert = new SoftAssert();
            String expectedText = "Books";
            softAssert.assertTrue(expectedText=="Books", "Unable to verify Page Title");
            softAssert.assertAll();

        }




















}
