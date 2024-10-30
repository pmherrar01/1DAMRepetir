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
Funcion num<- pedirNum(mensaje)
	Definir num Como Real
	
	Escribir mensaje
	Leer num
	
FinFuncion

Funcion total<- suma(a,b)
	Definir total Como Real
	
	total = a + b
FinFuncion

Funcion total<- resta(a,b)
	Definir total Como Real
	
	total = a - b
	
FinFuncion

Funcion total<- multiplicacion(a,b) 
	Definir total Como Real
	
	total = a * b
	
FinFuncion

Funcion total<- division(a,b)
	Definir total Como Real
	
	total = a / b
	
FinFuncion

Funcion esPar<- parOImpar(a)
	Definir esPar Como Logico
	
	esPar = Falso
	
	Si(a % 2 == 0 ) Entonces
		esPar = Verdadero 
	FinSi
	
FinFuncion

Funcion menu(mensaje)
	Definir num Como entero
	Definir resultadoSuma, resultadoResta, resultadoMultiplicacion, resultadoDivision, a, b Como Real
	DEfinir esPar Como Logico

	Escribir mensaje
	Repetir
		Escribir		"1- Suma: "
		Escribir		"2- Resta: "
		Escribir		"3- Multiplicacion: "
		Escribir		"4- Division: "
		Escribir		"5- Es par: "
		Escribir		"6- Salir: "
		Leer num
		
		Segun num Hacer
			
			1:
				a = pedirNum("Introduce un numero")
				b = pedirNum("Introduce otro numero para la suma")
				resultadoSuma  = suma(a,b)
				
				Escribir "La suma de " a " + " b " es: " resultadoSuma 
			2:
				a = pedirNum("Introduce un numero")
				b = pedirNum("Introduce otro numero para la resta")
				resultadoResta  = resta(a,b)
				
				Escribir "La resta de " a " - " b " es: " resultadoResta 
			3:
				
				a = pedirNum("Introduce un numero")
				b = pedirNum("Introduce otro numero para la multiplicacion")
				resultadoMultiplicacion = multiplicacion(a,b)
				
				Escribir "el resultado de " a " X " b " es: " resultadoMultiplicacion
			4:
				
				a = pedirNum("Introduce un numero")
				b = pedirNum("Introduce otro numero para la division")
				resultadoDivision  = division(a,b)
				
				Escribir "El resultado de " a " /" b " es: " resultadoDivision 
			5:
				a = pedirNum("Introduce un numero y te digo si es par o impar")
				esPar = parOImpar(a)
				Si(esPar) Entonces
					Escribir  a " es par"
				SiNo
					Escribir  a " es impar"
				FinSi
			De Otro Modo:
				Escribir "Saliendo..."
		FinSegun
	Hasta Que num == 6
FinFuncion


Algoritmo EjercicioCalculadora
	menu("Elige una opcion")
FinAlgoritmo
