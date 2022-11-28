# language: es
Característica: Validación de módulo registro

  Como usuario quiero validar los campos del módulo registro en appqa

  Escenario:Validar campo Username
    Dado que Francisco entra al modulo Register
    Entonces el encuentra el campo Username con texto Username


  Escenario:Validar campo Password
    Dado que Francisco entra al modulo Register
    Entonces el encuentra el campo Password con texto Password


  Escenario:Validar campo Repeat password
    Dado que Francisco entra al modulo Register
    Entonces el encuentra el campo Repeat password con texto Repeat password


  Escenario:Validar campo Email
    Dado que Francisco entra al modulo Register
    Entonces el encuentra el campo Email con texto Email (Opcional)

  Esquema del escenario: Verificar alertas al ingresar datos en campo Username

    Dado que Francisco entra al modulo Register
    Cuando el ingresa <username> en campo Username
    Y el presiona el botón SUBMIT
    Pero aparece el mensaje de Username <mensaje>
    Ejemplos:
      | username       | mensaje                        |
      | ionixtester    | Username exist                 |
      | ionixtester@   | Username should not contain @  |
      | @              | Username should not contain @  |

  Escenario:Validar campo Username no pueda estar vacío
    Dado que Francisco entra al modulo Register
    Cuando el ingresa  en campo Username
    Y el ingresa la password 123456@wQ
    Y el ingresa repeat password 123456@wQ
    Y el ingresa el email test@test.cl
    Y el presiona el botón SUBMIT
    Pero aparece el mensaje de Username Username should not be empty

  Escenario:Validar campo Username no se pueda repetir
    Dado que Francisco entra al modulo Register
    Cuando el ingresa gatito en campo Username
    Y el ingresa la password 123456@wQ
    Y el ingresa repeat password 123456@wQ
    Y el ingresa el email test@test.cl
    Y el presiona el botón SUBMIT
    Entonces se despliega el mensaje de bienvenida Welcome to ionix
    Cuando el presiona el botòn volver a registro
    Cuando el ingresa gatito en campo Username
    * el ingresa la password 123456@wQ
    * el ingresa repeat password 123456@wQ
    * el ingresa el email test@test.cl
    * el presiona el botón SUBMIT
    Pero aparece el mensaje de Username Username should not be empty

  Esquema del escenario: Verificar alertas en el campo Password

    Dado que Francisco entra al modulo Register
    Cuando el ingresa ionixtester1 en campo Username
    Y el ingresa la password <password>
    Y el presiona el botón SUBMIT
    Pero aparece el mensaje de Password <mensaje>
    Ejemplos:
      | password        | mensaje                            |
      | 12345qW@        | Password does not have the format  |
      | 123456789       | Password does not have the format  |
      | 12345678Q       | Password does not have the format  |
      | 1234567wQ       | Password does not have the format  |
      | qwertyuio       | Password does not have the format  |
      |                 | Password is required               |
      | 123456@wQ       | Repeat password is required        |

  Esquema del escenario: Verificar alertas en el campo Repeat Password

    Dado que Francisco entra al modulo Register
    Cuando el ingresa ionixtester1 en campo Username
    Y el ingresa la password 123456@wQ
    Y el ingresa repeat password <repeatPassword>
    Y el presiona el botón SUBMIT
    Pero aparece el mensaje de Repeat Password <mensaje>
    Ejemplos:
      | repeatPassword  | mensaje                            |
      | 123456@wq       | Password does not have the format  |
      |                 | Repeat password is required        |

  Escenario: Verificar alertas en el campo Email sin formato

    Dado que Francisco entra al modulo Register
    Cuando el ingresa ionixtester1 en campo Username
    Y el ingresa la password 123456@wQ
    Y el ingresa repeat password 123456@wQ
    Y el ingresa el email test
    Y el presiona el botón SUBMIT
    Pero aparece el mensaje de Email Please enter a valid email

  Esquema del escenario: Verificar campo Email vacío

    Dado que Francisco entra al modulo Register
    Cuando el ingresa ionixtester1 en campo Username
    Y el ingresa la password 123456@wQ
    Y el ingresa repeat password 123456@wQ
    Y el ingresa el email <mail>
    Y el presiona el botón SUBMIT
    Entonces se despliega mensaje informando <mensaje>

    Ejemplos:
      | mail  | mensaje                            |
      |       | Your email is empty, we recommended since is needed for account recovery, do you want continue?  |

  Escenario:Validar registro correcto con Email
    Dado que Francisco entra al modulo Register
    Cuando el ingresa ionixtester2 en campo Username
    Y el ingresa la password 123456@wQ
    Y el ingresa repeat password 123456@wQ
    Y el ingresa el email test@test.cl
    Y el presiona el botón SUBMIT
    Entonces se despliega el mensaje de bienvenida Welcome to ionix
