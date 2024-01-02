package com.co.booking.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;

public class ReservationRecordPage {

    // THREE STARS
    public static final Target BTN_THREESTARS = Target.the("3 estrellas...")
            .locatedBy("//div [@data-filters-item = 'class:class=3']//input [@name = 'class=3']");

    // FOUR STARS
    public static final Target BTN_FOURSTARS = Target.the("4 estrellas...")
            .locatedBy("//div [@data-filters-item = 'class:class=4']//input [@name = 'class=4']");

    // FOUR STARS
    public static final Target BTN_FIVESTARS = Target.the("5 estrellas...")
            .locatedBy("//div [@data-filters-item = 'class:class=5']//input [@name = 'class=5']");


    // SELECT FILTER
    public static final Target BTN_SELECTFILTER = Target.the("Ordenar por:")
            .locatedBy("//button [@data-testid='sorters-dropdown-trigger]");

    // OPTION ECONOMY

    public static final Target BTN_SELECTFILTERECONOMY = Target.the("Precio: mas bajo primero")
            .locatedBy("//button [@data-id='price']");


    // See availability
    public static final Target BTN_VERDISPONIBILIDAD = Target.the("Ver disponibilidad")
            .locatedBy("//a [@data-testid = 'availability-cta-btn']");

    // Select reservation
    public static final Target BTN_SELECTRESERVATION = Target.the("0")
            .locatedBy("//select [@data-testid='select-room-trigger']");


    // Select Price
    public static final Target BTN_SELECTRESERVATIONPRICE = Target.the("1 (COP 89.260)")
            .locatedBy("//select [@data-testid='select-room-trigger']//option [@value = '1']");

    // Confirm reservation
    public static final Target BTN_CONFIRMRESERVATION = Target.the("1 (COP 89.260)")
            .locatedBy("//button [@id='b_tt_holder_1']");



}
