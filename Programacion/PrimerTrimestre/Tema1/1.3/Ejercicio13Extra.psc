//REaliza un programa que pida al usuario un numero y construya una piramide Ej:
//"Introduce un numero": 6
//     *
//    ***
//   *****
//  *******
// *********
//***********

Algoritmo Ejercicio13Extra
	
	Definir num, i, j, a  Como Entero
	
	Repetir
		Escribir "Dime un numero "
		Leer num
		Si (num < 0 ) Entonces
			Escribir "Error el numero tiene que ser positivo"
		FinSi
	Hasta Que num > 0
	
	

	Para i = 1 Hasta num Con Paso 1 Hacer
		
		Para j = 1 Hasta (num-i) Con Paso 1 Hacer
			Escribir Sin Saltar " "
		Fin Para
		
		Para a = 1  Hasta i Con Paso 1 Hacer
			Escribir sin saltar "*"
		Fin Para
		
		Para j =1 Hasta (i)-num Con Paso 1 Hacer
			Escribir Sin Saltar " "
		Fin Para
		
		Para a = 2  Hasta i Con Paso 1 Hacer
			Escribir sin saltar "*"
		Fin Para

		Escribir  " "
	Fin Para
	
FinAlgoritmo
