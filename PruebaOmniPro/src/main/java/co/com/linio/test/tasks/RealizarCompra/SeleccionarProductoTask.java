package co.com.linio.test.tasks.RealizarCompra;

import co.com.linio.test.interactions.Esperar;
import co.com.linio.test.models.DatosUsuario;
import co.com.linio.test.userinterfaces.RealizarCompra.SeleccionarProductosPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

import java.util.List;

public class SeleccionarProductoTask implements Task {

    private List<DatosUsuario> datosUsuarios;

    public SeleccionarProductoTask(List<DatosUsuario> datosUsuarios) {
        this.datosUsuarios = datosUsuarios;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Enter.theValue(datosUsuarios.get(0).getProducto()).into(SeleccionarProductosPage.INP_BUSCAR_PRODUCTO),
                Click.on(SeleccionarProductosPage.BTN_BUSCAR_PRODUCTO),
                Click.on(SeleccionarProductosPage.SELECCIONAR_PRODUCTO),
                Click.on(SeleccionarProductosPage.BTN_AGREGAR_AL_CARRITO),
                Esperar.unTiempo(3000),
                Click.on(SeleccionarProductosPage.BTN_IR_AL_CARRITO)
        );

    }

    public static Performable buscarProducto (List<DatosUsuario> datosUsuarios){
        return Tasks.instrumented(SeleccionarProductoTask.class, datosUsuarios);
    }
}
