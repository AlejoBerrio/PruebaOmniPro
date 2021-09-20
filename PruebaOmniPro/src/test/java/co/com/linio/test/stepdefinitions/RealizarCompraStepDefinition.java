package co.com.linio.test.stepdefinitions;

import co.com.linio.test.models.DatosUsuario;
import co.com.linio.test.questions.RealizarCompra.ValidarResumenCompraQuestion;
import co.com.linio.test.questions.RealizarRegistro.ValidarRegistroQuestion;
import co.com.linio.test.tasks.RealizarCompra.IniciarSesionTask;
import co.com.linio.test.tasks.RealizarCompra.SeleccionarProductoTask;
import co.com.linio.test.tasks.RegistroUsuario.IconoIniciarSesionTask;
import co.com.linio.test.tasks.RegistroUsuario.SeleccionarIniciarSesionTask;
import cucumber.api.java.es.Cuando;
import cucumber.api.java.es.Entonces;
import net.serenitybdd.screenplay.GivenWhenThen;

import java.util.List;

import static net.serenitybdd.screenplay.actors.OnStage.theActorCalled;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;

public class RealizarCompraStepDefinition {

    @Cuando("^el usuario se loguee en la pagina con los siguientes datos$")
    public void elUsuarioSeLogueeEnLaPaginaConLosSiguientesDatos(List<DatosUsuario> data) {
        theActorCalled("userAutomation").attemptsTo(IconoIniciarSesionTask.clicIcono(),
                SeleccionarIniciarSesionTask.iniciarsesion(), IniciarSesionTask.ingresar(data));
    }

    @Cuando("^seleccione los productos que desea comprar$")
    public void seleccioneLosProductosQueDeseaComprar(List<DatosUsuario> data) {
        theActorCalled("userAutomation").attemptsTo(SeleccionarProductoTask.buscarProducto(data));
    }

    @Entonces("^podra ver el valor a pagar en su carrito de compras$")
    public void podraVerElValorAPagarEnSuCarritoDeCompras() {
        theActorInTheSpotlight().should(GivenWhenThen.seeThat(ValidarResumenCompraQuestion.producto()));
    }
}
