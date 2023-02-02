@PruebasRegister
Feature: Register

  Background:
    Given el usuario se encuentre en la pagina de Registro
    And las casillas de email y password se encuentran vacias

  Scenario: Error por ambos campos vacios - no validos
    When hago click en el boton Register
    Then mostrara el mensaje "REQUIRED" al costado del boton Register

  Scenario: Error por campo login vacio - no valido
    When escribo "123456789" en el campo password
    And  hago click en el boton Register
    Then mostrara el mensaje "REQUIRED" al costado del boton Register

  Scenario: Error por campo password vacio - no valido
    When escribo el correo "jorl03gmail.com" en el campo email
    And  hago click en el boton Register
    Then mostrara el mensaje "REQUIRED" al costado del boton Register

  Scenario: Correo erroneo - falta del caracter "@"
    When escribo "jorl03gmail.com" en el campo email
    And  escribo "123456789" en el campo password
    And  hago click en el boton Register
    Then mostrara el mensaje "INVALID" al costado del boton Register

  Scenario: Contraseña erronea - menor de 5 caracteres
    When escribo "jorl03@gmail.com" en el campo email
    And  escribo "12" en el campo password
    And  hago click en el boton Register
    Then mostrara el mensaje "INVALID" al costado del boton Register

  Scenario: Contraseña erronea - mayor a 5 caracteres
    When escribo "jorl03@gmail.com" en el campo email
    And  escribo "123456789" en el campo password
    And  hago click en el boton Register
    Then mostrara el mensaje "SAVED" al costado del boton Register

  Scenario Outline: Registro satisfactorio
    When ingresa sus datos en la casillas con su correo "<email>"
    And  ingresa sus datos en la casillas con su contraseña "<password>"
    And  hago click en el boton Register
    Then mostrara el mensaje "SAVED" al costado del boton Register

    Examples:
      |email||password|
      |jose@ramirez.com   ||123456    |
