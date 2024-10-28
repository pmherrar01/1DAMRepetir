//Se desea desarrollar una calculadora en pseudocódigo que permita realizar seis
//operaciones distintas sobre números enteros. Cada operación debe implementarse
//como una función independiente para fomentar la modularidad y la reutilización de código.
//Especificaciones del Programa:
//1. El programa debe repetirse hasta que el usuario seleccione Salir
//2. Operaciones de la calculadora:
//		? Suma: Esta opción deberá sumar dos números ingresados por el usuario y
//			mostrar el resultado.
//		? Resta: Deberá restar el segundo número ingresado al primero y mostrar el
//			resultado.
//		? Multiplicación: Deberá multiplicar dos números ingresados por el usuario
//			y mostrar el resultado.
//		? División: Deberá dividir el primer número ingresado por el segundo y
//			mostrar el resultado.
//		? Es Par: Esta opción deberá verificar si un número ingresado por el usuario
//				es par o impar. Mostrar un mensaje indicando si es par o impar.
//		? Salir: Deberá terminar el programa.
//3. Implementa las funciones necesarias para evitar la repetición de código
//4. (AMPLIACIÓN PARA CASA): Modifica el programa para que el usuario
//	seleccione si va a realizar los cálculos con enteros o con reales
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
