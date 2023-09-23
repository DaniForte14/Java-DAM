Algoritmo cálculo_salario
	// Este algoritmo calcula el salario a partir de los datos introducidos por el usuario
	// Definición de variables
	Definir num_horas como entero
	Definir precio_hora como real
	Definir salario como real
	// Bloque de entrada de datos
	Escribir "Introduzca el número de horas: "
	Leer num_horas
	Escribir "Introduzca el precio por hora: "
	Leer precio_hora
	// Bloque de transformación de información
	salario <- num_horas * precio_hora
	// Bloque de salida de información
	Escribir "El salario es: ", salario
FinAlgoritmo
