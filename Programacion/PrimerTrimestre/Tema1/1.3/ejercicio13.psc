//Diseña un algoritmo que dibuje una escalera invertida de asteriscos. La altura de la 
//escalera se lee por teclado
//Ej: "Introduce un nnumero": 
//5
//*****
//****
//***
//**
//*

Algoritmo ejercicio13
	Definir num, i, j Como Entero
	cont = 0
	Repetir
		Escribir "Dime un numero "
		Leer num
		Si (num < 0 ) Entonces
			Escribir "Error el numero tiene que ser positivo"
		FinSi
	Hasta Que num > 0
	
	Para i = 1 Hasta num Con Paso 1 Hacer
		
		Para j = num Hasta i Con Paso -1 Hacer
			Escribir Sin Saltar "*"
		Fin Para
		
		Escribir  " "
	Fin Para
FinAlgoritmo
