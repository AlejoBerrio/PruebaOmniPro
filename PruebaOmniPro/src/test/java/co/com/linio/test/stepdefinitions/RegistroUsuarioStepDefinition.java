package co.com.linio.test.stepdefinitions;

import co.com.linio.test.exceptions.InternetConnectionException;
import co.com.linio.test.models.DatosUsuario;
import co.com.linio.test.questions.RealizarRegistro.ValidarRegistroQuestion;
import co.com.linio.test.tasks.RegistroUsuario.*;
import co.com.linio.test.utils.CheckInternetConnection;
import co.com.linio.test.utils.enums.URLEnum;
import cucumber.api.java.Before;
import cucumber.api.java.es.Cuando;
import cucumber.api.java.es.Dado;
import cucumber.api.java.es.Entonces;
import net.serenitybdd.screenplay.GivenWhenThen;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;
import net.thucydides.core.annotations.Managed;
import org.openqa.selenium.WebDriver;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;

import static net.serenitybdd.screenplay.actors.OnStage.theActorCalled;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;

public class RegistroUsuarioStepDefinition {

    @Managed(driver="chrome")
    private WebDriver webDriver;

    @Before
    public void setUp() {
        try {
            OnStage.setTheStage(new OnlineCast());
            URL url = new URL(String.valueOf(URLEnum.URLBase.getValue()));
            CheckInternetConnection checkInternetConnection = new CheckInternetConnection(url);
            checkInternetConnection.checkConnection();
        } catch (InternetConnectionException | MalformedURLException e) {
            throw new InternetConnectionException(InternetConnectionException.INTERNET_FAILED);
        }
    }

    @Dado("^que el usuario ingresa a la pagina de lino$")
    public void queElUsuarioIngresaALaPaginaDeLino() {
        theActorCalled("userAutomation").attemptsTo(AbrirNavegadorTask.openBrowser());
    }

    @Cuando("^quiera ingresar a comprar de ir a la opcion registrar$")
    public void quieraIngresarAComprarDeIrALaOpcionRegistrar() {
        theActorCalled("userAutomation").attemptsTo(IconoIniciarSesionTask.clicIcono(),
                SeleccionarIniciarSesionTask.iniciarsesion(), PaginaRegistroTask.crearCuenta());
    }

    @Cuando("^ingresar los siguientes datos personales$")
    public void ingresarLosSiguientesDatosPersonales(List<DatosUsuario> data) {
        theActorInTheSpotlight().attemptsTo(IngresarDatosPersonalesTask.ingresarDatos(data));

    }

    @Entonces("^podra ver un mensaje de registro exitoso$")
    public void podraVerUnMensajeDeRegistroExitoso() {
        theActorInTheSpotlight().should(GivenWhenThen.seeThat(ValidarRegistroQuestion.linio()));
    }
}
