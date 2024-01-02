package com.co.booking.questions;

import com.co.booking.userinterfaces.LanguagePage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Visibility;


public class ValidationLanguageItalian implements Question <Boolean> {


    @Override
    public Boolean answeredBy(Actor actor) {
        return Visibility.of(LanguagePage.LANGUAGE_ITALIANO).viewedBy(actor).asBoolean();
    }

    public static ValidationLanguageItalian compare () {
        return new ValidationLanguageItalian();
    }
}
