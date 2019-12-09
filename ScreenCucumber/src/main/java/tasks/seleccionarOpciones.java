package tasks;

import interfaces.menuPrincipal;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;



public class seleccionarOpciones implements Task{
	
menuPrincipal paginabusqueda;



	@Override
	public <T extends Actor> void performAs(T actor) {
      actor.attemptsTo(
      		Click.on(menuPrincipal.OPCIONSERVICIO),
      		Click.on(menuPrincipal.OPCIONCOMUNIDAD),
      		Click.on(menuPrincipal.OPCIONEMPLEO)
			  );

	}
	public static seleccionarOpciones menu() {
		return Tasks.instrumented(seleccionarOpciones.class);
}
}
