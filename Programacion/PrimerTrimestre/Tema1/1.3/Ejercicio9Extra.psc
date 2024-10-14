//EXTRA: Diseña u  algoritmo que calcule el valor A elevaafo a B(A^B) sin 
//hacer uso del operador de potencia (^), siendo A y B valores
//introducidos por teclado, y luego muestre el resultado por pantalla

Algoritmo Ejercicio9Extra
	Definir num1 Como Real
	Definir num2 Como Real
	Definir  i Como Real
	Definir producto Como Real
	
	
	Escribir "Dame un numero"
	Leer num1
	Escribir "DAme otro numero"
	Leer num2
	
	producto = 1

	Para i<-1 Hasta num2 Con Paso 1 Hacer
		producto = producto * num1
	Fin Para
	Escribir "EL resultado de " num1 " elevado a " num2 " es: " producto

FinAlgoritmo
