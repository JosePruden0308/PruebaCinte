package co.com.proyectobase.screenplay.userinterface;

import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import net.thucydides.core.annotations.DefaultUrl;

@DefaultUrl("https://www.travelocity.com")
public class TravelocityHomePage extends PageObject{
	
	public static final Target BOTON_SIGN_IN = Target.the("Boton para iniciar autenticacion").
			located(By.xpath("//div[contains(text(),'Sign in')]"));
	
	public static final Target BOTON_SIGN_IN2 = Target.the("Boton para diligenciar datos").
			located(By.xpath("//a[contains(text(),'Sign in')]"));
	
	public static final Target OPCION_USERNAME = Target.the("Opcion para ingresar usuario").
			located(By.xpath("//input[@id='signin-loginid']"));
	
	public static final Target OPCION_PASSWORD = Target.the("Opcion para ingresar password").
			located(By.xpath("//input[@id='signin-password']"));
	
	public static final Target BOTON_SIGN_IN3 = Target.the("Boton para autenticacion").
			located(By.xpath("//button[@id='submitButton']"));
	
	public static final Target LIST_OF_FAVORITES = Target.the("Opcion para lista de favoritos").
			located(By.xpath("//div[contains(text(),'List of favorites')]"));
	
	public static final Target RECENT_SEARCHES = Target.the("Opcion para busquedas recientes").
			located(By.xpath("//span[contains(text(),'Recent Searches')]"));
	
	public static final Target ALL_SAVED_ITEMS = Target.the("Opcion para todos los elementos guardados").
			located(By.xpath("//span[contains(text(),'All Saved Items')]"));
	
	public static final Target OPCION_CARS = Target.the("Opcion validar servicio de viajes en carro").
			located(By.xpath("//span[@class='uitk-tab-text' and contains(text(),'Cars')]"));
	
	public static final Target PICK_UP = Target.the("Opcion para validar recogida en ciudad de partida").
			located(By.xpath("//button[@class='uitk-faux-input' and @aria-label='Pick-up']"));
	
	public static final Target SAME_AS_PICK_UP = Target.the("Opcion para validar recogida en ciudad de devuelta").
			located(By.xpath("//button[@class='uitk-faux-input' and @aria-label='Same as pick-up']"));
	
	public static final Target CIUDAD_PICK_UP = Target.the("Opcion para escribir la ciudad de origen").
			located(By.xpath("//input[@id='location-field-locn']"));
	
	public static final Target CIUDAD_SAME_AS_PICK_UP = Target.the("Opcion para escribir la ciudad de devuelta").
			located(By.xpath("//input[@id='location-field-loc2']"));
	
	public static final Target SELECCIONAR_CIUDAD_PICK_UP = Target.the("Opcion para seleccionar ciudad de origen").
			located(By.xpath("//button[@class='uitk-button uitk-button-small uitk-button-fullWidth uitk-button-typeahead uitk-type-left has-subtext' and @data-stid='location-field-locn-result-item-button']"));

	public static final Target SELECCIONAR_CIUDAD_SAME_AS_PICK_UP = Target.the("Opcion para seleccionar ciudad de devuelta").
			located(By.xpath("//button[@class='uitk-button uitk-button-small uitk-button-fullWidth uitk-button-typeahead uitk-type-left has-subtext' and @data-stid='location-field-loc2-result-item-button']"));
	
	public static final Target BOTON_SEARCH = Target.the("Boton para hacer busqueda de viaje en carro").
			located(By.xpath("//button[contains(text(),'Search')]"));
	
	public static final Target VALIDACION_VIAJE_CARROS = Target.the("Opcion para validar formulario de viajes en carro").
			located(By.xpath("//div[contains(text(),'Car rental companies charge this when drop-off and pick-up locations differ.')]"));
	
	public static final Target OPCION_THINGS_TO_DO = Target.the("Opcion para validar formulario de cosas para hacer en una determinada ciudad").
			located(By.xpath("//span[contains(text(),'Things to do') and @class='uitk-tab-text']"));
	
	public static final Target BUSCAR_CIUDAD_THINGS_TO_DO = Target.the("Opcion para buscar ciudad de cosas para hacer").
			located(By.xpath("//button[@class='uitk-faux-input']"));
	
	public static final Target CAMPO_BUSCAR_THINGS_TO_DO = Target.the("Opcion para escribir la ciudad de cosas para hacer").
			located(By.xpath("//input[@id='location-field-location']"));

	public static final Target SELECCIONAR_CIUDAD_THINGS_TO_DO = Target.the("Se selecciona la ciudad de cosas para hacer").
			located(By.xpath("//div[@class='uitk-typeahead-button-label uitk-type-medium uitk-type-300 truncate']/div/span/strong[contains(text(),'Riohacha')]"));
	
	public static final Target ESCOGER_PLAN_CIUDAD_THINGS_TO_DO = Target.the("Se selecciona la ciudad de cosas para hacer").
			located(By.xpath("//h3[contains(text(),'The Magic and Ancestral Guajira-Cabo de la vela & Punta Gallinas-2 nights 3...') and @class='custom-wrap-text overflow-wrap uitk-type-heading-500 uitk-type-bold all-b-margin-two truncate ']"));
	
	public static final Target HOTELS = Target.the("Opcion para entrar a la seccion de hoteles").
			located(By.xpath("//a[@class='uitk-tab-anchor']//span[contains(text(),'Hotels')]"));
	
	public static final Target GOING_TO = Target.the("Opcion para buscar opciones de hoteles en diferentes ciudades").
			located(By.xpath("//button[@class='uitk-faux-input' and @aria-label='Going to']"));
	
	public static final Target CIUDAD_HOTEL = Target.the("Opcion para escribir la ciudad a buscar").
			located(By.xpath("//input[@id='location-field-destination']"));
	
	public static final Target SELECCIONAR_CIUDAD = Target.the("Opcion para seleccionar la ciudad buscada").
			located(By.xpath("//button[@class='uitk-button uitk-button-small uitk-button-fullWidth uitk-button-typeahead uitk-type-left has-subtext']"));

	public static final Target SERVICIO_ADICIONAL = Target.the("Opcion para seleccionar la ciudad buscada").
			located(By.xpath("//input[@id='add-car-switch']"));
	
	public static final Target VALIDACION_FORMULARIO_BUSQUEDA_HOTEL = Target.the("Opcion para seleccionar la ciudad buscada").
			located(By.xpath("//div[contains(text(),'We recommend booking a stay with free cancellation in case your plans change.')]"));


}