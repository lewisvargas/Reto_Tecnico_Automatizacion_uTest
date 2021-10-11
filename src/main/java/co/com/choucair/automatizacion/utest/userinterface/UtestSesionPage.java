package co.com.choucair.automatizacion.utest.userinterface;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class UtestSesionPage extends PageObject {

    public static final Target LOGIN = Target.the("button that shows us the form to login").located
            (By.xpath("//div[@class= 'd-none d-lg-block']//strong[contains(text(), 'Ingresar')]"));

    public static final Target USER = Target.the("where do we write the user").located(By.id("username"));

    public static final Target PASSWORD = Target.the("where do we write password").located(By.id("password"));

    public static final Target ENTER = Target.the("button to confirm login").located
            (By.xpath("//button[contains(@class, 'btn btn-primary')]"));
}
