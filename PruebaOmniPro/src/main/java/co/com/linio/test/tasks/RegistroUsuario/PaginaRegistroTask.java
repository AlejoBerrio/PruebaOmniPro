package co.com.linio.test.tasks.RegistroUsuario;

import co.com.linio.test.userinterfaces.RegistroUsuario.PaginaPrincipalPage;
import co.com.linio.test.userinterfaces.RegistroUsuario.PaginaRegistroPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.conditions.Check;

public class PaginaRegistroTask implements Task {

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.wasAbleTo(
                Check.whether(PaginaPrincipalPage.IMG_TITULO_PAGINA.resolveFor(actor).isVisible()));
        actor.attemptsTo(
                Click.on(PaginaRegistroPage.LBL_CREAR_CUENTA)
        );

    }

    public static PaginaRegistroTask crearCuenta(){
      return Tasks.instrumented(PaginaRegistroTask.class);
    }
}
