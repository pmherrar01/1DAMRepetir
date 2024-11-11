//Escriba un programa que almacene en un array 15 números aleatorios comprendidos entre
//1 y 50. Mostrar el contenido del array separando los números por guión. 
funcion n<- numAleatorio
	n = Aleatorio(1,50)
FinFuncion

Funcion v1<- rellernarVector
	DEfinir v1, n, i, numAle Como Entero
	n = 16 
	Dimensionar  v1[n]
	
	Para i=0 Hasta n-1 Con Paso 1 Hacer
		numAle = numAleatorio
		v1[i] = numAle
	Fin Para
	
FinFuncion

Funcion mostrarVector(v)
	Definir i Como Entero
	
	Para i = 0 Hasta 14 Con Paso 1 Hacer
		Escribir Sin Saltar v[i] "- "
    Fin Para
FinFuncion

Algoritmo Ejercicio2
	Definir v1, n Como Entero
	Dimensionar  v1[15]
	v1[15]= rellernarVector
	mostrarVector(v1)
	
FinAlgoritmo
