package com.co.booking.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;

public class RegisterPage {

    public static final Target TXT_EMAIL = Target.the("Ingresar Email")
            .locatedBy("//input[@name='username']");

    public static final Target BTN_CONTINUE_REGISTER = Target.the("Clic boton de continuar registro")
            .locatedBy("//button[@type='submit']");

    public static final Target TXT_FIRST_PASSWORD = Target.the("Ingresar primera contraseña")
            .locatedBy("//input [@id = 'new_password']");

    public static final Target TXT_SECOND_PASSWORD = Target.the("Confirmar Contraseña")
            .locatedBy("//input [@id = 'confirmed_password']");
    public static final Target BTN_CREATE_ACCOUNT  = Target.the("Clic boton de crear cuenta")
            .locatedBy("//button [@class = 'Iiab0gVMeWOd4XcyJGA3 wPxWIS_rJCpwAWksE0s3 Ut3prtt_wDsi7NM_83Jc TuDOVH9WFSdot9jLyXlw EJWUAldA4O1mP0SSFXPm whxYYRnvyHGyGqxO4ici']");

    public static final Target VALIDATE_ERROR_EMAIL = Target.the("Mensaje de validacion Email")
            .locatedBy("//*[text()='Comprueba si el e-mail que has introducido es correcto']");
    public static final Target VALIDATE_EMPTY_EMAIL = Target.the("Mensaje de campo vacio de Email")
            .locatedBy("//*[text()='Continuar con e-mail']");

    public static final Target VALIDATE_ACCOUNT = Target.the("Item para validar el registro ")
            .locatedBy("//input[@id='new_password']");

    public static final Target VALIDATE_EMPTY_FIRTS_PASSWORD= Target.the("Mensaje para validar el ingreso de la contraseña")
            .locatedBy("//div[@id='new_password-note']");

    public static final Target VALIDATE_EMPTY_SECOND_PASSWORD= Target.the("Mensaje para validar el ingreso de la contraseña en el segundo campo")
            .locatedBy("//div[@id='confirmed_password-note']");



}

