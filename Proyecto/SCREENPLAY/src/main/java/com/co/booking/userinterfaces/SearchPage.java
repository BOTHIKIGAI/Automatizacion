package com.co.booking.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;
import org.joda.time.LocalDate;

import java.text.SimpleDateFormat;

public class SearchPage {

    public static final Target BTN_SCROLL = Target.the("Boton para hacer scroll")
            .locatedBy("//button[@type='submit']");
    public static final Target TXT_SEARCH = Target.the("Ingresar lugar de reserva")
            .locatedBy("//input[@id=':re:']");
    public static final Target BTN_OPTION = Target.the("Selecionar SantaMarta")
            .locatedBy("//div [@class = 'bd86c73401']//div [contains(text(),'Santa Marta')]");
    public static final Target BTN_CALENDAR = Target.the("Hacer clic en el calendario")
            .locatedBy("//div[@class='d606c76c5a']//div[@role='none']");

    static LocalDate FirstDay = LocalDate.now().plusDays(2);
    public static final Target BTN_FIRSTSDAY = Target.the("Boton clic en el primer dia")
            .locatedBy("//span[@data-date='" + FirstDay + "']");

    static LocalDate SecondDay = LocalDate.now().plusDays(9);

    public static final Target BTN_SECONDDAY = Target.the("Boton clic en la fecha final")
            .locatedBy("//span[@data-date ='" + SecondDay + "']");
    public static final Target BTN_PERSON = Target.the("Boton cantidad de personas")
            .locatedBy("//div[@class='d67edddcf0']//button[@data-testid='occupancy-config']");
    public static final Target BTN_VALOR_PERSON = Target.the("Cantidad de personas")
            .locatedBy("//button [@tabindex = '-1']//following::button[1]");
    public static final Target BTN_VALOR_CHILDREN = Target.the("Cantidad de niños")
            .locatedBy("//button [@tabindex = '-1']//following::button[3]");
     public static final Target BTN_YEAR_FIRST_CHILDREN = Target.the("Boton para escoger la edad del primer niño")
            .locatedBy("//div[@class = 'cabad3c686 aff44befa2']//select[@class='ebf4591c8e']");
     public static final Target OP_YEAR_FIRST_CHILDREN = Target.the("Boton para escoger la edad del primer niño")
            .locatedBy("//select[@id = ':rv:']//option[@value='3']");

    public static final Target BTN_YEAR_SECOND_CHILDREN = Target.the("Boton para escoger la edad del segundo niño")
            .locatedBy("//select[@id = ':r10:']");

    public static final Target OP_YEAR_SECOND_CHILDREN = Target.the("Boton para escoger la edad del segundo niño")
            .locatedBy("//select[@id = ':r10:']//option[@value='3']");
    public static final Target BTN_VALOR_BEDROOMS = Target.the("Cantidad de habitaciones")
            .locatedBy("//button [@tabindex = '-1']//following::button[5]");

}
