//1. Guarda en una variable tu nombre
//2. Pide al usuario que intente adivinar tu nombre pidiendo que lo introduzca por teclado
//3. EL programa finaliza cuando el usuario adivina tu nombre. Sino el programa debe continuar.

Algoritmo Ejercicio4
	Definir nombre Como Caracter
	Definir pedirNombre Como Caracter
	
	nombre = "pablo"
	
	Repetir
		Escribir "Intenta adivinar mi nombre"
		Leer pedirNombre
		Si(pedirNombre == nombre) Entonces
			Escribir "Muy bien has adivinado mi nombre"
		SiNo
			Escribir "Error has fallado"
		FinSi
	Hasta Que pedirNombre == nombre
	
FinAlgoritmo
