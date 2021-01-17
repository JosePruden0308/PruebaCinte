package co.com.proyectobase.screenplay.tasks;

import co.com.proyectobase.screenplay.userinterface.TravelocityHomePage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

public class BuscarCiudadCosasParaHacer implements Task{

	@Override
	public <T extends Actor> void performAs(T actor) {
		actor.attemptsTo(Click.on(TravelocityHomePage.BUSCAR_CIUDAD_THINGS_TO_DO));
		actor.attemptsTo(Enter.theValue("Riohacha").into(TravelocityHomePage.CAMPO_BUSCAR_THINGS_TO_DO));
		actor.attemptsTo(Click.on(TravelocityHomePage.SELECCIONAR_CIUDAD_THINGS_TO_DO));
	}

	public static BuscarCiudadCosasParaHacer ElegirCiudadCosasParaHacer() {
		return Tasks.instrumented(BuscarCiudadCosasParaHacer.class);
	}

}