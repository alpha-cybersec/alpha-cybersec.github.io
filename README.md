AUTOR: JEAN PIERRE VILLARROEL<br>
ALURA CHALLENGE 2 - CONVERSOR <br>
Conversor de Monedas<br>
Este es un programa de Java que permite realizar conversiones entre diferentes monedas basadas en el Dólar. Proporciona una interfaz gráfica de usuario (GUI) utilizando la biblioteca Swing de Java.

El programa consta de los siguientes paquetes y clases:

Paquete dev.alphacybersec.alura.challenge2.conversor.swing
Este paquete contiene las clases relacionadas con la interfaz gráfica de usuario (GUI) del conversor de monedas.

Clase ConversorGUI
Esta clase representa la ventana principal de la aplicación. Hereda de la clase JFrame de Swing y contiene los siguientes componentes:

conversorMonedasButton: Un botón que abre la ventana de conversión de monedas.
mainPanel: Un panel principal que contiene los componentes de la ventana.
Clase ConversorMonedasGUI
Esta clase representa la ventana de conversión de monedas. Hereda de la clase JFrame de Swing y contiene los siguientes componentes:

panelMonedas: Un panel que contiene los componentes relacionados con las opciones de conversión de monedas.
euroButton, libraEsterlinaButton, yenButton, wonButton: Botones que representan diferentes opciones de conversión de monedas.
SALIRButton: Un botón que cierra la aplicación.
REGRESARButton: Un botón que regresa a la ventana principal.
Paquete dev.alphacybersec.alura.challenge2.conversor.service
Este paquete contiene las clases relacionadas con los servicios del conversor de monedas.

Clase MonedaService
Esta clase contiene la lógica principal del conversor de monedas. Proporciona un menú de consola para seleccionar las opciones de conversión de monedas y realiza las conversiones correspondientes. Utiliza la clase Monedas y Moneda del paquete dev.alphacybersec.alura.challenge2.conversor.entity para obtener información sobre las monedas y mostrar los resultados de la conversión.

Paquete dev.alphacybersec.alura.challenge2.conversor.entity
Este paquete contiene las clases relacionadas con las entidades del conversor de monedas.

Enumeración Monedas
Esta enumeración representa las diferentes monedas disponibles para la conversión. Cada elemento de la enumeración tiene los siguientes atributos:

MONEDA: El nombre de la moneda.
VALORMONEDAUSD: El valor de la moneda en relación con el Dólar.
VALORUSDMONEDA: El valor del Dólar en relación con la moneda.
MONEDASIMBOLO: El símbolo de la moneda.
MONEDAPLURAL: La forma plural de la moneda.
Clase Moneda
Esta clase representa una instancia de una conversión de moneda. Tiene los siguientes atributos:

nombreMoneda: El nombre de la moneda.
cantidadConvertir: La cantidad de moneda a convertir.
conversion: El resultado de la conversión.
tipoConversion: El tipo de conversión (1 para convertir de la moneda a Dólar, 2 para convertir de Dólar a la moneda).
Clase ConversorAlura
Esta clase contiene el método main que inicia la aplicación y crea una instancia de la clase MonedaService para mostrar el menú de conversión de monedas.

Uso
Para utilizar el programa, ejecuta la clase ConversorAlura desde tu entorno de desarrollo Java. A continuación, se mostrará un menú que te permitirá seleccionar las opciones de conversión de monedas. Simplemente sigue las instrucciones en pantalla para realizar las conversiones.

Nota: Asegúrate de tener las bibliotecas de Swing y los recursos de imágenes (favicon-32x32.png) en la ruta correcta para que la interfaz gráfica se muestre correctamente.

¡Disfruta del conversor de monedas!

Notas adicionales
Este código fue desarrollado como parte de un desafío en el curso de Alura.
La información de las tasas de cambio utilizadas en este programa es ficticia y no representa las tasas de cambio reales.
La aplicación utiliza la biblioteca Swing de Java para la interfaz gráfica de usuario.
El código está estructurado en diferentes clases y paquetes para facilitar la organización y mantenimiento del código.
La conversión de monedas se realiza utilizando fórmulas matemáticas simples basadas en los valores de cambio proporcionados en la enumeración Monedas.
