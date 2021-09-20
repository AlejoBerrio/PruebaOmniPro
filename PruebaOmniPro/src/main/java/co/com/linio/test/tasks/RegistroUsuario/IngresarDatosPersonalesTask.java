package co.com.linio.test.tasks.RegistroUsuario;

import co.com.linio.test.interactions.Esperar;
import co.com.linio.test.models.DatosUsuario;
import co.com.linio.test.userinterfaces.RegistroUsuario.PaginaRegistroPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

import java.util.List;

public class IngresarDatosPersonalesTask implements Task {

    private List<DatosUsuario> datosUsuarios;

    public IngresarDatosPersonalesTask(List<DatosUsuario> datosUsuarios) {
        this.datosUsuarios = datosUsuarios;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Enter.theValue(datosUsuarios.get(0).getNombre()).into(PaginaRegistroPage.TXT_INGRESAR_NOMBNRE),
                Enter.theValue(datosUsuarios.get(0).getApellido()).into(PaginaRegistroPage.TXT_INGRESAR_APELLIDO),
                Enter.theValue(datosUsuarios.get(0).getCorreo()).into(PaginaRegistroPage.TXT_INGRESAR_CORREO),
                Enter.theValue(datosUsuarios.get(0).getContrasena()).into(PaginaRegistroPage.TXT_INGRESAR_CONTRASENA),
                Enter.theValue(datosUsuarios.get(0).getCedula()).into(PaginaRegistroPage.TXT_INGRESAR_CEDULA),
                (Esperar.unTiempo(3000)),
                Click.on(PaginaRegistroPage.CHECK_ACEPTAR_TERMINOS),
                Click.on(PaginaRegistroPage.BTN_COMPLETAR_REGISTRO)
        );
    }

    public static Performable ingresarDatos (List<DatosUsuario> datosUsuarios){
        return Tasks.instrumented(IngresarDatosPersonalesTask.class, datosUsuarios);
    }
}
