package co.com.choucair.automatizacion.utest.tasks;

import co.com.choucair.automatizacion.utest.userinterface.UtestSesionPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

public class Sesion implements Task {

    private String strUser;
    private String strPassword;

    public Sesion(String strUser, String strPassword) {
        this.strUser = strUser;
        this.strPassword = strPassword;
    }

    public static Sesion OnThePage(String strUser, String strPassword) {

        return Tasks.instrumented(Sesion.class, strUser, strPassword);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Click.on(UtestSesionPage.LOGIN),
                Enter.theValue(strUser).into(UtestSesionPage.USER),
                Enter.theValue(strPassword).into(UtestSesionPage.PASSWORD),
                Click.on(UtestSesionPage.ENTER)
        );
    }
}
