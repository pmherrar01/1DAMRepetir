//Se desea desarrollar una calculadora en pseudoc�digo que permita realizar seis
//operaciones distintas sobre n�meros enteros. Cada operaci�n debe implementarse
//como una funci�n independiente para fomentar la modularidad y la reutilizaci�n de c�digo.
//Especificaciones del Programa:
//1. El programa debe repetirse hasta que el usuario seleccione Salir
//2. Operaciones de la calculadora:
//		? Suma: Esta opci�n deber� sumar dos n�meros ingresados por el usuario y
//			mostrar el resultado.
//		? Resta: Deber� restar el segundo n�mero ingresado al primero y mostrar el
//			resultado.
//		? Multiplicaci�n: Deber� multiplicar dos n�meros ingresados por el usuario
//			y mostrar el resultado.
//		? Divisi�n: Deber� dividir el primer n�mero ingresado por el segundo y
//			mostrar el resultado.
//		? Es Par: Esta opci�n deber� verificar si un n�mero ingresado por el usuario
//				es par o impar. Mostrar un mensaje indicando si es par o impar.
//		? Salir: Deber� terminar el programa.
//3. Implementa las funciones necesarias para evitar la repetici�n de c�digo
//4. (AMPLIACI�N PARA CASA): Modifica el programa para que el usuario
//	seleccione si va a realizar los c�lculos con enteros o con reales
Funcion menu(mensaje)
	Definir salir Como Caracter
	
	Repetir
		Escribir		"1- Suma: "
		Escribir		"2- Resta: "
		Escribir		"3- Multiplicacion: "
		Escribir		"4- Division: "
		Escribir		"5- Es par: "
		Escribir		"6- Salir: "
	Hasta Que salir == "salir"
FinFuncion


Algoritmo EjercicioCalculadora
	
FinAlgoritmo
