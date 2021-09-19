package co.com.linio.test.tasks.RegistroUsuario;

import co.com.linio.test.userinterfaces.RegistroUsuario.PaginaPrincipalPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;

public class IconoIniciarSesionTask implements Task {

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(PaginaPrincipalPage.SPN_ICONO_INICIARSESION));
    }

    public static IconoIniciarSesionTask clicIcono(){
        return Tasks.instrumented(IconoIniciarSesionTask.class);
    }
}
