//Diseña un algoritmo que pida un numero positivo al usuario y
//muestre los valores desde dicho numero hasta el valor negativo del 
//número. Por ejemplo, si el valor elegido es 3, mostrará:
//3 2 1 0 -1 -2 -3

Algoritmo Ejercicio11Extra
	
	Definir num Como Entero
	Definir num1 Como Entero
	Definir encontrado Como Logico
	
	encontrado = Falso
	
	Escribir "Dime un numero "
	Leer num
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
