//Escriba un programa que almacene en un array 15 números aleatorios comprendidos entre
//1 y 50. Mostrar el contenido del array separando los números por guión. 
funcion n<- numAleatorio
	n = Aleatorio(1,50)
FinFuncion

Funcion mostrarVector(v)
	Definir i , n Como Entero
	n = 15
	Para i = 0 Hasta n-1 Con Paso 1 Hacer
		Si (i == n-1) Entonces
			Escribir  Sin Saltar v[i]
		SiNo
			Escribir Sin Saltar v[i] "-"
		FinSi
    Fin Para
FinFuncion

Algoritmo Ejercicio2
	Definir v1, n, i , numAle Como Entero
	n = 16 
	Dimensionar  v1[n]
	
	Para i=0 Hasta n-1 Con Paso 1 Hacer
		numAle = numAleatorio
		v1[i] = numAle
	Fin Para
	
	mostrarVector(v1)
	
FinAlgoritmo
