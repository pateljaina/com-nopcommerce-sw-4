package com.nopcommerce.demo.testsuite;

import com.nopcommerce.demo.pages.*;
import com.nopcommerce.demo.testbase.BaseTest;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Electronics extends BaseTest {
    HomePage homepage = new HomePage();
    BuildYourOwnComputerPage buildYourOwnComputerPage = new BuildYourOwnComputerPage();
    DesktopPage desktopPage = new DesktopPage();
    ShoppingCartPage shoppingCartPage = new ShoppingCartPage();
    CheckOutPage checkOutPage = new CheckOutPage();
    CellPhonesPage cellPhonesPage = new CellPhonesPage();
    NokiaLumiaPage nokiaLumiaPage = new NokiaLumiaPage();
    NokiaShoppingCart nokiaShoppingCart = new NokiaShoppingCart();

    @Test
    public void verifyUserShouldNavigateToCellPhonesPageSuccessfully() {
        homepage.hoverElectronics();
        homepage.clickCellPhones();
        String expectedMessage1 = "Cell phones";
        String actualMessage1 = cellPhonesPage.getVerifyCellPhones();
        Assert.assertEquals(actualMessage1, expectedMessage1, "Not directed to Cell Phone page");
    }

    @Test
    public void verifyThatTheProductAddedSuccessfullyAndPlaceOrderSuccessfully() throws InterruptedException {
        homepage.hoverElectronics();
        homepage.clickCellPhones();
        Thread.sleep(2000);
        String expectedMessage = "Cell phones";
        String actualMessage = cellPhonesPage.getVerifyCellPhones();
        cellPhonesPage.clickListView();
        Thread.sleep(2000);
        cellPhonesPage.clickOnNokiaLumia();
        String expectedMessage2 = "Nokia Lumia 1020";
        String actualMessage2 = nokiaLumiaPage.getVerifyNokiaLumia();
        Assert.assertEquals(actualMessage2, expectedMessage2, "Not direct to Nokia Lumia 1020");
        String expectedMessage3 = "$349.00";
        String actualMessage3 = nokiaLumiaPage.getVerifyPrice();
        Assert.assertEquals(actualMessage3, expectedMessage3, "Price does not match");
        nokiaLumiaPage.sendChangeQuantity2();
        nokiaLumiaPage.clickAddToCart();
        String expectedMessage4 = "The product has been added to your shopping cart";
        String actualMessage4 = nokiaLumiaPage.getVerifyProductAdded();
        Assert.assertEquals(actualMessage4, expectedMessage4, "Product not added to cart");
        nokiaLumiaPage.clickCloseAlert();
        nokiaLumiaPage.mouseHoverShoppingCart();
        Thread.sleep(2000);
        nokiaLumiaPage.clickGoToCart();
        String expectedMessage5 = "Shopping cart";
        String actualMessage5 = nokiaShoppingCart.getVerifyTextShoppingCart();
        Assert.assertEquals(actualMessage5, expectedMessage5, "Not directed to shopping cart");
        String expectedMessage6 = "2";
        WebElement x = driver.findElement(By.xpath("//input[@class=\"qty-input\"]"));
        String qty = x.getAttribute("value");
        Assert.assertEquals(qty, expectedMessage6, "Quantity does not match");
        String expectedMessage7 = "$698.00";
        String actualMessage7 = nokiaShoppingCart.getVerifyNokiaSubTotal();
        Assert.assertEquals(actualMessage7, expectedMessage7, "Price incorrect");
        nokiaShoppingCart.clickOnUpdateCart();
        nokiaShoppingCart.clickTermsOfServiceNokia();
        nokiaShoppingCart.clickCheckOutNokia();
        String expectedMessage8 = "Welcome, Please Sign In!";
        String actualMessage8 = shoppingCartPage.getWelcomeMessage();
        Assert.assertEquals(actualMessage8, expectedMessage8, "Not directed to requested page");
        nokiaShoppingCart.clickOnRegisterTab();
        checkOutPage.enterFirstName("Jaina");
        checkOutPage.enterLastName("Patel");
        checkOutPage.enterEmail("patelc11@gmail.com");
        checkOutPage.enterPassword("Prime12345");
        checkOutPage.enterConfirmPassword("Prime12345");
        checkOutPage.clickOnRegisterButton();
        String expectedMessage9 = "Your registration completed";
        String actualMessage9 = checkOutPage.getVerifyRegisteredMessage();
        Assert.assertEquals(actualMessage9, expectedMessage9, "Error in registration");
        shoppingCartPage.clickOnLoginLink();
        shoppingCartPage.enterEmailId("patelc11@gmail.com");
        shoppingCartPage.enterPassword("Prime12345");
        shoppingCartPage.clickOnLoginLinkOnceEntered();
        String expectedMessage10 = "Shopping cart";
        String actualMessage10 = nokiaShoppingCart.getVerifyTextShoppingCart();
        Assert.assertEquals(actualMessage10, expectedMessage10, "");
        nokiaShoppingCart.clickTermsOfServiceNokia();
        nokiaShoppingCart.clickOnCheckOut();
        checkOutPage.enterCountry("United Kingdom");
        checkOutPage.enterCity("London");
        checkOutPage.enterAddress1("11 Littleheath Avenue");
        checkOutPage.enterZipPostalCode("CR20HH");
        checkOutPage.enterPhoneNumber("07987879675");
        checkOutPage.clickOnContinue();
        checkOutPage.clickDayAir2nd();
        Thread.sleep(2000);
        checkOutPage.clickOnContinueAir();
        checkOutPage.clickOnCreditCard();
        Thread.sleep(3000);
        checkOutPage.clickOnContinueCard();
        checkOutPage.selectVisa();
        checkOutPage.enterCardHolderNameNokia("Mrs Jaina Patel");
        checkOutPage.enterCardNumberNokia("4111 1111 1111 1111");
        checkOutPage.enterExpiryMonth("23");
        checkOutPage.enterExpiryYearNokia("2024");
        checkOutPage.enterCardSecurityCodeNokia("999");
        Thread.sleep(2000);
        checkOutPage.clickOnContinuePostCardDetails();
        String expectedMessage11 = "Credit Card";
        String actualMessage11 = checkOutPage.getVerifyCreditCardMethodNokia();
        Assert.assertEquals(actualMessage11, expectedMessage11, "Incorrect payment method");
        String expectedMessage12 = "2nd Day Air";
        String actualMessage12 = checkOutPage.getVerifySuccessMessageNokia();
        Assert.assertEquals(actualMessage12, expectedMessage12, "Incorrect shipping");
        String expectedMessage13 = "$698.00";
        String actualMessage13 = checkOutPage.getVerifyTotalNokia();
        Assert.assertEquals(actualMessage13, expectedMessage13, "Total price incorrect");
        checkOutPage.clickOnConfirmNokia();
        Thread.sleep(2000);
        String expectedMessage14 = "Thank You";
        String actualMessage14 = checkOutPage.getVerifyThankYouNokia();
        Assert.assertEquals(actualMessage14, expectedMessage14, "Not direct to correct page");
        String expectedMessage15 = "Your order has been successfully processed!";
        String actualMessage15 = checkOutPage.getVerifySuccessMessageNokia();
        Assert.assertEquals(actualMessage15, expectedMessage15, "Problem with your order");
        checkOutPage.clickOnContinueHomepage();
        String expectedMessage16 = "Welcome to our store";
        String actualMessage16 = homepage.getVerifyWelcomeToStore();
        Assert.assertEquals(actualMessage16, expectedMessage16, "Not directed to homepage");
        homepage.clickOnLogOut();
        String expectedMessage17 = "https://demo.nopcommerce.com/";
        String actualMessage17 = homepage.getUrl();
        Assert.assertEquals(actualMessage17, expectedMessage17, "Not on the expected Url");


    }
}
