package com.co.booking.runners;

import io.cucumber.junit.CucumberOptions;
import io.cucumber.junit.CucumberSerenityRunner;
import org.junit.runner.RunWith;

@RunWith(CucumberSerenityRunner.class)
@CucumberOptions(
        features = "src/test/resources/features/register.feature",
        snippets = CucumberOptions.SnippetType.CAMELCASE,
        glue = "com.co.booking.steptsdefinitions"

)
public class RegisterRunner {

}
