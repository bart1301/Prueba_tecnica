package tasks;

import interfaces.menuPrincipal;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Open;

public class abrirPagina implements Task{
	
	menuPrincipal paginabusqueda;

	
	@Override
	public <T extends Actor> void performAs(T actor) {
		
		actor.attemptsTo(
				Open.browserOn(paginabusqueda)
	        );
	}
	
	public static abrirPagina abrirpagina() {
		return Tasks.instrumented(abrirPagina.class);
	}

}
