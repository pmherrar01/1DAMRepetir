//Realiza un juego para adivinar un número.
//Para ello primero el programa debe guardar un numero en un variable
//y el usuario debe introducir números hasta acertarlos.
//Para darle psitas al usuario se le indicará "mayor" o "menor" segun sea
//mayor o menor con respecto ak numero guardado. El proceso termina
//cuando el usuario acierta.

//EXTRA: Diseña u  algoritmo que calcule el valor A elevaafo a B(A^B) sin 
//hacer uso del operador de potencia (^), siendo A y B valores
//introducidos por teclado, y luego muestre el resultado por pantalla

Algoritmo Ejercicio9
	Definir numParaAdivinar Como Entero
	Definir  num Como Entero
	Definir encontrado Como Logico
	
	numParaAdivinar = 234
	encontrado = Falso
	
	Repetir
		Escribir "Intenta adivinar el numero"
		Leer num
		Si(num==numParaAdivinar) Entonces
			encontrado = Verdadero
			Escribir  "Has encontrado el numero"
		SiNo
			Si (num < numParaAdivinar) Entonces
				Escribir "El numero es mayor"
			Sino
				Escribir  "El numero es menor"
			FinSi
		FinSi
	Hasta Que encontrado
FinAlgoritmo
