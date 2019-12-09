package interfaces;
import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import net.thucydides.core.annotations.DefaultUrl;


@DefaultUrl("https://www.choucairtesting.com/")
public class menuPrincipal extends PageObject {
	public static final Target OPCIONSERVICIO = Target.the(" opcion servicio").located(By.xpath("//*[@id=\"menu-item-1876\"]/a"));
	public static final Target OPCIONCOMUNIDAD = Target.the("opcion comunidad").located(By.xpath("//*[@id=\"menu-item-2661\"]/a"));
	public static final Target OPCIONEMPLEO = Target.the("opcion comunidad").located(By.xpath("//*[@id=\"menu-item-550\"]/a"));
	
}
