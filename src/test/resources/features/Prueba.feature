#Author: rjdiazzh@gmail.com
Feature: prueba Eduardo Alday Bran

  Scenario: escoger un producto y este es mostrado en el carrito correctamente
    Given Se abre el navegador con la automatizacion
    When  se busca por 'dress' se selecciona y el resultado se muestra en el carrito
    Then  se debe mostrar que el carrito no esta vacio 'null'

    
  Scenario: escoger un producto y este es mostrado en el carrito correctamente2
    Given Se abre el navegador con la automatizacion2
    When  se busca por 'dress' se selecciona y el resultado se muestra en el carrito
    Then  se debe mostrar que el carrito no esta vacio 'null'
    