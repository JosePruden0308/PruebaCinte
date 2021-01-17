package co.com.proyectobase.screenplay.tasks;

import co.com.proyectobase.screenplay.userinterface.TravelocityHomePage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Open;

public class Abrir implements Task{

	private TravelocityHomePage travelocityHomePage;
	
	@Override
	public <T extends Actor> void performAs(T actor) {
	actor.attemptsTo(Open.browserOn(travelocityHomePage));
	}

	public static Abrir PlataformaTravelocity() {
		
		return Tasks.instrumented(Abrir.class);
	}

}
