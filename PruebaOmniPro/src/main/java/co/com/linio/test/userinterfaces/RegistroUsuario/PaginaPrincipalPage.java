package co.com.linio.test.userinterfaces.RegistroUsuario;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class PaginaPrincipalPage {
    public static final Target IMG_TITULO_PAGINA = Target.the("Titulo de la pagina principal")
            .located(By.xpath("//a[contains(@class,'navbar-brand')]"));

    public static final Target SPN_ICONO_INICIARSESION = Target.the("Clic sobre el icono de iniciar sesiòn")
            .located(By.xpath("//a[contains(@data-dropdown-menu,'user-menu')]"));

    public static final Target LBL_INICIARSESION = Target.the("Hacert clic en el texto de iniciar sesiòn")
            .located(By.xpath("//*[@id=\"user-menu\"]/ul/li[1]/a"));
}


