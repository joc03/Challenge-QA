@PruebasLogin
Feature: Login

  Background:
    Given el usuario se encuentre en la pagina de Login
    And   las casillas de email y password se encuentran vacias

  Scenario: Error por ambos campos vacios - no validos
    When hago click en el boton Login
    Then mostrara el mensaje "REQUIRED" al costado del boton Login

  Scenario: correo invalido -  campo login vacio
    When escribo el password "123456789" en el campo password
    And  hago click en el boton Login
    Then mostrara el mensaje "REQUIRED" al costado del boton Login

  Scenario: password invalido -  campo login vacio
    When escribo el correo "jorl03@gmail.com" en el campo email
    And  hago click en el boton Login
    Then mostrara el mensaje "REQUIRED" al costado del boton Login

  Scenario: correo invalido - falta del caracter "@"
    When escribo el correo "jorl03gmail.com" en el campo email
    And  escribo el password '123456789' en el campo password
    And  hago click en el boton Login
    Then mostrara el mensaje "LOGIN INVALID" al costado del boton Login

  Scenario: password invalido - menor de 5 caracteres
    When escribo el correo "jorl03@gmail.com" en el campo email
    And  escribo el password "12" en el campo password
    And  hago click en el boton Login
    Then mostrara el mensaje "LOGIN INVALID" al costado del boton Login

  Scenario: password valido - mayor a 5 caracteres
    When escribo el correo "jorl03@gmail.com" en el campo email
    And  escribo el password "123456789" en el campo password
    And  hago click en el boton Login
    Then mostrara el mensaje "LOGIN VALID" al costado del boton Login

  Scenario Outline: Login satisfactorio
    When ingresa sus datos en la casillas con su email "<email>"
    And  ingresa sus datos en la casillas con su password "<password>"
    And  hago click en el boton Login
    Then mostrara el mensaje "LOGIN VALID" al costado del boton Login

    Examples:
      |email||password|
      |Cuenca   ||12345    |
