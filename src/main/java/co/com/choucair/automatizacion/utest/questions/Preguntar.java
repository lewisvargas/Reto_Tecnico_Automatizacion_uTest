package co.com.choucair.automatizacion.utest.questions;

import co.com.choucair.automatizacion.utest.userinterface.UtestBuscarPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;

public class Preguntar implements Question<Boolean> {

    private String question;

    public Preguntar(String question) {
        this.question = question;
    }

    public static Preguntar toThe(String question) {
        return new Preguntar(question);
    }

    @Override
    public Boolean answeredBy(Actor actor) {
        boolean resulted;

        String nameCourse= Text.of(UtestBuscarPage.NAME_COURSE).viewedBy(actor).asString();
        if (question.equals(nameCourse)){
            resulted = true;
        }else {
            resulted = false;
        }
        return resulted;
    }
}
