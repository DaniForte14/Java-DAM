Algoritmo c�lculo_salario
	// Este algoritmo calcula el salario a partir de los datos introducidos por el usuario
	// Definici�n de variables
	Definir num_horas como entero
	Definir precio_hora como real
	Definir salario como real
	// Bloque de entrada de datos
	Escribir "Introduzca el n�mero de horas: "
	Leer num_horas
	Escribir "Introduzca el precio por hora: "
	Leer precio_hora
	// Bloque de transformaci�n de informaci�n
	salario <- num_horas * precio_hora
	// Bloque de salida de informaci�n
	Escribir "El salario es: ", salario
FinAlgoritmo
