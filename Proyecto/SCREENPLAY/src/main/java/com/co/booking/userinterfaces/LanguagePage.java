package com.co.booking.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;

public class LanguagePage {

    // OPTION - ENGLISH US LANGUAGE

    public static final Target BTN_ENGLISH_US = Target.the("English (US)").
            locatedBy("//button [@data-testid = 'selection-item']//span [contains(text(),'English (US)')]");

    // CONFIRMATION OF CHANGE OF LANGUAGE TO ENGLISH

    public static final Target LANGUAGE_US = Target.the("en-us").
            locatedBy("//html [@lang = 'en-us']");

    /////////////////////---------------------

    // OPTION - ENGLISH UK LANGUAGE

    public static final Target BTN_ENGLISH_UK = Target.the("English (UK)").
            locatedBy("//button [@data-testid = 'selection-item']//span [contains(text(),'English (UK)')]");

    // CONFIRMATION OF CHANGE OF LANGUAGE TO ENGLISH UK

    public static final Target LANGUAGE_UK = Target.the("en-gb").
            locatedBy("//html [@lang = 'en-gb']");

    /////////////////////---------------------

    // OPTION - French LANGUAGE

    public static final Target BTN_ENGLISH_French = Target.the("Français").
            locatedBy("//button [@data-testid = 'selection-item']//span [contains(text(),'Fran')]");

    // CONFIRMATION OF CHANGE OF LANGUAGE TO French

    public static final Target LANGUAGE_French = Target.the("fr").
            locatedBy("//html [@lang = 'fr']");

    /////////////////////---------------------

    // OPTION - PORTUGUESE LANGUAGE

    public static final Target BTN_PORTUGUESBR = Target.the("Portug (BR)").
            locatedBy("//button [@data-testid = 'selection-item']//span [contains(text(),'(BR)')]");

    // CONFIRMATION OF CHANGE OF LANGUAGE TO PORTUGUESE

    public static final Target LANGUAGE_PORTUGUESBR = Target.the("pt-br").
            locatedBy("//html [@lang = 'pt-br']");

    /////////////////////---------------------

    // OPTION - PORTUGUESE PT LANGUAGE

    public static final Target BTN_PortuguespPT = Target.the("(PT)").
            locatedBy("//button [@data-testid = 'selection-item']//span [contains(text(),'(PT)')]");

    // CONFIRMATION OF CHANGE OF LANGUAGE TO PortuguêspPT

    public static final Target LANGUAGE_PortuguespPT = Target.the("pt-pt").
            locatedBy("//html [@lang = 'pt-pt']");

    /////////////////////---------------------

    // OPTION - ITALIAN LANGUAGE

    public static final Target BTN_ITALIANO = Target.the("Italiano").
            locatedBy("//button [@data-testid = 'selection-item']//span [contains(text(),'Italiano')]");

    // CONFIRMATION OF CHANGE OF LANGUAGE TO ITALIANO

    public static final Target LANGUAGE_ITALIANO = Target.the("it").
            locatedBy("//html [@lang = 'it']");

    /////////////////////---------------------

    // OPTION - JAPANESE LANGUAGE

    public static final Target BTN_JAPANESE = Target.the("Japanese").
            locatedBy("//button [@data-testid = 'selection-item']//span [contains(text(),'日本語')]");

    // CONFIRMATION OF CHANGE OF LANGUAGE TO JAPANESE

    public static final Target LANGUAGE_JAPANESE = Target.the("ja").
            locatedBy("//html [@lang = 'ja']");

    /////////////////////---------------------

    // OPTION - MANDARIN LANGUAGE

    public static final Target BTN_MANDARIN = Target.the("简体中文").
            locatedBy("//button [@data-testid = 'selection-item']//span [contains(text(),'简体中文')]");

    // CONFIRMATION OF CHANGE OF LANGUAGE TO MANDARIN

    public static final Target LANGUAGE_MANDARIN = Target.the("zh-cn").
            locatedBy("//html [@lang = 'zh-cn']");

    /////////////////////---------------------

    // OPTION - GREEK LANGUAGE

    public static final Target BTN_GREEK = Target.the("Ελληνικά").locatedBy("//button [@data-testid = 'selection-item']//span [contains(text(),'Ελληνικά')]");

    // CONFIRMATION OF CHANGE OF LANGUAGE TO GREEK

    public static final Target LANGUAGE_GREEK = Target.the("el").
            locatedBy("//html [@lang = 'el']");

    /////////////////////---------------------

    // OPTION - POLISH LANGUAGE

    public static final Target BTN_POLISH = Target.the("Polski").
            locatedBy("//button [@data-testid = 'selection-item']//span [contains(text(),'Polski')]");

    // CONFIRMATION OF CHANGE OF LANGUAGE TO POLISH

    public static final Target LANGUAGE_POLISH = Target.the("pl").
            locatedBy("//html [@lang = 'pl']");

    /////////////////////---------------------

    // OPTION - FILIPINO LANGUAGE

    public static final Target BTN_FILIPINO = Target.the("Filipino").
            locatedBy("//button [@data-testid = 'selection-item']//span [contains(text(),'Filipino')]");

    // CONFIRMATION OF CHANGE OF LANGUAGE TO FILIPINO

    public static final Target LANGUAGE_FILIPINO = Target.the("tl").
            locatedBy("//html [@lang = 'tl']");

    /////////////////////---------------------

    // OPTION - Deutsch LANGUAGE

    public static final Target BTN_DEUTSH = Target.the("Deutsh").
            locatedBy("//button [@data-testid = 'selection-item']//span [contains(text(),'Deutsch')]");

    // CONFIRMATION OF CHANGE OF LANGUAGE TO FILIPINO

    public static final Target LANGUAGE_DEUTSH = Target.the("de").
            locatedBy("//html [@lang = 'de']");

    /////////////////////---------------------

}
