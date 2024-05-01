Reporte: El programa ListSorter.java inicia con la creación de una List que es instanciada como ArrayList. Se añaden diez cadenas de texto distintas a la lista. Luego, el programa realiza el ordenamiento de estas cadenas de texto en dos criterios principales: por longitud y alfabéticamente, utilizando tres diferentes estrategias de ordenamiento. Se implementan seis formas de ordenamiento utilizando las capacidades de la interfaz List y la interfaz Comparator de Java. 
Ordenamiento por Longitud:
•	Clase Anónima: Aquí, se define una clase anónima que implementa Comparator donde el método compare compara las longitudes de dos cadenas.
•	Expresión Lambda: La expresión lambda simplifica la sintaxis y proporciona una manera concisa de implementar el comparador.
•	Método de Referencia: Esta es la forma más concisa, utilizando un método de referencia que apunta directamente al método que retorna la longitud de la cadena. 
Ordenamiento Alfabético:
•	Clase Anónima: Similar al primer caso, pero comparando las cadenas directamente.
•	Expresión Lambda: Utiliza una expresión lambda para comparar directamente las cadenas.
•	Método de Referencia: Utiliza el método compareTo de la clase String como método de referencia para el ordenamiento.
Ventajas de Cada Método:
•	Clases Anónimas: Proporcionan una forma clara de definir el comportamiento de comparación personalizado en el lugar.
•	Expresiones Lambda: Ofrecen brevedad y claridad, reduciendo el código boilerplate.
•	Métodos de Referencia: Son los más limpios y expresivos, ideales cuando el método existente realiza directamente la acción deseada. 
Conclusión: El uso de diferentes estrategias de ordenamiento en Java proporciona una gran flexibilidad para manipular colecciones. Dependiendo del contexto y la preferencia del desarrollador, se pueden utilizar clases anónimas para un control explícito, expresiones lambda para concisión, o métodos de referencia para máxima claridad y expresividad. Este programa demuestra cómo implementar cada uno de estos enfoques en un contexto práctico.
