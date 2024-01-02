package com.co.booking.questions;

import com.co.booking.userinterfaces.MenuComponent;
import com.co.booking.userinterfaces.RegisterPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;

public class ValidationEmail implements Question <String> {

@Override
public String answeredBy(Actor actor) {
        return Text.of(RegisterPage.VALIDATE_ERROR_EMAIL).viewedBy(actor).asString();
        }

public static ValidationEmail compare ()
        {
        return new ValidationEmail();
        }


}
