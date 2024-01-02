package com.co.booking.task;

import com.co.booking.userinterfaces.MenuComponent;
import com.co.booking.userinterfaces.ReservationRecordPage;
import com.co.booking.userinterfaces.SearchPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.DoubleClick;
import net.serenitybdd.screenplay.actions.Scroll;
import net.serenitybdd.screenplay.matchers.WebElementStateMatchers;
import net.serenitybdd.screenplay.questions.WebElementQuestion;

public class Reservation implements Task {

    @Override
    public <T extends Actor> void performAs(T actor) {

        //SEARCH RESERVATION

        actor.attemptsTo(Click.on(MenuComponent.CLOSE_POPPUP_BUTTON),
                Scroll.to(SearchPage.BTN_SCROLL),
                Click.on(SearchPage.TXT_SEARCH),
                Click.on(SearchPage.BTN_OPTION));
        try {
            Thread.sleep(4000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        actor.attemptsTo(Click.on(SearchPage.BTN_FIRSTSDAY),
                Click.on(SearchPage.BTN_SECONDDAY),
                Click.on(SearchPage.BTN_CALENDAR),
                Click.on(SearchPage.BTN_PERSON),
                Click.on(SearchPage.BTN_VALOR_PERSON),
                DoubleClick.on(SearchPage.BTN_VALOR_CHILDREN),
                Click.on(SearchPage.BTN_YEAR_FIRST_CHILDREN),
                Click.on(SearchPage.OP_YEAR_FIRST_CHILDREN),
                Click.on(SearchPage.BTN_YEAR_SECOND_CHILDREN),
                Click.on(SearchPage.OP_YEAR_SECOND_CHILDREN),
                Click.on(SearchPage.BTN_VALOR_BEDROOMS),
                Click.on(SearchPage.BTN_SCROLL));


        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        // Select Hotel

        actor.attemptsTo(Scroll.to(ReservationRecordPage.BTN_THREESTARS));
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        actor.attemptsTo(Click.on(ReservationRecordPage.BTN_THREESTARS));
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        actor.attemptsTo(Scroll.to(ReservationRecordPage.BTN_THREESTARS));
        actor.attemptsTo(Click.on(ReservationRecordPage.BTN_FOURSTARS));
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        actor.attemptsTo(Scroll.to(ReservationRecordPage.BTN_THREESTARS));
        actor.attemptsTo(Click.on(ReservationRecordPage.BTN_FIVESTARS));
        try {
            Thread.sleep(10000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        actor.attemptsTo(Scroll.to(ReservationRecordPage.BTN_SELECTFILTER));
        try {
            Thread.sleep(10000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        actor.attemptsTo(Click.on(ReservationRecordPage.BTN_SELECTFILTER));
        actor.attemptsTo(Click.on(ReservationRecordPage.BTN_SELECTFILTERECONOMY));
        actor.attemptsTo(Click.on(ReservationRecordPage.BTN_VERDISPONIBILIDAD));
        actor.attemptsTo(Click.on(ReservationRecordPage.BTN_SELECTRESERVATION));
        actor.attemptsTo(Click.on(ReservationRecordPage.BTN_SELECTRESERVATIONPRICE));
        actor.attemptsTo(Click.on(ReservationRecordPage.BTN_CONFIRMRESERVATION));

    }

    public static Reservation enterCredentialsReservation() {
        return Tasks.instrumented(Reservation.class);
    }

}
