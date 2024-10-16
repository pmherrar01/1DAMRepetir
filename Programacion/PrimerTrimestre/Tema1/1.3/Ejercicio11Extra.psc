//Diseña un algoritmo que pida un numero positivo al usuario y
//muestre los valores desde dicho numero hasta el valor negativo del 
//número. Por ejemplo, si el valor elegido es 3, mostrará:
//3 2 1 0 -1 -2 -3

Algoritmo Ejercicio11Extra
	
	Definir num Como Entero
	Definir encontrado Como Logico
	
	encontrado = Falso
	
	Repetir
		Escribir "Dime un numero "
		Leer num
		Si (num < 0 ) Entonces
			Escribir "Error el numero tiene que ser positivo"
		FinSi
	Hasta Que num > 0
	num1 = num
	
	Escribir num
	Repetir
		num = num - 1
		Si num == (-num1) Entonces
			encontrado = Verdadero
		FinSi
		Escribir num
	Hasta Que encontrado
	
FinAlgoritmo
