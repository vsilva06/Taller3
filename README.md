# Taller3

Taller Laboratorio03: conceptos básicos de POO, diag. clases y Java.
1. Objetivo.

Evaluar la capacidad del estudiante para resolver un problema basado en el uso de los conceptos básicos de POO y modelado de clases con UML, garantizando además un mínimo de calidad de su solución, implementando pruebas unitarias y gestión de errores con LDP Java.

Condiciones del repositorio:

- Además, se desea evaluar la capacidad de trabajar un repositorio de código fuente con el uso de 2 ramas distintas, una para desarrollo y la master.

- Todos los COMMIT intermedios se hacen a la rama de DESARROLLO, sólo el resultado final (verificando que sus pruebas unitarias y gestión de errores) funcionan correctamente se pasan a la rama MASTER.

2. Caso.

- Se quiere modelar con UML e implementar algunas rutinas en código Java para el contexto de un computador, su memoria RAM y la muestra de sus datos por consola.

- Se considera que una memoria RAM tiene una marca, capacidad en GB y frecuencia en MHz.

- Por otro lado, un computador tiene una marca y un modelo, adenás de una memoria RAM.

- Todos los computadores tienen una memoria RAM, pero las memorias no necesitan saber en que computador están instaladas.

- Considere un menú en modo consola que permita ver y editar los datos de un computador.


3. Supuestos.

Para efectos de esta simulación, se debe considerar que:

- la capacidad en GB y la frecuencia en MHz de una memoria RAM pueden ser números enteros.

- el resto de los datos asociados a un computador y su memoria pueden ser considerados como cadenas de texto.

- el menú en modo consola debe hacer uso de los métodos de un computador para que un usuario pueda Interactuar con elLos.

- considere el mínimo de métodos necesarios constructores con/sin parámetros, getter/setter, toString, etc. para implementar sus clases.

- privilegie en todo momento la provacidad de los datos y métodos según corresponda.

4. Información a ser entregada.

i. Con las clases y relaciones identificadas debe construir un modelo de clases detallado usando VP, consierando clases, sus atributos y métodos (tipo y encapsulameinto), relaciones (roles y multiplicidad).

ii. El menú en modo consola debe tener una primera opción que al ser seleccionada, permita al usuario mostrar los datos del compuador.

iii. El menú en modo debe tener una segunda opción que al ser seleccionada, permita al usuario editar los datos del compuador.

iv. El menú en modo debe tener una tercera opción que al ser seleccionada, permita salir de la aplicación tras una confirmacióndel usuario.

5. Consideraciones para la solución a implementar.

- El código fuente del método Main debe estar contenido en una clase llamada PrincipalTaller03.java y sólo debe contener la instanciación de la clase que implementa el menú en modo consola.

- Considere algunas validaciones mínimas para las entradas de datos y resultados obtenidos.

- Además de las funcionalidades indicadas, puede hacer uso de clases y métodos auxiliares que considere necesario para cumplir con los objetivos requeridos.

- Considere el uso de excepciones, gestión de errores y mensajes de usuario para mejorar la robustez de su programa.

- Debe desarrollar al menos una prueba unitaria a c/u de los métodos principales de sus clases modeladas.

- Debe considerar el uso de las buenas prácticas de programación para su código fuente (nombre de las clases, las variables y los métodos, indentación, extensión de los métodos, uso de comentarios, etc.).

- No se considera el uso de variables globales.

6. Consideraciones para la entrega de su solución.

- El repositorio donde se alojará la respuesta al taller tendrá 2 ramas, la MASTER y una para el desarrollo.

- Se deberán registrar los COMMIT en su repositorio cada 30 minutos, considerando:

i. El primer COMMIT a las 9:00AM y considera el modelo de clases detallado, una imagen PNG de su modelo y el archivo .VPP del proyecto hecho en VP. Considere además agregar un archivo README en su repositorio, que indique el nombre del desarrollador y las principales características de su solución.

ii. Luego a las 9:30 el código completo de la clase MemoriaRAM.

iii. A continuación, a las 10:00 el código completo de la clase Computador.

iv. Finalmente, a las 10:30, el código completo de la clase VentanaConsola y la clase Main. No olvide ir subiendo las pruebas unitarias asociadas.

OBS: Se podrá registrar para efectos de calificación el último COMMIT a las 11:00hrs. Como mínimo deberá tener 4 COMMITS en su repositorio.

- Las integraciones a la rama MASTER se considerarán para la última entrega que haga el estudiante, tope las 11:00hrs.

- Se envía el link al repositorio GitHub en Campus virtual, hasta las 10:35 (hora del campus).
