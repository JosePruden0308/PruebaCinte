package co.com.proyectobase.screenplay.tasks;

import co.com.proyectobase.screenplay.userinterface.TravelocityHomePage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;

public class VerificarItems implements Task{

	@Override
	public <T extends Actor> void performAs(T actor) {
		actor.attemptsTo(Click.on(TravelocityHomePage.RECENT_SEARCHES));
		actor.attemptsTo(Click.on(TravelocityHomePage.ALL_SAVED_ITEMS));
	}

	public static VerificarItems Items() {
	
		return Tasks.instrumented(VerificarItems.class);
	}

}
