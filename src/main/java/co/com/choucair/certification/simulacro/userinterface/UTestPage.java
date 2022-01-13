package co.com.choucair.certification.simulacro.userinterface;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import net.thucydides.core.annotations.DefaultUrl;
import org.openqa.selenium.By;

@DefaultUrl("https://www.utest.com/")
public class UTestPage extends PageObject {

    public static final Target BUTTON_JOIN = Target
            .the("join button")
            .located(By.className("unauthenticated-nav-bar__sign-up"));
}
