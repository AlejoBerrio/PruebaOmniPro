#language: es
  #autor: Alejandro Berrio - alejo86-12@hotmail.co

Característica: Como usuario registrado
  Yo quiero ingresar a Linio
  Para realziar compras

  Antecedentes:
    Dado que el usuario ingresa a la pagina de lino

  Escenario: Llenar carrito de compras
    Cuando el usuario se loguee en la pagina con los siguientes datos
      | correo                   | contrasena |
      | alejandro.test@prueba.co | 12345678   |
    Y seleccione los productos que desea comprar
      | producto         |
      | Computador Ryzen |
    Entonces podra ver el valor a pagar en su carrito de compras
