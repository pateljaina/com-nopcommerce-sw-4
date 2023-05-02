package com.nopcommerce.demo.pages;

import com.nopcommerce.demo.utilities.Utility;
import org.openqa.selenium.By;

public class BuildYourOwnComputerPage extends Utility {
    By pageTitle = By.xpath("//h1[normalize-space()='Build your own computer']");
    By processor = By.xpath("//select[@id='product_attribute_1']");
    By ram = By.xpath("//select[@id='product_attribute_2']");
    By hdd = By.xpath("//input[@id='product_attribute_3_7']");
    By os = By.xpath("//input[@id='product_attribute_4_9']");
    By TotalCommander = By.xpath("//input[@id='product_attribute_5_12']");
    By verifyPrice = By.xpath("//span[@id='price-value-1']");
    By addToCart = By.xpath("//button[@id='add-to-cart-button-1']");
    By verifyConfirmationText = By.xpath("//div[@class='bar-notification success']");
    By closeAlert = By.className("close");
    By shoppingCart = By.xpath("//a[@class='ico-cart']");
    By goToCart = (By.xpath("//button[contains(text(),'Go to cart')]"));

    public String pageTitle() {
        return getTextFromElement(By.xpath("//h1[normalize-space()='Build your own computer']"));
    }

    public void selectProcessor2_2() {
        selectByValueFromDropDown(processor, "1");
    }

    public void selectRAM8GB() {
        selectByValueFromDropDown(ram, "5");
    }

    public void selectHDD400GB() {clickOnElement(hdd);
    }

    public void selectOSVistaPremium$60() {
        clickOnElement(os);
    }

    public void selectTotalCommander() {
        clickOnElement(TotalCommander);
    }

    public String getVerifyPrice() {
        return getTextFromElement(verifyPrice);
    }

    public void clickOnAddToCart() {
        clickOnElement(addToCart);
    }

    public String getVerifyConfirmationText() {
        return getTextFromElement(verifyConfirmationText);
    }

    public void clickCloseAlert() {
        clickOnElement(closeAlert);
    }

    public void hoverOnShoppingCart() {
        mouseHoverToElement(shoppingCart);
    }

    public void clickOnGoToCart(){
        mouseHoverToElementAndClick(goToCart);

    }
}
