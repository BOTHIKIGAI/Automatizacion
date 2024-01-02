package com.co.booking.questions;

import com.co.booking.userinterfaces.RegisterPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;
import net.serenitybdd.screenplay.questions.Visibility;

public class ValidationPasswordEmptyFields implements Question <Boolean> {

@Override
public Boolean answeredBy(Actor actor) {
        return Visibility.of(RegisterPage.VALIDATE_EMPTY_FIRTS_PASSWORD).viewedBy(actor).asBoolean();
        }

public static ValidationPasswordEmptyFields compare ()
        {
        return new ValidationPasswordEmptyFields();
        }


}
