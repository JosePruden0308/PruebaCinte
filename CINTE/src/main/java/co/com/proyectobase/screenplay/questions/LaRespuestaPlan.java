package co.com.proyectobase.screenplay.questions;

import co.com.proyectobase.screenplay.userinterface.TravelocityHomePage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.questions.Text;

public class LaRespuestaPlan implements Question<String>{
	
	public static Question es() {
		
		return new LaRespuestaPlan();
	}
	
@Override
public String answeredBy(Actor actor) {
	return Text.of(TravelocityHomePage.ESCOGER_PLAN_CIUDAD_THINGS_TO_DO).viewedBy(actor).asString();
}



}
