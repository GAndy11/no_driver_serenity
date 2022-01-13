package co.com.choucair.certification.simulacro.userinterface;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class PersonalPage {

    public static final Target INPUT_FIRST_NAME = Target
            .the("first name input")
            .located(By.id("firstName"));

    public static final Target INPUT_LAST_NAME = Target
            .the("last name input")
            .located(By.id("lastName"));

    public static final Target INPUT_EMAIL = Target
            .the("email input")
            .located(By.id("email"));

    public static final Target INPUT_BIRTH_MONTH = Target
            .the("birth month input")
            .located(By.id("birthMonth"));

    public static final Target INPUT_BIRTH_DAY = Target
            .the("birth day input")
            .located(By.id("birthDay"));

    public static final Target INPUT_BIRTH_YEAR = Target
            .the("birth year input")
            .located(By.id("birthYear"));

    public static final Target BUTTON_NEXT_LOCATIONS = Target
            .the("next locations button")
            .located(By.xpath("//*[@id=\"regs_container\"]/div/div[2]/div/div[2]/div/form/div[2]/a"));
}
