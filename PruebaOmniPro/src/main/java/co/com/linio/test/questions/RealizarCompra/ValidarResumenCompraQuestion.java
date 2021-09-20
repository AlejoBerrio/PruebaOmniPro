package co.com.linio.test.questions.RealizarCompra;

import co.com.linio.test.userinterfaces.RealizarCompra.SeleccionarProductosPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;

import static net.serenitybdd.screenplay.questions.WebElementQuestion.the;

public class ValidarResumenCompraQuestion implements Question<Boolean> {

    @Override
    public Boolean answeredBy(Actor actor) {
        return the(SeleccionarProductosPage.LBL_RESUMEN_PEDIDO).answeredBy(actor).isPresent();
    }

    public static ValidarResumenCompraQuestion producto(){
        return new ValidarResumenCompraQuestion();
    }
}
