package co.com.choucair.certification.simulacro.userinterface;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class AddressPage {

    public static final Target INPUT_CITY = Target
            .the("city input")
            .located(By.id("city"));

    public static final Target INPUT_ZIP_CODE = Target
            .the("zip code input")
            .located(By.id("zip"));

    public static final Target BOX_COUNTRY = Target
            .the("country box")
            .located(By.xpath("//*[@id=\"regs_container\"]/div/div[2]/div/div[2]/div/form/div[1]/div[3]/div[1]/div[4]/div[2]"));

    public static final Target INPUT_COUNTRY = Target
            .the("country input")
            .located(By.xpath("//*[@id=\"regs_container\"]/div/div[2]/div/div[2]/div/form/div[1]/div[3]/div[1]/div[4]/div[2]/div/div/input[1]"));

    public static final Target BUTTON_NEXT_DEVICES = Target
            .the("next devices button")
            .located(By.xpath("//*[@id=\"regs_container\"]/div/div[2]/div/div[2]/div/form/div[2]/div"));
}
