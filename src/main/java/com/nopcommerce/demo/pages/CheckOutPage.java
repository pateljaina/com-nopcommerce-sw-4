package com.nopcommerce.demo.pages;

import com.nopcommerce.demo.utilities.Utility;
import org.openqa.selenium.By;

public class CheckOutPage extends Utility {
    By firstNameField = By.id("FirstName");
    By lastNameField = By.id("LastName");
    By emailField = By.id("Email");
    By passwordField = By.id("Password");
    By confirmPasswordField = By.id("ConfirmPassword");
    By countryField = By.xpath("//select[@id='BillingNewAddress_CountryId']");
    By cityField = By.xpath("//input[@id='BillingNewAddress_City']");
    By address1Field = By.xpath("//input[@id='BillingNewAddress_Address1']");
    By zipPostalCode = By.xpath("//input[@id='BillingNewAddress_ZipPostalCode']");
    By phoneNumber = By.xpath("//input[@id='BillingNewAddress_PhoneNumber']");
    By clickContinue = By.xpath("//button[@onclick='Billing.save()']");
    By registerButton = By.id("register-button");
    By nextDayAir = By.xpath("//input[@id='shippingoption_1']");
    By continueAir = By.xpath("//button[@class='button-1 shipping-method-next-step-button']");
    By creditCard = By.xpath("//input[@id='paymentmethod_1']");

    By continueCardPostDetails = By.xpath("//button[@class='button-1 payment-info-next-step-button']");
    By continueCard = By.xpath("//button[@class='button-1 payment-method-next-step-button']");
    By masterCard = By.xpath("//select[@id='CreditCardType']");
    By cardHolderName = By.xpath("//input[@id='CardholderName']");
    By cardNumber = By.xpath("//input[@id='CardNumber']");
    By expiryMonth = By.xpath("//select[@id='ExpireMonth']");
    By expiryYear = By.xpath("//select[@id='ExpireYear']");
    By cardCode = By.xpath("//input[@id='CardCode']");
    By continueCheckout = By.xpath("//button[@class='button-1 payment-info-next-step-button']");
    By verifyCreditCardMethod = By.xpath("//span[normalize-space()='Credit Card']");
    By verifyShippingMethod = By.xpath("//span[normalize-space()='Next Day Air']");
    By verifyTotal = By.xpath("(//strong[contains(text(),'$2,950.00')])[2]");
    By confirm = By.xpath("//button[normalize-space()='Confirm']");
    By verifyThankYou = By.xpath("//h1[normalize-space()='Thank you']");
    By verifySuccessMessage = By.xpath("//strong[normalize-space()='Your order has been successfully processed!']");
    By continueHomepage = By.xpath("//button[contains(text(),'Continue')]");
    By countryIdFieldNokia = By.xpath("//select[@id='BillingNewAddress_CountryId']");
    By cityFieldNokia = By.xpath("//input[@id='BillingNewAddress_City']");
    By addressField1Nokia = By.xpath("//input[@id='BillingNewAddress_Address1']");
    By zipCodeNokia = By.xpath("//input[@id='BillingNewAddress_ZipPostalCode']");
    By phoneNumberNokia = By.xpath("//input[@id='BillingNewAddress_PhoneNumber']");
    By continueAirNokia = By.xpath("//button[@onclick='Billing.save()']");
    By dayAir2nd = By.xpath("//input[@id='shippingoption_2']");
    By continueCardNokia = By.xpath("//button[@class='button-1 shipping-method-next-step-button']");
    By creditCardNokia = By.xpath("//input[@id='paymentmethod_1']");
    By continueCardDetailsNokia = By.xpath("//button[@class='button-1 payment-method-next-step-button']");
    By visa = By.xpath("(//select[@id='CreditCardType'])[1]");
    By cardHolderNameNokia = By.xpath("//input[@id='CardholderName']");
    By cardNumberNokia = By.xpath("//input[@id='CardNumber']");
    By expiryMonthNokia = By.xpath("//select[@id='ExpireMonth']");
    By expiryYearNokia = By.xpath("//select[@id='ExpireYear']");
    By cardCodeNokia = By.xpath("//input[@id='CardCode']");
    By continueCheckoutNokia = By.xpath("//button[@class='button-1 payment-info-next-step-button']");
    By verifyCreditCardMethodNokia = By.xpath("//span[contains(text(),'Credit Card')]");
    By verifyShippingMethodNokia = By.xpath("//span[contains(.,'2nd Day Air')]");
    By verifyTotalNokia = By.xpath("//span[@class='value-summary']//strong[contains(text(),'$698.00')]");
    By confirmNokia = By.xpath("//button[normalize-space()='Confirm']");
    By verifyThankYouNokia = By.xpath("//h1[contains(text(),'Thank you')]");
    By verifySuccessMessageNokia = By.xpath("//div[@class='section order-completed']//div[@class='title']");
    By continueHomepageNokia = By.xpath("//button[contains(text(),'Continue')]");
    By verifyRegisteredMessage = By.xpath("//div[@class='result']");

    public void enterFirstName(String firstname) {
        sendTextToElement(firstNameField, firstname);
    }

    public void enterLastName(String lastName) {
        sendTextToElement(lastNameField, lastName);
    }

    public void enterEmail(String email) {
        sendTextToElement(emailField, email);
    }

