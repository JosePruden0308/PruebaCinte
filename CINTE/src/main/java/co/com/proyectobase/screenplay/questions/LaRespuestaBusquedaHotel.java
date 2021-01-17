package co.com.proyectobase.screenplay.questions;

import co.com.proyectobase.screenplay.userinterface.TravelocityHomePage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;

public class LaRespuestaBusquedaHotel implements Question<String>{

	
	public static Question es() {
		
		return new LaRespuestaBusquedaHotel();
	}


	@Override
	public String answeredBy(Actor actor) {
		return Text.of(TravelocityHomePage.VALIDACION_FORMULARIO_BUSQUEDA_HOTEL).viewedBy(actor).asString();
	}

}
