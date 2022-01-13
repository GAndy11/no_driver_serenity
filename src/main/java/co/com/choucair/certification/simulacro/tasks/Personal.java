package co.com.choucair.certification.simulacro.tasks;

import co.com.choucair.certification.simulacro.model.UserData;
import co.com.choucair.certification.simulacro.userinterface.PersonalPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.SelectFromOptions;

import java.util.List;

public class Personal implements Task {
    private String firstName;
    private String lastName;
    private String email;
    private String birthMonth;
    private String birthDay;
    private String birthYear;

    public Personal(String firstName, String lastName, String email, String birthMonth, String birthDay, String birthYear) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.birthMonth = birthMonth;
        this.birthDay = birthDay;
        this.birthYear = birthYear;
    }

    public static Personal fillInfo(UserData userData) {
        return Tasks.instrumented(
                Personal.class,
                userData.getFirstName(),
                userData.getLastName(),
                userData.getEmail(),
                userData.getBirthMonth(),
                userData.getBirthDay(),
                userData.getBirthYear());
    }



    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Enter.theValue(firstName).into(PersonalPage.INPUT_FIRST_NAME),
                Enter.theValue(lastName).into(PersonalPage.INPUT_LAST_NAME),
                Enter.theValue(email).into(PersonalPage.INPUT_EMAIL),
                SelectFromOptions.byVisibleText(birthMonth).from(PersonalPage.INPUT_BIRTH_MONTH),
                SelectFromOptions.byVisibleText(birthDay).from(PersonalPage.INPUT_BIRTH_DAY),
                SelectFromOptions.byVisibleText(birthYear).from(PersonalPage.INPUT_BIRTH_YEAR),
                Click.on(PersonalPage.BUTTON_NEXT_LOCATIONS)
        );
    }
}
