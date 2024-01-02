package com.co.booking.steptsdefinitions;

import com.co.booking.questions.*;
import com.co.booking.task.*;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.screenplay.GivenWhenThen;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.actors.Cast;
import net.serenitybdd.screenplay.actors.OnStage;
import net.thucydides.core.annotations.Managed;
import org.hamcrest.Matchers;
import org.openqa.selenium.WebDriver;

public class changeLanguagesStepDefinition {


    @Managed
    WebDriver hisBrowser;

    @Before
    public void setUp(){
        OnStage.setTheStage(Cast.ofStandardActors());
        OnStage.theActorCalled("Team15");
        OnStage.theActorInTheSpotlight().can(BrowseTheWeb.with(hisBrowser));
    }

    // Change to English

    @When("the user changes the language to English")
    public void theUserChangesTheLanguageToEnglish() {
        OnStage.theActorInTheSpotlight().attemptsTo(ChangeLanguageEnglish.changeEnglish());
    }

    @Then("the user observes that the page is translated into English")
    public void theUserObservesThatThePageIsTranslatedIntoEnglish() {
        OnStage.theActorInTheSpotlight().should(GivenWhenThen.seeThat(ValidationLanguageEnglish.compare()
                , Matchers.is(true)));
    }

    // Change to English UK

    @When("the user changes the language to English UK")
    public void theUserChangesTheLanguageToEnglishUK() {
        OnStage.theActorInTheSpotlight().attemptsTo(ChangeLanguageEnglishUK.changeEnglishUK());
    }

    @Then("the user observes that the page is translated into English UK")
    public void theUserObservesThatThePageIsTranslatedIntoEnglishUK() {
        OnStage.theActorInTheSpotlight().should(GivenWhenThen.seeThat(ValidationLanguageEnglishUK.compare()
                , Matchers.is(true)));
    }

    // Change to French

    @When("the user changes the language to French")
    public void theUserChangesTheLanguageToFrench() {
        OnStage.theActorInTheSpotlight().attemptsTo(ChangeLanguageFrench.changeFrench());
    }

    @Then("the user observes that the page is translated into French")
    public void theUserObservesThatThePageIsTranslatedIntoFrench() {
        OnStage.theActorInTheSpotlight().should(GivenWhenThen.seeThat(ValidationLanguageFrench.compare()
                , Matchers.is(true)));
    }

    // Change to German

    @When("the user changes the language to German")
    public void theUserChangesTheLanguageToGerman() {
        OnStage.theActorInTheSpotlight().attemptsTo(ChangeLanguageGerman.changeLanguageGerman());
    }

    @Then("the user observes that the page is translated into German")
    public void theUserObservesThatThePageIsTranslatedIntoGerman() {
        OnStage.theActorInTheSpotlight().should(GivenWhenThen.seeThat(ValidationLanguageGerman.compare()
                , Matchers.is(true)));
    }

    // Change to Portuguese Brazil

    @When("the user changes the language to Portuguese")
    public void theUserChangesTheLanguageToPortuguese() {
        OnStage.theActorInTheSpotlight().attemptsTo(ChangeLanguagePortuguese.changeLanguagePortuguese());
    }

    @Then("the user observes that the page is translated into Portuguese")
    public void theUserObservesThatThePageIsTranslatedIntoPortuguese() {
        OnStage.theActorInTheSpotlight().should(GivenWhenThen.seeThat(ValidationLanguagePortuguese.compare()
                , Matchers.is(true)));
    }

    // Change to Portuguese Portugal

    @When("the user changes the language to Portuguese PT")
    public void theUserChangesTheLanguageToPortuguesePT() {
        OnStage.theActorInTheSpotlight().attemptsTo(ChangeLanguagePortuguesePT.changeLanguagePortuguesePT());
    }

    @Then("the user observes that the page is translated into Portuguese PT")
    public void theUserObservesThatThePageIsTranslatedIntoPortuguesePT() {
        OnStage.theActorInTheSpotlight().should(GivenWhenThen.seeThat(ValidationLanguagePortuguesePT.compare()
                , Matchers.is(true)));
    }

    // Change to Italian

    @When("the user changes the language to Italian")
    public void theUserChangesTheLanguageToItalian() {
        OnStage.theActorInTheSpotlight().attemptsTo(ChangeLanguageItalian.changeLanguageItalian());
    }

    @Then("the user observes that the page is translated into Italian")
    public void theUserObservesThatThePageIsTranslatedIntoItalian() {
        OnStage.theActorInTheSpotlight().should(GivenWhenThen.seeThat(ValidationLanguageItalian.compare()
                , Matchers.is(true)));
    }

    // Change to Japanese

    @When("the user changes the language to Japanese")
    public void theUserChangesTheLanguageToJapanese() {
        OnStage.theActorInTheSpotlight().attemptsTo(ChangeLanguageJapanese.changeLanguageJapanese());
    }

    @Then("the user observes that the page is translated into Japanese")
    public void theUserObservesThatThePageIsTranslatedIntoJapanese() {
        OnStage.theActorInTheSpotlight().should(GivenWhenThen.seeThat(ValidationLanguageJapanese.compare()
                , Matchers.is(true)));
    }

    // Change to Mandarin

    @When("the user changes the language to Mandarin")
    public void theUserChangesTheLanguageToMandarin() {
        OnStage.theActorInTheSpotlight().attemptsTo(ChangeLanguageMandarin.changeLanguageMandarin());
    }

    @Then("the user observes that the page is translated into Mandarin")
    public void theUserObservesThatThePageIsTranslatedIntoMandarin() {
        OnStage.theActorInTheSpotlight().should(GivenWhenThen.seeThat(ValidationLanguageMandarin.compare()
                , Matchers.is(true)));
    }

    // Change to Greek

    @When("the user changes the language to Greek")
    public void theUserChangesTheLanguageToGreek() {
        OnStage.theActorInTheSpotlight().attemptsTo(ChangeLanguageGreek.changeLanguageGreek());
    }

    @Then("the user observes that the page is translated into Greek")
    public void theUserObservesThatThePageIsTranslatedIntoGreek() {
        OnStage.theActorInTheSpotlight().should(GivenWhenThen.seeThat(ValidationLanguageGreek.compare()
                , Matchers.is(true)));
    }

    // Change to Polish

    @When("the user changes the language to Polish")
    public void theUserChangesTheLanguageToPolish() {
        OnStage.theActorInTheSpotlight().attemptsTo(ChangeLanguagePolish.changeLanguagePolish());
    }

    @Then("the user observes that the page is translated into Polish")
    public void theUserObservesThatThePageIsTranslatedIntoPolish() {
        OnStage.theActorInTheSpotlight().should(GivenWhenThen.seeThat(ValidationLanguagePolish.compare()
                , Matchers.is(true)));
    }

    // Change to Filipino

    @When("the user changes the language to Filipino")
    public void theUserChangesTheLanguageToFilipino() {
        OnStage.theActorInTheSpotlight().attemptsTo(ChangeLanguageFilipino.changeLanguageFilipino());
    }

    @Then("the user observes that the page is translated into Filipino")
    public void theUserObservesThatThePageIsTranslatedIntoFilipino() {
        OnStage.theActorInTheSpotlight().should(GivenWhenThen.seeThat(ValidationLanguageFilipino.compare()
                , Matchers.is(true)));
    }

}
