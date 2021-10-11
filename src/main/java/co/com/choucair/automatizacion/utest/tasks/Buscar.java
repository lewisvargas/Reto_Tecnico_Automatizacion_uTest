package co.com.choucair.automatizacion.utest.tasks;

import co.com.choucair.automatizacion.utest.userinterface.UtestBuscarPage;
import co.com.choucair.automatizacion.utest.userinterface.UtestSesionPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

public class Buscar implements Task {

    private String course;

    public Buscar(String course) {
        this.course = course;
    }

    public static Buscar the(String course) {
        return Tasks.instrumented(Buscar.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Click.on(UtestBuscarPage.BUTTON_AU),
                Enter.theValue(course).into(UtestBuscarPage.COURSE),
                Click.on(UtestBuscarPage.BUTTON_GO),
                Click.on(UtestBuscarPage.SELECT_COURSE)
        );
    }
}
