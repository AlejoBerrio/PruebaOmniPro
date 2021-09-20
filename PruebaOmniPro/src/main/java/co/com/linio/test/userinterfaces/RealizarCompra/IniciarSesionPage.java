package co.com.linio.test.userinterfaces.RealizarCompra;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class IniciarSesionPage {

    public static final Target TXT_IINICIAR_CON_CORREO = Target.the("Iniciar sesión con el correo electrónico")
            .located(By.id("login_form_email"));

    public static final Target TXT_ININICIAR_CON_CONTRASENA = Target.the("Iniciar sesión con la contraseña")
            .located(By.id("login_form_password"));

    public static final Target BTN_INICIAR_SESION = Target.the("Botón de iniciar sesión")
            .located(By.xpath("(//button[contains(@class, 'btn btn-security col-xs-12 col-12')])[1]"));
}
