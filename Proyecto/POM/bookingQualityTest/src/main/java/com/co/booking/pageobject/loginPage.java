package com.co.booking.pageobject;

import net.serenitybdd.core.pages.PageObject;
import net.thucydides.core.annotations.DefaultUrl;
import org.openqa.selenium.By;

@DefaultUrl("https://www.booking.com/index.es.html?aid=304142&label=gen173bo-1FCA8oggI46AdIClgDaDKIAQGYAQq4ARfIAQzYAQHoAQH4AQaIAgGYAiGoAgO4AvzGy6gGwAIB0gIkNjBiNGQzYjEtNmExNS00NTI3LWJlMDYtNDFkOTcwZmNjZmIy2AIF4AIB&sid=9b674379cff97b06f0b53b8d366e597f&keep_landing=1&sb_price_type=total&")
public class loginPage extends PageObject {

    By CLOSE_POPPUP_BUTTON = By.xpath("//button [@class = 'a83ed08757 c21c56c305 f38b6daa18 d691166b09 ab98298258 deab83296e f4552b6561']");
    By LOGIN_BUTONN = By.xpath("//a [@data-testid = 'header-sign-in-button']");
    By INPUT_MAIL = By.xpath("//input [@id = 'username']");
    By ENTER_MAIL_BUTTON = By.xpath("//button [@class = 'Iiab0gVMeWOd4XcyJGA3 wPxWIS_rJCpwAWksE0s3 Ut3prtt_wDsi7NM_83Jc TuDOVH9WFSdot9jLyXlw EJWUAldA4O1mP0SSFXPm whxYYRnvyHGyGqxO4ici']");
    By INPUT_PASSWORD = By.xpath("//input [@id = 'password']");
    By ENTER_PASS_BUTTON = By.xpath("//button [@class = 'Iiab0gVMeWOd4XcyJGA3 wPxWIS_rJCpwAWksE0s3 Ut3prtt_wDsi7NM_83Jc TuDOVH9WFSdot9jLyXlw EJWUAldA4O1mP0SSFXPm whxYYRnvyHGyGqxO4ici']");
    By HEADER_CAPTCHA = By.xpath("//div [@class = 'bui-u-text-left bui_font_body']");
    By HEADER_MESSAGEERROR = By.xpath("//div [@class = 'sOewt4Y1yBOPAIUGcJwH fD2Lif3G4ehCgKZJDFwf CgEr4LoA7GBJSRxe_hwL']");

    public By getCLOSE_POPPUP_BUTTON() {
        return CLOSE_POPPUP_BUTTON;
    }
    public void setCLOSE_POPPUP_BUTTON(By CLOSE_POPPUP_BUTTON) {
        this.CLOSE_POPPUP_BUTTON = CLOSE_POPPUP_BUTTON;
    }

    public By getLOGIN_BUTONN() {
        return LOGIN_BUTONN;
    }

    public void setLOGIN_BUTONN(By LOGIN_BUTONN) {
        this.LOGIN_BUTONN = LOGIN_BUTONN;
    }

    public By getINPUT_MAIL() {
        return INPUT_MAIL;
    }

    public void setINPUT_MAIL(By INPUT_MAIL) {
        this.INPUT_MAIL = INPUT_MAIL;
    }

    public By getENTER_MAIL_BUTTON() {
        return ENTER_MAIL_BUTTON;
    }

    public void setENTER_MAIL_BUTTON(By ENTER_MAIL_BUTTON) {
        this.ENTER_MAIL_BUTTON = ENTER_MAIL_BUTTON;
    }

    public By getINPUT_PASSWORD() {
        return INPUT_PASSWORD;
    }

    public void setINPUT_PASSWORD(By INPUT_PASSWORD) {
        this.INPUT_PASSWORD = INPUT_PASSWORD;
    }

    public By getENTER_PASS_BUTTON() {
        return ENTER_PASS_BUTTON;
    }

    public void setENTER_PASS_BUTTON(By ENTER_PASS_BUTTON) {
        this.ENTER_PASS_BUTTON = ENTER_PASS_BUTTON;
    }

    public By getHEADER_CAPTCHA() {
        return HEADER_CAPTCHA;
    }

    public void setHEADER_CAPTCHA(By HEADER_CAPTCHA) {
        this.HEADER_CAPTCHA = HEADER_CAPTCHA;
    }

    public By getHEADER_MESSAGEERROR() {
        return HEADER_MESSAGEERROR;
    }

    public void setHEADER_MESSAGEERROR(By HEADER_MESSAGEERROR) {
        this.HEADER_MESSAGEERROR = HEADER_MESSAGEERROR;
    }


}
