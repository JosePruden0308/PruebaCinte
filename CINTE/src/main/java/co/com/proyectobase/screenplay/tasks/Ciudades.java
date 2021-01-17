package co.com.proyectobase.screenplay.tasks;

import co.com.proyectobase.screenplay.userinterface.TravelocityHomePage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

public class Ciudades implements Task{

	@Override
	public <T extends Actor> void performAs(T actor) {
		actor.attemptsTo(Enter.theValue("Cartagena (CTG - Rafael Nunez Intl.)").into(TravelocityHomePage.CIUDAD_HOTEL));
		actor.attemptsTo(Click.on(TravelocityHomePage.SELECCIONAR_CIUDAD));
		
	}

	public static Ciudades EscogerHotelCiudad() {
		return Tasks.instrumented(Ciudades.class);
	}

}
