package com.co.booking.task;

import com.co.booking.userinterfaces.MenuComponent;
import com.co.booking.userinterfaces.RegisterPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

public class RegisterFailIncompleteEmail implements Task {

    @Override
    public <T extends Actor> void performAs(T actor) {

        actor.attemptsTo(Click.on(MenuComponent.CLOSE_POPPUP_BUTTON),
                Click.on(MenuComponent.BTN_REGISTER),
                Enter.theValue("jagarcia8578@soy").into(RegisterPage.TXT_EMAIL),
                Click.on(RegisterPage.BTN_CONTINUE_REGISTER));
    }

    public static RegisterFailIncompleteEmail enterEmptyEmail() {
        return Tasks.instrumented(RegisterFailIncompleteEmail.class);
    }
}
