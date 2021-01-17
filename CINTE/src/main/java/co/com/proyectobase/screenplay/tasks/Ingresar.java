package co.com.proyectobase.screenplay.tasks;

import co.com.proyectobase.screenplay.userinterface.TravelocityHomePage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

public class Ingresar implements Task{

	@Override
	public <T extends Actor> void performAs(T actor) {
		actor.attemptsTo(Click.on(TravelocityHomePage.BOTON_SIGN_IN));
		actor.attemptsTo(Click.on(TravelocityHomePage.BOTON_SIGN_IN2));
		actor.attemptsTo(Enter.theValue("jppb0308@gmail.com").into(TravelocityHomePage.OPCION_USERNAME));
		actor.attemptsTo(Enter.theValue("Casa123*").into(TravelocityHomePage.OPCION_PASSWORD));
	}
	
	public static Ingresar Credenciales() {
		return Tasks.instrumented(Ingresar.class);
	}	
}