package co.com.choucair.certification.simulacro.tasks;

import co.com.choucair.certification.simulacro.userinterface.UTestPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;

public class Push implements Task {
    public static Performable joinButton() {
        return Tasks.instrumented(Push.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(UTestPage.BUTTON_JOIN)
        );
    }
}
