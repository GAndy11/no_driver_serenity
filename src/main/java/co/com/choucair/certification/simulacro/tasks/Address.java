package co.com.choucair.certification.simulacro.tasks;

import co.com.choucair.certification.simulacro.model.UserData;
import co.com.choucair.certification.simulacro.userinterface.AddressPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.Hit;
import net.serenitybdd.screenplay.waits.WaitUntil;
import org.openqa.selenium.Keys;

import java.util.List;

import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;

public class Address implements Task {
    private String city;
    private String zipCode;
    private String country;

    public Address(String city, String zipCode, String country) {
        this.city = city;
        this.zipCode = zipCode;
        this.country = country;
    }

    public static Address fillInfo(UserData userData) {
        return Tasks.instrumented(
                Address.class,
                userData.getCity(),
                userData.getZipCode(),
                userData.getCountry());
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Enter.theValue(city).into(AddressPage.INPUT_CITY),
                Hit.the(Keys.ARROW_DOWN).into(AddressPage.INPUT_CITY),
                Hit.the(Keys.ENTER).into(AddressPage.INPUT_CITY),
                Enter.theValue(zipCode).into(AddressPage.INPUT_ZIP_CODE),
                Click.on(AddressPage.BOX_COUNTRY),
                WaitUntil.the(AddressPage.INPUT_COUNTRY, isVisible()),
                Enter.theValue(country).into(AddressPage.INPUT_COUNTRY),
                Hit.the(Keys.ENTER).into(AddressPage.INPUT_COUNTRY),
                Click.on(AddressPage.BUTTON_NEXT_DEVICES)
        );
    }
}
