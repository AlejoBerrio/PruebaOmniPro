#language: es
  #autor: Alejandro Berrio - alejo86-12@hotmail.co

Característica: Como comprador por internet
  Yo quiero registrarme en un ecommerce
  Para comprar los productos que desee


  Escenario: Realizar el registro del usuario
    Dado que el usuario ingresa a la pagina de lino
    Cuando quiera ingresar a comprar de ir a la opcion registrar
    Y ingresar los siguientes datos personales
      | nombre | apellido | correo                   | contrasena | cedula     |
      | Andres | Messi    | alejandro.test@prueba.co | 12345678   | 1018265444 |
    Entonces podra ver un mensaje de registro exitoso


