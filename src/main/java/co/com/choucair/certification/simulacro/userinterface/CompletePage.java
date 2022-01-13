package co.com.choucair.certification.simulacro.userinterface;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class CompletePage {

    public static final Target INPUT_PASSWORD = Target
            .the("password input")
            .located(By.id("password"));

    public static final Target INPUT_CONFIRM_PASSWORD = Target
            .the("confirm password input")
            .located(By.id("confirmPassword"));

    public static final Target CHECKBOX_STAY_INFORMED = Target
            .the("stay informed checkbox")
            .located(By.name("newsletterOptIn"));

    public static final Target CHECKBOX_TERMS_USE = Target
            .the("terms use checkbox")
            .located(By.id("termOfUse"));

    public static final Target CHECKBOX_SECURITY_POLICY = Target
            .the("security policy checkbox")
            .located(By.id("privacySetting"));

    /*
    public static final Target BUTTON_COMPLETE_SETUP = Target
            .the("complete setup button")
            .located(By.xpath("//a[@id='laddaBtn']//span[contains(text(), 'Complete Setup')]"));
    */
    public static final Target MESSAGE_FINAL = Target
            .the("final message")
            .located(By.xpath("//h1[@class='step-title']//span[contains(text(),'The last step')]"));

}
