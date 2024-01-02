package com.co.booking.runners;

import io.cucumber.junit.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
        features = "src/test/resources/features/changelanguages.feature",
        glue = "com.co.booking.steptsdefinitions",
        snippets = CucumberOptions.SnippetType.CAMELCASE
)
public class changeLanguagesRunner {
}
