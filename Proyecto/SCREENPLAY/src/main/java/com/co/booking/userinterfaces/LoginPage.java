package com.co.booking.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;

public class LoginPage {

    public static final Target TXT_PASSWORD = Target.the("Campo ingreso de contraseña")
            .locatedBy("//input[@id='password']");

    public static final Target BTN_LOGIN = Target.the("Campo ingreso de contraseña")
            .locatedBy("//button[@type='submit']");
}