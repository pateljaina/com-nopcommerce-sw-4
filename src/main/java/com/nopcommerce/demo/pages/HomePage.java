package com.nopcommerce.demo.pages;

import com.nopcommerce.demo.utilities.Utility;
import org.openqa.selenium.By;

public class HomePage extends Utility{
    By computers = By.linkText("Computers");
    By desktopSubmenu = (By.xpath("//a[@title='Show products in category Desktops'][normalize-space()='Desktops']"));
    By desktop = By.linkText("Desktops");
    By verifyWelcomeToStore = By.xpath("//h2[contains(text(),'Welcome to our store')]");
    By electronics = By.xpath("//ul[@class='top-menu notmobile']//a[normalize-space()='Electronics']");
    By cellPhones = By.xpath("//ul[@class='top-menu notmobile']//a[normalize-space()='Cell phones']");
    By logOut = By.xpath("//a[contains(text(),'Log out')]");

    public void clickOnComputer() {
        clickOnElement(computers);
    }

    public void clickOnDeskTop() {
        clickOnElement(desktop);
    }
    public void clickOnDesktopSubmenu(){
        clickOnElement(desktopSubmenu);
    }

    public String getVerifyWelcomeToStore() {
        return getTextFromElement(verifyWelcomeToStore);
    }

    public void hoverElectronics() {
        mouseHoverToElement(electronics);
    }

    public void clickCellPhones() {
        mouseHoverToElementAndClick(cellPhones);
    }

    public void clickOnLogOut() {
        clickOnElement(logOut);
    }

    public String getUrl() {
        return driver.getCurrentUrl();
    }

}
