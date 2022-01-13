package co.com.choucair.certification.simulacro.stepdefinitions;

import co.com.choucair.certification.simulacro.model.UserData;
import co.com.choucair.certification.simulacro.questions.Answer;
import co.com.choucair.certification.simulacro.tasks.*;
import com.google.gson.Gson;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;
import net.serenitybdd.screenplay.GivenWhenThen;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;

import java.util.Map;

public class SignUpUTestStepDefinition {

    @Before
    public void setStage(){
        WebDriverManager.chromedriver().setup();
        OnStage.setTheStage(new OnlineCast());
    }

    @Given("than Alexander was in the utest page")
    public void thanAlexanderWasInTheUtestPage() throws Exception {
        OnStage.theActorCalled("Alexander").wasAbleTo(
                OpenUp.thePage(),
                Push.joinButton()
        );
    }

    @When("he fill the complete subscribe form")
    public void heFillTheCompleteSubscribeForm(Map<String, String> datos){

        Gson gson = new Gson();
        UserData userData = gson.fromJson(gson.toJsonTree(datos), UserData.class);

        OnStage.theActorInTheSpotlight().attemptsTo(
                Personal.fillInfo(userData),
                Address.fillInfo(userData),
                Devices.fillInfo(userData),
                Complete.fillInfo(userData)
        );
    }

    @Then("he can see the welcome message {string}")
    public void heCanSeeTheWelcomeMessage(String msgeFinal){
        OnStage.theActorInTheSpotlight().should(GivenWhenThen.seeThat(
                Answer.toThe(msgeFinal)
        ));
    }
}
