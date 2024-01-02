package com.co.booking.questions;

import com.co.booking.userinterfaces.MenuComponent;
import com.co.booking.userinterfaces.RegisterPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;
import net.serenitybdd.screenplay.questions.Visibility;

public class ValidationName implements Question<Boolean> {

    @Override
    public Boolean answeredBy(Actor actor) {
        return Visibility.of(RegisterPage.VALIDATE_ACCOUNT).viewedBy(actor).asBoolean();
    }

    public static ValidationName compare ()
    {
        return new ValidationName();
    }
}
