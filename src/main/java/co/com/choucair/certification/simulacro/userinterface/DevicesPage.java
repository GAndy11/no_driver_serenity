package co.com.choucair.certification.simulacro.userinterface;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class DevicesPage {

    public static final Target BOX_COMPUTER = Target
            .the("computer box")
            .located(By.xpath("//*[@id=\"web-device\"]/div[1]/div[2]"));

    public static final Target INPUT_COMPUTER = Target
            .the("computer input")
            .located(By.xpath("//*[@id=\"web-device\"]/div[1]/div[2]/div/input[1]"));

    public static final Target BOX_COMPUTER_VERSION = Target
            .the("computer version box")
            .located(By.xpath("//*[@id=\"web-device\"]/div[2]/div[2]"));

    public static final Target INPUT_COMPUTER_VERSION = Target
            .the("computer version input")
            .located(By.xpath("//*[@id=\"web-device\"]/div[2]/div[2]/div/input[1]"));

    public static final Target BOX_COMPUTER_LANGUAGE = Target
            .the("computer language box")
            .located(By.xpath("//*[@id=\"web-device\"]/div[3]/div[2]"));

    public static final Target INPUT_COMPUTER_LANGUAGE = Target
            .the("computer language input")
            .located(By.xpath("//*[@id=\"web-device\"]/div[3]/div[2]/div/input[1]"));


    public static final Target BOX_MOBILE_DEVICE = Target
            .the("mobile device box")
            .located(By.xpath("//*[@id=\"mobile-device\"]/div[1]/div[2]"));

    public static final Target INPUT_MOBILE_DEVICE = Target
            .the("mobile device input")
            .located(By.xpath("//*[@id=\"mobile-device\"]/div[1]/div[2]/div/input[1]"));

    public static final Target BOX_MOBILE_DEVICE_MODEL = Target
            .the("mobile device model box")
            .located(By.xpath("//*[@id=\"mobile-device\"]/div[2]/div[2]"));

    public static final Target INPUT_MOBILE_DEVICE_MODEL = Target
            .the("mobile device model input")
            .located(By.xpath("//*[@id=\"mobile-device\"]/div[2]/div[2]/div/input[1]"));

    public static final Target BOX_MOBILE_DEVICE_OS = Target
            .the("mobile device os box")
            .located(By.xpath("//*[@id=\"mobile-device\"]/div[3]/div[2]"));

    public static final Target INPUT_MOBILE_DEVICE_OS = Target
            .the("mobile device os input")
            .located(By.xpath("//*[@id=\"mobile-device\"]/div[3]/div[2]/div/input[1]"));

    public static final Target BUTTON_LAST_STEP = Target
            .the("last step button")
            .located(By.xpath("//*[@id=\"regs_container\"]/div/div[2]/div/div[2]/div/div[2]/div"));


}
