package co.com.proyectobase.screenplay.questions;

import co.com.proyectobase.screenplay.userinterface.TravelocityHomePage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;

public class LaRespuestaCarro implements Question<String>{

public static Question es() {
		
		return new LaRespuestaCarro();
	}

	@Override
	public String answeredBy(Actor actor) {
		return Text.of(TravelocityHomePage.VALIDACION_VIAJE_CARROS).viewedBy(actor).asString();
	}

}
