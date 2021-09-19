package co.com.linio.test.runners;

import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
        features = {"src/test/resources/co.com.linio.test/features/registro_usuario_linio.feature"},
        glue="co.com.linio.test.stepdefinitions",
        snippets = SnippetType.CAMELCASE)

public class RegistroUsuarioRunner {
}
