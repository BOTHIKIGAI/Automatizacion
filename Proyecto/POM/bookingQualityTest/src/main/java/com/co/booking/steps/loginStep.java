package com.co.booking.steps;

import com.co.booking.pageobject.loginPage;

public class loginStep {

    loginPage loginPage = new loginPage();

    // Scenario Login Succesful
    public void openBrowser() {
        loginPage.open();
    }
    public void CLOSEPOPPUPBUTTON() {
        loginPage.getDriver().findElement(loginPage.getCLOSE_POPPUP_BUTTON()).click();
    }
    public void CLICKLOGINBUTTON() {
        loginPage.getDriver().findElement(loginPage.getLOGIN_BUTONN()).click();
    }
    public void SENDKEYSINPUTMAIL() {
        loginPage.getDriver().findElement(loginPage.getINPUT_MAIL()).sendKeys("estebax89@gmail.com");
    }
    public void CLICKENTERMAILBUTTON() {
        loginPage.getDriver().findElement(loginPage.getENTER_MAIL_BUTTON()).click();
    }
    public void SENDKEYSPASSWORD() {
        loginPage.getDriver().findElement(loginPage.getINPUT_PASSWORD()).sendKeys("AMb967JUAN?*12");
    }
    public void CLICKBUTTONPASS() {
        loginPage.getDriver().findElement(loginPage.getENTER_PASS_BUTTON()).click();
    }

    // Fail Login - Enter numer credentials on mail
    public void SENDKEYS_INPUTMAIL_NUMBER() {
        loginPage.getDriver().findElement(loginPage.getINPUT_MAIL()).sendKeys("123456789");
    }

    // Fail Login - The user enter special characters in email

    public void SENDKEYS_INPUTMAIL_SPECIALCHARACTERS() {
        loginPage.getDriver().findElement(loginPage.getINPUT_MAIL()).sendKeys("® Ø ă Ὠ ∞ √");
    }

    // Fail Login - The user enter wrong email

    public void SENDKEYS_INPUTMAIL_WRONGMAIL() {
        loginPage.getDriver().findElement(loginPage.getINPUT_MAIL()).sendKeys("andres.estudio.123@gmail");
    }

    // Fail Login - the user enter wrong pass

    public void SENDKEYS_WRONGPASSWORD() {
        loginPage.getDriver().findElement(loginPage.getINPUT_PASSWORD()).sendKeys("123456");
    }

    // Error Message
    public void FIND_HEADER_MESSAGEERROR() {
        loginPage.getDriver().findElement(loginPage.getHEADER_MESSAGEERROR()).isDisplayed();
    }

    // Captcha Message
    public void FIND_HEADER_MESSAGECAPTCHA() {
        loginPage.getDriver().findElement(loginPage.getHEADER_CAPTCHA()).isDisplayed();
    }

}
