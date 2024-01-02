package com.co.booking.questions;

import com.co.booking.userinterfaces.LanguagePage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;
import net.serenitybdd.screenplay.questions.Visibility;


public class ValidationLanguageEnglish implements Question <Boolean> {


    @Override
    public Boolean answeredBy(Actor actor) {
        return Visibility.of(LanguagePage.LANGUAGE_US).viewedBy(actor).asBoolean();
    }

    public static ValidationLanguageEnglish compare () {
        return new ValidationLanguageEnglish();
    }
}
