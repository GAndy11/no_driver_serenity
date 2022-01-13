package co.com.choucair.certification.simulacro.tasks;

import co.com.choucair.certification.simulacro.model.UserData;
import co.com.choucair.certification.simulacro.userinterface.CompletePage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

import java.util.List;

public class Complete implements Task {
    private String password;

    public Complete(String password) {
        this.password = password;
    }

    public static Complete fillInfo(UserData userData) {
        return Tasks.instrumented(
                Complete.class,
                userData.getPassword()
        );
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Enter.theValue(password).into(CompletePage.INPUT_PASSWORD),
                Enter.theValue(password).into(CompletePage.INPUT_CONFIRM_PASSWORD),
                Click.on(CompletePage.CHECKBOX_STAY_INFORMED),
                Click.on(CompletePage.CHECKBOX_TERMS_USE),
                Click.on(CompletePage.CHECKBOX_SECURITY_POLICY)
        );
    }
}
