//Escriba un programa que llene un array con números del 1 al 10 y los muestre por pantalla.

Algoritmo Ejercicio1
	Definir ar, i, n Como Entero
	n = 10 
	Dimensionar ar[n]
	
	Para i = 0 Hasta n-1 Con Paso 1 Hacer
		ar[i] = i
	Fin Para
	
	Para i = 0 Hasta n-1 Con Paso 1 Hacer
		Escribir Sin Saltar "[" ar[i] "]"
	Fin Para
	
FinAlgoritmo
