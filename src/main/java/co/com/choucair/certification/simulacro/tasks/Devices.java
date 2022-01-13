package co.com.choucair.certification.simulacro.tasks;

import co.com.choucair.certification.simulacro.model.UserData;
import co.com.choucair.certification.simulacro.userinterface.DevicesPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.Hit;
import net.serenitybdd.screenplay.waits.WaitUntil;
import org.openqa.selenium.Keys;

import java.util.List;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;

public class Devices implements Task {
    private String computerOS;
    private String computerVersion;
    private String computerLanguage;
    private String mobileDevice;
    private String mobileDeviceModel;
    private String mobileDeviceOS;

    public Devices(String computerOS, String computerVersion, String computerLanguage, String mobileDevice, String mobileDeviceModel, String mobileDeviceOS) {
        this.computerOS = computerOS;
        this.computerVersion = computerVersion;
        this.computerLanguage = computerLanguage;
        this.mobileDevice = mobileDevice;
        this.mobileDeviceModel = mobileDeviceModel;
        this.mobileDeviceOS = mobileDeviceOS;
    }

    public static Devices fillInfo(UserData userData) {
        return Tasks.instrumented(
                Devices.class,
                userData.getComputerOS(),
                userData.getComputerVersion(),
                userData.getComputerLanguage(),
                userData.getMobileDevice(),
                userData.getMobileDeviceModel(),
                userData.getMobileDeviceOS());
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(DevicesPage.BOX_COMPUTER),
                WaitUntil.the(DevicesPage.INPUT_COMPUTER, isVisible()),
                Enter.theValue(computerOS).into(DevicesPage.INPUT_COMPUTER),
                Hit.the(Keys.ENTER).into(DevicesPage.INPUT_COMPUTER),

                Click.on(DevicesPage.BOX_COMPUTER_VERSION),
                WaitUntil.the(DevicesPage.INPUT_COMPUTER_VERSION, isVisible()),
                Enter.theValue(computerVersion).into(DevicesPage.INPUT_COMPUTER_VERSION),
                Hit.the(Keys.ENTER).into(DevicesPage.INPUT_COMPUTER_VERSION),

                Click.on(DevicesPage.BOX_COMPUTER_LANGUAGE),
                WaitUntil.the(DevicesPage.INPUT_COMPUTER_LANGUAGE, isVisible()),
                Enter.theValue(computerLanguage).into(DevicesPage.INPUT_COMPUTER_LANGUAGE),
                Hit.the(Keys.ENTER).into(DevicesPage.INPUT_COMPUTER_LANGUAGE),

                Click.on(DevicesPage.BOX_MOBILE_DEVICE),
                WaitUntil.the(DevicesPage.INPUT_MOBILE_DEVICE, isVisible()),
                Enter.theValue(mobileDevice).into(DevicesPage.INPUT_MOBILE_DEVICE),
                Hit.the(Keys.ENTER).into(DevicesPage.INPUT_MOBILE_DEVICE),

                Click.on(DevicesPage.BOX_MOBILE_DEVICE_MODEL),
                WaitUntil.the(DevicesPage.INPUT_MOBILE_DEVICE_MODEL, isVisible()),
                Enter.theValue(mobileDeviceModel).into(DevicesPage.INPUT_MOBILE_DEVICE_MODEL),
                Hit.the(Keys.ENTER).into(DevicesPage.INPUT_MOBILE_DEVICE_MODEL),

                Click.on(DevicesPage.BOX_MOBILE_DEVICE_OS),
                WaitUntil.the(DevicesPage.INPUT_MOBILE_DEVICE_OS, isVisible()),
                Enter.theValue(mobileDeviceOS).into(DevicesPage.INPUT_MOBILE_DEVICE_OS),
                Hit.the(Keys.ENTER).into(DevicesPage.INPUT_MOBILE_DEVICE_OS),

                Click.on(DevicesPage.BUTTON_LAST_STEP)
        );
    }
}
