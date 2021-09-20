package co.com.linio.test.tasks.RegistroUsuario;

import co.com.linio.test.userinterfaces.RegistroUsuario.PaginaPrincipalPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.conditions.Check;

public class SeleccionarIniciarSesionTask implements Task {
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.wasAbleTo(
                Check.whether(PaginaPrincipalPage.LBL_INICIARSESION.resolveFor(actor).isVisible()));
        actor.attemptsTo(
                Click.on(PaginaPrincipalPage.LBL_INICIARSESION)
        );
    }

    public static SeleccionarIniciarSesionTask iniciarsesion(){
        return Tasks.instrumented(SeleccionarIniciarSesionTask.class);
    }
}
