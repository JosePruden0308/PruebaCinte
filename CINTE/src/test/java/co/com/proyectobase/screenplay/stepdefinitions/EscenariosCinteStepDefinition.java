package co.com.proyectobase.screenplay.stepdefinitions;

import org.hamcrest.Matchers;
import org.openqa.selenium.WebDriver;
import co.com.proyectobase.screenplay.questions.LaRespuesta;
import co.com.proyectobase.screenplay.questions.LaRespuestaBusquedaHotel;
import co.com.proyectobase.screenplay.questions.LaRespuestaCarro;
import co.com.proyectobase.screenplay.questions.LaRespuestaPlan;
import co.com.proyectobase.screenplay.tasks.Abrir;
import co.com.proyectobase.screenplay.tasks.BuscarCiudadCosasParaHacer;
import co.com.proyectobase.screenplay.tasks.BusquedaViajeCarros;
import co.com.proyectobase.screenplay.tasks.Ciudades;
import co.com.proyectobase.screenplay.tasks.ConfirmarIngreso;
import co.com.proyectobase.screenplay.tasks.Hoteles;
import co.com.proyectobase.screenplay.tasks.Ingresar;
import co.com.proyectobase.screenplay.tasks.IngresarListaCredenciales;
import co.com.proyectobase.screenplay.tasks.OpcionCarro;
import co.com.proyectobase.screenplay.tasks.OpcionCosasParaHacer;
import co.com.proyectobase.screenplay.tasks.Recogidas;
import co.com.proyectobase.screenplay.tasks.ServicioAdicional;
import co.com.proyectobase.screenplay.tasks.VerificarItems;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.GivenWhenThen;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.thucydides.core.annotations.Managed;

public class EscenariosCinteStepDefinition {
	
	@Managed(driver="chrome")
	private WebDriver hisBrowser;
	private Actor Jose=Actor.named("Jose");
	
	@Before
	public void configuracionInicial() {
		Jose.can(BrowseTheWeb.with(hisBrowser));
	}
	
	
	//Pasos globales
	
	@Given("^Ingreso a la plataforma$")
	public void ingreso_a_la_plataforma() throws Exception {
		Jose.wasAbleTo(Abrir.PlataformaTravelocity());
	}
	
	@When("^Doy clic en el boton Search$")
	public void doy_clic_en_el_boton_Search() throws Exception {
		Jose.attemptsTo(BusquedaViajeCarros.Buscar());
	}

	//Pasos exclusivos del escenario 1
	
	@Given("^Ingreso mis credecenciales$")
	public void ingreso_mis_credecenciales() throws Exception {
		Jose.attemptsTo(Ingresar.Credenciales());
	}

	@When("^Doy clic en el boton de ingreso$")
	public void doy_clic_en_el_boton_de_ingreso() throws Exception {
		Jose.attemptsTo(ConfirmarIngreso.Confirmacion());
	}

	@Then("^Se valida el ingreso a la plataforma$")
	public void se_valida_el_ingreso_a_la_plataforma() throws Exception {

	}
	
	
	//Pasos exclusivos del escenario 2
	
	@Given("^Busco la lista de favoritos$")
	public void busco_la_lista_de_favoritos() throws Exception {
		Jose.attemptsTo(IngresarListaCredenciales.ListaCredenciales());
	}


	@When("^Consulto los items guardados y busquedas recientes$")
	public void consulto_los_items_guardados_y_busquedas_recientes() throws Exception {
		Jose.attemptsTo(VerificarItems.Items());
	}

	@Then("^Se valida estar en las opciones de lista de favoritos$")
	public void se_valida_estar_en_las_opciones_de_lista_de_favoritos() throws Exception {
		Jose.should(GivenWhenThen.seeThat(LaRespuesta.es(), Matchers.equalTo("All Saved Items")));
	}
	
	
	//Pasos exclusivos del escenario 3
	
	@Given("^Busco la opcion de carros$")
	public void busco_la_opcion_de_carros() throws Exception {
		Jose.attemptsTo(OpcionCarro.ElegirOpcionCarro());
	}

	@Given("^Se escoge las ciudad de inicio y destino en el carro$")
	public void se_escoge_las_ciudad_de_inicio_y_destino_en_el_carro() throws Exception {
		Jose.attemptsTo(Recogidas.ElegirRecogidas());
	}

	

	@Then("^Se valida estar en el formulario del ofrecimiento de servicio de viaje en carro$")
	public void se_valida_estar_en_el_formulario_del_ofrecimiento_de_servicio_de_viaje_en_carro() throws Exception {
		Jose.should(GivenWhenThen.seeThat(LaRespuestaCarro.es(), Matchers.equalTo("Car rental companies charge this when drop-off and pick-up locations differ.")));
	}


	//Pasos exclusivos del escenario 4
	
	@Given("^Busco la opcion de cosas para hacer$")
	public void busco_la_opcion_de_cosas_para_hacer() throws Exception {
		Jose.attemptsTo(OpcionCosasParaHacer.ElegirCosasParaHacer());
	}

	@Given("^Se escoge la ciudad buscada$")
	public void se_escoge_la_ciudad_buscada() throws Exception {
		Jose.attemptsTo(BuscarCiudadCosasParaHacer.ElegirCiudadCosasParaHacer());
	}

	@Then("^Se validan los diferentes planes para hacer en la ciudad buscada$")
	public void se_validan_los_diferentes_planes_para_hacer_en_la_ciudad_buscada() throws Exception {
		Jose.should(GivenWhenThen.seeThat(LaRespuestaPlan.es(), Matchers.equalTo("The Magic and Ancestral Guajira-Cabo de la vela & Punta Gallinas-2 nights 3...")));
	}
	
	
	//Pasos exclusivos del escenario 5
	
	@Given("^Busco la opcion de hoteles$")
	public void busco_la_opcion_de_hoteles() throws Exception {
		Jose.attemptsTo(Hoteles.BuscarHotel());
	}


	@Given("^Se escoge la ciudad deseada$")
	public void se_escoge_la_ciudad_deseada() throws Exception {
		Jose.attemptsTo(Ciudades.EscogerHotelCiudad());
	}

	@Given("^Se agrega un servicio adicional$")
	public void se_agrega_un_servicio_adicional() throws Exception {
		Jose.attemptsTo(ServicioAdicional.EscogerServicio());
	}

	@Then("^Se valida el ofrecimiento de hoteles en la ciudad buscada$")
	public void se_valida_el_ofrecimiento_de_hoteles_en_la_ciudad_buscada() throws Exception {
		Jose.should(GivenWhenThen.seeThat(LaRespuestaBusquedaHotel.es(), Matchers.equalTo("We recommend booking a stay with free cancellation in case your plans change.")));
	}
}