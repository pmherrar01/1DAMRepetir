//1. Escribe un algoritmo que pida dos numeros reales por teclado y muestre por pantalla
//el resultado de multiplicarlos. Implementa y utiliza la funci�n:

Funcion num<- pedirNum 
	Definir num Como Entero
	
	Repetir
		Escribir "Introduce un numero real"
		Leer num
		Si (num < 0) Entonces
			Escribir "El numereo " num " tiene que ser mayor que 0"
		FinSi
	Hasta Que num > 0
	
FinFuncion

Funcion producto<- multiplicar(a,b)
	Definir producto Como Entero
	
	producto = a * b
	
FinFuncion

Algoritmo Ejercicio1
	Definir a, b, producto Como Entero
	
	a = pedirNum()
	b = pedirNum()
	
	producto = multiplicar(a,b)
	
	Escribir "El producto de la multiplicacion de " a " X " b ": " producto 
FinAlgoritmo
