package co.com.choucair.certification.simulacro.runners;


import io.cucumber.junit.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(features = "src/test/resources/features/sign_up_in_utest.feature",
        tags = "@Stories",
        glue = "co.com.choucair.certification.simulacro.stepdefinitions",
        snippets = CucumberOptions.SnippetType.CAMELCASE)

public class RunnerTags {

}
