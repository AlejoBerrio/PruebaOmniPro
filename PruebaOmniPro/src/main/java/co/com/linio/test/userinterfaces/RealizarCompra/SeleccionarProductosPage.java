package co.com.linio.test.userinterfaces.RealizarCompra;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class SeleccionarProductosPage {
    public static final Target INP_BUSCAR_PRODUCTO = Target.the("Realizar busqueda de producto")
        .located(By.xpath("(//input[contains(@name, 'q')])[2]"));

    public static final Target BTN_BUSCAR_PRODUCTO = Target.the("Clic para buscar Producto")
            .located(By.xpath("//button[contains(@class, 'btn btn-primary btn-search')]"));

    public static final Target SELECCIONAR_PRODUCTO = Target.the("Seleccionar producto")
            .located(By.xpath("//*[@id=\"catalogue-product-container\"]/div[3]/a[1]"));

    public static final Target BTN_AGREGAR_AL_CARRITO = Target.the("Botón para agregar al carrito")
            .located(By.xpath("//button[contains(@class, 'buy-now')]"));

    public static final Target BTN_IR_AL_CARRITO = Target.the("Ir a finalizar la compra")
            .located(By.xpath("//a[contains(@class, 'btn btn-sm btn-go-to-cart added-product')]"));

    public static final Target LBL_RESUMEN_PEDIDO = Target.the("Visualizar el resumen del pedido")
            .located(By.xpath("//h3[contains(@class, 'title-summary')]"));

}
