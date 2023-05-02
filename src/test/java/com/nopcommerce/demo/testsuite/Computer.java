package com.nopcommerce.demo.testsuite;

import com.nopcommerce.demo.pages.*;
import com.nopcommerce.demo.testbase.BaseTest;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Computer extends BaseTest {
    HomePage homepage = new HomePage();
    BuildYourOwnComputerPage buildYourOwnComputerPage = new BuildYourOwnComputerPage();
    DesktopPage desktopPage = new DesktopPage();
    ShoppingCartPage shoppingCartPage = new ShoppingCartPage();
    CheckOutPage checkOutPage = new CheckOutPage();

    @Test
    public void verifyProductArrangeInAlphabeticalOrder() throws InterruptedException {
        //1.1 Click on Computer Menu
        homepage.clickOnComputer();
        //1.2 Click on Desktop Submenu
        homepage.clickOnDesktopSubmenu();
        //1.3 Select Sort By Position "Name: Z to A"
        desktopPage.selectSortByZtoA();
        //1.4 Verify products will arrange in descending order

    }

    @Test
    public void verifyProductAddedToShoppingCartSuccessFully() throws InterruptedException {
        //2.1 Click on computer menu
        homepage.clickOnComputer();
        //2.2 Click on desktop submenu menu
        homepage.clickOnDesktopSubmenu();
        //2.3 Select sort by position A to Z
        desktopPage.selectSortByAtoZ();
        //allowing time to finish process
        Thread.sleep(2000);
        //2.4 Click on add to cart
        desktopPage.clickBuildYourOwnComputer();
        //2.5 Verify text Build your own computer
        String expectedText = "Build your own computer";
        String actualText = buildYourOwnComputerPage.pageTitle();
        Assert.assertEquals(actualText, expectedText, "Build your own computer page not displayed");
        //2.6-2.10//select Processor, Ram, Hard Drive + Operating System + Total commander
        buildYourOwnComputerPage.selectProcessor2_2();
        buildYourOwnComputerPage.selectRAM8GB();
        buildYourOwnComputerPage.selectHDD400GB();
        buildYourOwnComputerPage.selectOSVistaPremium$60();
        Thread.sleep(2000);
        buildYourOwnComputerPage.selectTotalCommander();
        Thread.sleep(2000);
        //2.11 Verify Price
        String expectedText1 = "$1,475.00";
        String actualText1 = buildYourOwnComputerPage.getVerifyPrice();
        Assert.assertEquals(actualText1, expectedText1, "Correct Price Displayed");
        //2.12 Add to cart button
        Thread.sleep(2000);
        buildYourOwnComputerPage.clickOnAddToCart();
        String expectedText2 = "The product has been added to your shopping cart";
        String actualText2 = buildYourOwnComputerPage.getVerifyConfirmationText();
        Assert.assertEquals(actualText2, expectedText2, "Product has not been added to cart");
        //2.13 Verify the message The Product has been added to shopping cart + close bar
        buildYourOwnComputerPage.clickCloseAlert();
        //2.14 Mouse hover on shopping cart and click Go To Cart
        buildYourOwnComputerPage.hoverOnShoppingCart();
        buildYourOwnComputerPage.clickOnGoToCart();
        //2.15 Verify Message shopping cart
        String expectedText3 = "Shopping cart";
        String actualText3 = shoppingCartPage.getVerifyTextShoppingCart();
        Assert.assertEquals(actualText3, expectedText3, "Not directed to shopping cart page");
        WebElement element = driver.findElement(By.xpath("//input[@class='qty-input']"));
        element.click();
        element.sendKeys(Keys.CONTROL + "a"); // Select all existing text
        element.sendKeys("2"); //2.16 Type in the new text
        //2.17 Verify total $2950.00
        String expectedText4 = "$2,950.00";
        String actualText4 = shoppingCartPage.getVerifyShoppingCart();
        //2.18 Click on check box "I agree with terms of service"
        shoppingCartPage.clickTermsOfService();
        //2.19 Click on check out
        shoppingCartPage.clickOnCheckOut();
        //2.20 Verify the text welcome sign in
        String expectedMessage5 = "Welcome, Please Sign In!";
        String actualMessage5 = shoppingCartPage.getWelcomeMessage();
        Assert.assertEquals(actualMessage5, expectedMessage5, "Not directed to requested page");
        //2.21 Fill in all mandatory fields
        shoppingCartPage.clickOnCheckOutAsGuest();
        checkOutPage.enterFirstName("Jaina");
        checkOutPage.enterLastName("Patel");
        checkOutPage.enterEmail("patelc2@gmail.com");
        checkOutPage.enterCountry("United Kingdom");
        checkOutPage.enterCity("London");
        checkOutPage.enterAddress1("11 Littleheath Avenue");
        checkOutPage.enterZipPostalCode("CR20HH");
        checkOutPage.enterPhoneNumber("07987879675");
        checkOutPage.clickOnContinue();
        checkOutPage.clickNextDayAir();
        checkOutPage.clickOnContinueAir();
        checkOutPage.clickOnCreditCard();
        checkOutPage.clickOnContinueCard();
        checkOutPage.selectMasterCard();
        checkOutPage.enterCardHolderName("Jaina Patel");
        checkOutPage.enterCardNumber("0759 2136 2156 5987");
        checkOutPage.enterExpiryMonth("23");
        checkOutPage.enterExpiryYear("2024");
        checkOutPage.enterCardCode("999");
        checkOutPage.clickOnContinueCheckout();
        String expectedMessage6 = "Credit Card";
        String actualMessage6 = checkOutPage.getVerifyCreditCardMethod();
        Assert.assertEquals(actualMessage6, expectedMessage6, "Payment method incorrect");
        String expectedMessage7 = "Next Day Air";
        String actualMessage7 = checkOutPage.getVerifyShippingMethod();
        Assert.assertEquals(actualMessage7, expectedMessage7, "Incorrect shipping method");
        String expectedMessage8 = "$2,950.00";
        String actualMessage8 = checkOutPage.getVerifyTotal();
        Assert.assertEquals(actualMessage8, expectedMessage8, "Total,Incorrect");
        checkOutPage.clickOnConfirm();
        String expectedMessage9 = "Thank you";
        String actualMessage9 = checkOutPage.getVerifyThankYou();
        Assert.assertEquals(actualMessage9, expectedMessage9, "Not directed to correct page");
        checkOutPage.clickOnContinueHomepage();
        String expectedMessage10 = "Welcome to our store";
        String actualMessage10 = homepage.getVerifyWelcomeToStore();
        Assert.assertEquals(actualMessage10, expectedMessage10, "Not redirected to homepage");

    }
}


