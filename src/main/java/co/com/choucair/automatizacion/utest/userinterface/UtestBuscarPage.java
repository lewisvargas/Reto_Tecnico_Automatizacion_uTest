package co.com.choucair.automatizacion.utest.userinterface;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class UtestBuscarPage extends PageObject {

    public static final Target BUTTON_AU = Target.the("seleccion la academia utest").located
            (By.xpath("//div[@id= 'academia']//strong"));

    public static final Target COURSE = Target.the("buscar el curso").located(By.id("coursesearchbox"));

    public static final Target BUTTON_GO = Target.the("da click para buscar el curso").located
            (By.id("//button[@class= 'btn btn-secondary']"));

    public static final Target SELECT_COURSE = Target.the("da click para buscar el curso").located
            (By.xpath("//h4[contains(text(), 'Utest Mobile App')]"));

    public static final Target NAME_COURSE = Target.the("extrae el nombre del curso").located
            (By.xpath("//h1[contains(text(), 'Utest Mobile App')]"));
}
