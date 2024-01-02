package com.co.booking.task;

import com.co.booking.userinterfaces.RegisterPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import com.co.booking.userinterfaces.MenuComponent;
import net.serenitybdd.screenplay.actions.Enter;

public class Register implements Task {


    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Click.on(MenuComponent.CLOSE_POPPUP_BUTTON),
                Click.on(MenuComponent.BTN_REGISTER),
                Enter.theValue("jagarcia8578@soy.sena.edu").into(RegisterPage.TXT_EMAIL),
                Click.on(RegisterPage.BTN_CONTINUE_REGISTER),
                Enter.theValue("Prueba123456").into(RegisterPage.TXT_FIRST_PASSWORD),
                Enter.theValue("Prueba123456").into(RegisterPage.TXT_SECOND_PASSWORD),
                Click.on(RegisterPage.BTN_CREATE_ACCOUNT));
           }

    public static Register enterCredentials() {
        return Tasks.instrumented(Register.class);
    }
}
