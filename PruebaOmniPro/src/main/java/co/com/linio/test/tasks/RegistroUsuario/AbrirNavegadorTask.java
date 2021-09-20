package co.com.linio.test.tasks.RegistroUsuario;

import co.com.linio.test.userinterfaces.RegistroUsuario.PaginaPrincipalPage;
import co.com.linio.test.utils.enums.URLEnum;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Open;
import net.serenitybdd.screenplay.conditions.Check;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;
import static net.serenitybdd.screenplay.questions.WebElementQuestion.the;

public class AbrirNavegadorTask implements Task {

    public static Logger LOGGER = LogManager.getLogger(AbrirNavegadorTask.class.getName());


    @Override
    public <T extends Actor> void performAs(T actor) {

        actor.attemptsTo(Open.url(URLEnum.URLBase.getValue()));

        actor.wasAbleTo(
                Check.whether(PaginaPrincipalPage.IMG_TITULO_PAGINA.resolveFor(actor).isVisible()));

        actor.should(seeThat(the(PaginaPrincipalPage.IMG_TITULO_PAGINA), isVisible()));

    }

    public static AbrirNavegadorTask openBrowser() {
        return Tasks.instrumented(AbrirNavegadorTask.class);
    }

}
