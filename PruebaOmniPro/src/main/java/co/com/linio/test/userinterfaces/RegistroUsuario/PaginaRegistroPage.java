package co.com.linio.test.userinterfaces.RegistroUsuario;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class PaginaRegistroPage {
    public static final Target LBL_CREAR_CUENTA = Target.the("Hacer clic en la opción de crear cuenta")
            .located(By.xpath("//a[contains (text(), 'Crear cuenta')]"));

    public static final Target TXT_INGRESAR_NOMBNRE = Target.the("Ingresar el nombre del usuario")
            .located(By.id("registration_firstName"));

    public static final Target TXT_INGRESAR_APELLIDO = Target.the("Ingresar el apellidos del usuario")
            .located(By.id("registration_lastName"));

    public static final Target TXT_INGRESAR_CORREO = Target.the("Ingresar el correo electrónico")
            .located(By.id("registration_email"));

    public static final Target TXT_INGRESAR_CONTRASENA = Target.the("Ingresar la contraseña")
            .located(By.id("registration_password"));

    public static final Target TXT_INGRESAR_CEDULA = Target.the("Ingresar el número de cédula")
            .located(By.id("registration_nationalRegistrationNumber"));

    public static final Target CHECK_ACEPTAR_TERMINOS = Target.the("Aceptar términos y condiones")
            .located(By.xpath("(//label[contains(@class, 'form-label col-sm-12')])[2]"));

    public static final Target BTN_COMPLETAR_REGISTRO = Target.the("Botón para finalziar registro")
            .located(By.xpath("(//button[contains(@class, 'btn btn-security col-xs-12 col-12')])[2]"));


    public static final Target LBL_MENSAJE_BIEVENIDA = Target.the("Mensaje de bienvenida")
            .located(By.xpath("//span[contains(@class,'user-welcome body-base-sm')]"));
}
