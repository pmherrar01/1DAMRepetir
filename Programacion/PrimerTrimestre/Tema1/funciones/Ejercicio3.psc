//Escribe un algoritmo que pida dos numeros enteros por teclado y muestre por pantalla cual es
//el minimo.

Funcion num<- pedirNum (mensaje)
	Definir num Como Entero
	
	Repetir
		Escribir mensaje
		Leer num
		Si (num < 0) Entonces
			Escribir "El numereo " num " tiene que ser mayor que 0"
		FinSi
	Hasta Que num > 0
	
FinFuncion

Funcion minimo<- calcularMinimo(a,b)
	Definir minimo Como Entero
	
	minimo = a - b
	
FinFuncion

Algoritmo Ejercicio3
	Definir a,b, minimo Como Entero
	
	a = pedirNum("Introduce un numero entero")
	b = pedirNum("Introduce otro numero entero")
	
	minimo = calcularMinimo(a,b)
	
	Escribir "El minimo de " a " - " b ": " minimo
FinAlgoritmo 
