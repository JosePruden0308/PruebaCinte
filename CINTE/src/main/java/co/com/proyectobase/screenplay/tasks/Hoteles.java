package co.com.proyectobase.screenplay.tasks;

import co.com.proyectobase.screenplay.userinterface.TravelocityHomePage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

public class Hoteles implements Task{

	@Override
	public <T extends Actor> void performAs(T actor) {
		actor.attemptsTo(Click.on(TravelocityHomePage.HOTELS));
		actor.attemptsTo(Click.on(TravelocityHomePage.GOING_TO));
		
		
	}

	public static Hoteles BuscarHotel() {
		
		return Tasks.instrumented(Hoteles.class);
	}

}
