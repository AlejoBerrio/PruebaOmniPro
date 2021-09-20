package co.com.linio.test.questions.RealizarRegistro;

import co.com.linio.test.userinterfaces.RegistroUsuario.PaginaRegistroPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;

import static net.serenitybdd.screenplay.questions.WebElementQuestion.the;

public class ValidarRegistroQuestion implements Question <Boolean> {

    @Override
    public Boolean answeredBy(Actor actor) {
        return the(PaginaRegistroPage.LBL_MENSAJE_BIEVENIDA).answeredBy(actor).isPresent();
    }

    public static ValidarRegistroQuestion linio(){
        return new ValidarRegistroQuestion();
    }
}
