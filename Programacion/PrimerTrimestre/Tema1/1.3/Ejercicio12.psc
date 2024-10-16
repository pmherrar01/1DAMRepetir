//Diseña un algoritmo que dibuje una escalera de asteriscos. La altura de la 
//escalera se lee por teclado

Algoritmo Ejercicio12
	Definir num, i, j,  cont Como Entero
	cont = 0
	Repetir
		Escribir "Dime un numero "
		Leer num
		Si (num < 0 ) Entonces
			Escribir "Error el numero tiene que ser positivo"
		FinSi
	Hasta Que num > 0
	
	Para i = 1 Hasta num Con Paso 1 Hacer
		
			Para j = 1 Hasta i Con Paso 1 Hacer
				Escribir Sin Saltar "*"
			Fin Para
		
		Escribir  " "
	Fin Para
	
FinAlgoritmo
