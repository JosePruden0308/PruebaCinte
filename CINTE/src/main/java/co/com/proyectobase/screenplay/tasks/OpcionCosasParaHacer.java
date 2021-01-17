package co.com.proyectobase.screenplay.tasks;

import co.com.proyectobase.screenplay.userinterface.TravelocityHomePage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;

public class OpcionCosasParaHacer implements Task{

	@Override
	public <T extends Actor> void performAs(T actor) {
		actor.attemptsTo(Click.on(TravelocityHomePage.OPCION_THINGS_TO_DO));
	}

	public static OpcionCosasParaHacer ElegirCosasParaHacer() {
		return Tasks.instrumented(OpcionCosasParaHacer.class);
	}

}
