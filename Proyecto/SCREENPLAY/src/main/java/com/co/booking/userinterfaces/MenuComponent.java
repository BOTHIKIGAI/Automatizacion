package com.co.booking.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;

public class MenuComponent {

    public static final Target CLOSE_POPPUP_BUTTON = Target.the("Clic para cerrar anuncio")
            .locatedBy("//button [@class = 'a83ed08757 c21c56c305 f38b6daa18 d691166b09 ab98298258 deab83296e f4552b6561']");
    public static final Target BTN_REGISTER = Target.the("Clic boton de registro")
            .locatedBy("//a[@data-testid='header-sign-up-button']");
    public static final Target BTN_LOGIN = Target.the("Clic boton de Iniciar Sesion")
            .locatedBy("//a[@data-testid='header-sign-in-button']");

    public static final Target LGO_BOOKING = Target.the("Clic en el log Booking")
            .locatedBy("//span[@data-testid='header-logo']");

          // FORM CONTACT US

    // INPUT MAIL - FORM CONTACT US
    public static final Target TXT_EMAILFORMCONTACUS = Target.the("Tu direccion de e-mail").
            locatedBy("//input [@id = 'newsletter_to']");

    // BUTTON SEND MAIL - FORM CONTACT US
    public static final Target BTN_FORMCONTACTUS = Target.the("¡Suscríbete!").
            locatedBy("//button [@id = 'newsletter_button_footer' ]");

    // FORM STATUS MESSAGE

    public static final Target MESSAGE_FORMCONTACTUS = Target.the("mensaje del estado del formulario ").
            locatedBy("");


        // CHANGE LANGUAGE

    // SELECT LANGUAGE

    public static final Target BTN_SELECTLANGUAGE = Target.the("Selecciona tu idioma").
            locatedBy("//button [@data-testid = 'header-language-picker-trigger']");


}
