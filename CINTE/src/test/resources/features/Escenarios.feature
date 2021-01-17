#Author: jppb0308@gmail.com

@tag
Feature: Escenarios a automatizar

  @tag1
  Scenario: Creacion de Usuario
    Given Ingreso a la plataforma
    And Ingreso mis credecenciales
    When Doy clic en el boton de ingreso
    Then Se valida el ingreso a la plataforma
    
  @tag2
  Scenario: Validacion de lista de favoritos
    Given Ingreso a la plataforma
    And Busco la lista de favoritos
    When Consulto los items guardados y busquedas recientes
    Then Se valida estar en las opciones de lista de favoritos
    
  @tag3
  Scenario: Validacion de que la plataforma ofrezca servicio de viaje en carro
    Given Ingreso a la plataforma
    And Busco la opcion de carros
    And Se escoge las ciudad de inicio y destino en el carro
    When Doy clic en el boton Search
    Then Se valida estar en el formulario del ofrecimiento de servicio de viaje en carro

  @tag4
  Scenario: Validacion de ofrecimiento de cosas para hacer en una determinada ciudad
    Given Ingreso a la plataforma
    And Busco la opcion de cosas para hacer
    And Se escoge la ciudad buscada
    When Doy clic en el boton Search
    Then Se validan los diferentes planes para hacer en la ciudad buscada

  @tag5
  Scenario: Validacion de busqueda de hoteles desde la plataforma en una determinada ciudad
    Given Ingreso a la plataforma
    And Busco la opcion de hoteles
    And Se escoge la ciudad deseada
    And Se agrega un servicio adicional
    When Doy clic en el boton Search
    Then Se valida el ofrecimiento de hoteles en la ciudad buscada