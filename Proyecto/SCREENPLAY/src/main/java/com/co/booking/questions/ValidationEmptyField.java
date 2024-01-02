package com.co.booking.questions;

import com.co.booking.userinterfaces.RegisterPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;

public class ValidationEmptyField implements Question <String> {

@Override
public String answeredBy(Actor actor) {
        return Text.of(RegisterPage.VALIDATE_EMPTY_EMAIL).viewedBy(actor).asString();
        }

public static ValidationEmptyField compare ()
        {
        return new ValidationEmptyField();
        }


}
