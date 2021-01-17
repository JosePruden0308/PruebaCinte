package co.com.proyectobase.screenplay.tasks;

import co.com.proyectobase.screenplay.userinterface.TravelocityHomePage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

public class Recogidas implements Task{

	@Override
	public <T extends Actor> void performAs(T actor) {
		actor.attemptsTo(Click.on(TravelocityHomePage.PICK_UP));
		actor.attemptsTo(Enter.theValue("Medellin (MDE - Jose Maria Cordova Intl.)").into(TravelocityHomePage.CIUDAD_PICK_UP));
		actor.attemptsTo(Click.on(TravelocityHomePage.SELECCIONAR_CIUDAD_PICK_UP));
		actor.attemptsTo(Click.on(TravelocityHomePage.SAME_AS_PICK_UP));
		actor.attemptsTo(Enter.theValue("Bogota (BOG - El Dorado Intl.)").into(TravelocityHomePage.CIUDAD_SAME_AS_PICK_UP));
		actor.attemptsTo(Click.on(TravelocityHomePage.SELECCIONAR_CIUDAD_SAME_AS_PICK_UP));
	}

	public static Recogidas ElegirRecogidas() {
		return Tasks.instrumented(Recogidas.class);
	}

}