    public void enterPassword(String password){
        sendTextToElement(passwordField,password);
    }
    public void enterConfirmPassword(String confirmPassword){
        sendTextToElement(confirmPasswordField, confirmPassword);
    }


    public void enterCountry(String country) {
        sendTextToElement(countryField, country);
    }

    public void enterCity(String cityName) {
        sendTextToElement(cityField, cityName);
    }

    public void enterAddress1(String address1) {
        sendTextToElement(address1Field, address1);
    }

    public void enterZipPostalCode(String postCode) {
        sendTextToElement(zipPostalCode, postCode);
    }

    public void enterPhoneNumber(String phoneNo) {
        sendTextToElement(phoneNumber, phoneNo);
    }

    public void clickOnRegisterButton() {
        clickOnElement(registerButton);
    }

    public void clickOnContinue() {
        clickOnElement(clickContinue);
    }

    public void clickOnContinuePostCardDetails(){
        clickOnElement(continueCardPostDetails);
    }
    public void clickNextDayAir() {
        clickOnElement(nextDayAir);
    }

    public void clickOnContinueAir() {
        clickOnElement(continueAir);
    }

    public void clickOnCreditCard() {
        clickOnElement(creditCard);
    }

    public void clickOnContinueCard() {
        clickOnElement(continueCard);
    }

    public void selectMasterCard() {
        selectByVisibleTextFromDropDown(masterCard, "Master Card");
    }

    public void enterCardHolderName(String name) {
        sendTextToElement(cardHolderName, name);
    }

    public void enterCardNumber(String number) {
        sendTextToElement(cardNumber, number);
    }

    public void enterExpiryMonth(String expMonth) {
        sendTextToElement(expiryMonth, expMonth);
    }

    public void enterExpiryYear(String expYear) {
        sendTextToElement(expiryYear, expYear);
    }

    public void enterCardCode(String number) {
        sendTextToElement(cardCode, number);
    }

    public void clickOnContinueCheckout() {
        clickOnElement(continueCheckout);
    }

    public String getVerifyCreditCardMethod() {
        return getTextFromElement(verifyCreditCardMethod);
    }

    public String getVerifyShippingMethod() {
        return getTextFromElement(verifyShippingMethod);
    }

    public String getVerifyTotal() {
        return getTextFromElement(verifyTotal);
    }

    public void clickOnConfirm() {
        clickOnElement(confirm);
    }

    public String getVerifyThankYou() {
        return getTextFromElement(verifyThankYou);
    }

    public String getVerifySuccessMessage() {
        return getTextFromElement(verifySuccessMessage);
    }

    public void clickOnContinueHomepage() {
        clickOnElement(continueHomepage);
    }

    public void selectCountryIdFieldNokia() {
        selectByVisibleTextFromDropDown(countryIdFieldNokia, "United Kingdom");
    }

    public void enterCityFieldNokia(String cityName) {
        sendTextToElement(cityFieldNokia, cityName);
    }

    public void enterAddressField1Nokia(String address1) {
        sendTextToElement(addressField1Nokia, address1);
    }

    public void enterZipCodeNokia(String postcode) {
        sendTextToElement(zipCodeNokia, postcode);
    }

    public void enterPhoneNumberNokia(String phoneNo) {
        sendTextToElement(phoneNumberNokia, phoneNo);
    }

    public void clickContinueAirNokia() {
        clickOnElement(continueAirNokia);
    }

    public void clickDayAir2nd() {
        clickOnElement(dayAir2nd);
    }

    public void clickContinueCardNokia() {
        clickOnElement(continueCardNokia);
    }

    public void clickCreditCardNokia() {
        clickOnElement(creditCardNokia);
    }

    public void clickContinueCardDetailsNokia() {
        clickOnElement(continueCardDetailsNokia);
    }

    public void selectVisa() {
        selectByVisibleTextFromDropDown(visa, "Visa");
    }

    public void enterCardHolderNameNokia(String name) {
        sendTextToElement(cardHolderNameNokia, name);
    }

    public void enterCardNumberNokia(String cardNo) {
        sendTextToElement(cardNumberNokia, cardNo);
    }

    public void enterExpiryMonthNokia(String expiryMonth) {
        sendTextToElement(expiryMonthNokia, expiryMonth);
    }

    public void enterExpiryYearNokia(String expiryYear) {
        sendTextToElement(expiryYearNokia, expiryYear);
    }

    public void enterCardSecurityCodeNokia(String securityCode) {
        sendTextToElement(cardCodeNokia, securityCode);
    }

    public void clickOnContinueCheckoutNokia() {
        clickOnElement(continueCheckoutNokia);
    }

    public String getVerifyCreditCardMethodNokia() {
        return getTextFromElement(verifyCreditCardMethodNokia);
    }

    public String getVerifyShippingMethodNokia() {
        return getTextFromElement(verifyShippingMethodNokia);
    }

    public String getVerifyTotalNokia() {
        return getTextFromElement(verifyTotalNokia);
    }

    public void clickOnConfirmNokia() {
        clickOnElement(confirmNokia);
    }

    public String getVerifyThankYouNokia() {
        return getTextFromElement(verifyThankYouNokia);
    }

    public String getVerifySuccessMessageNokia() {
        return getTextFromElement(verifySuccessMessageNokia);
    }

    public void clickOnContinueHomepageNokia() {
        clickOnElement(continueHomepageNokia);
    }

    public String getVerifyRegisteredMessage() {
        return getTextFromElement(verifyRegisteredMessage);
    }
}
