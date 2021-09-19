package co.com.linio.test.tasks.RealizarCompra;

import co.com.linio.test.models.DatosUsuario;
import co.com.linio.test.userinterfaces.RealizarCompra.IniciarSesionPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

import java.util.List;

public class IniciarSesionTask implements Task {

    private List<DatosUsuario> datosUsuarios;

    public IniciarSesionTask(List<DatosUsuario> datosUsuarios) {
        this.datosUsuarios = datosUsuarios;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Enter.theValue(datosUsuarios.get(0).getCorreo()).into(IniciarSesionPage.TXT_IINICIAR_CON_CORREO),
                Enter.theValue(datosUsuarios.get(0).getContrasena()).into(IniciarSesionPage.TXT_ININICIAR_CON_CONTRASENA),
                Click.on(IniciarSesionPage.BTN_INICIAR_SESION)
        );
    }

    public static Performable ingresar (List<DatosUsuario> datosUsuarios){
        return Tasks.instrumented (IniciarSesionTask.class, datosUsuarios);
    }
}
