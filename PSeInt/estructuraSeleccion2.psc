Algoritmo esMayorMenorOIgual
	// Algoritmo que calcula si un número es mayor igual o menor
	// Definición de variables
	Definir num1 como entero
	Definir num2 como entero
	Escribir "Introduzca el primer número: "
	Leer num1
	Escribir "Introduzca el segundo número: "
	Leer num2
	Si num1 < num2 Entonces
		Escribir "El primer número es menor que el segundo"
	SiNo
		Si num1 == num2 Entonces
			Escribir "Los dos números son iguales"
		SiNo
			Escribir "El primer número es mayor que el segundo"
		FinSi
	FinSi
FinAlgoritmo
