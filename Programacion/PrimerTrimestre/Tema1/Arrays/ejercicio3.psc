//Escriba un programa que almacene en un array los 20 primeros números pares. Mostrar el
//contenido del array.
Funcion esPar<- calcularPar(num) 
	Definir esPar Como Logico
	
	esPar = Falso
	
	Si (num %2 == 0) Entonces
		esPar = Verdadero
	FinSi
FinFuncion

Funcion mostrarVector(v) 
	Definir i, n Como Entero
	
	n = 20
	
	Para i = 0 Hasta n-1 Con Paso 1 Hacer
		Escribir Sin Saltar "[" v[i] "]"
	Fin Para
FinFuncion

Algoritmo ejercicio3
	Definir v1, n, i, numPar Como Entero
	n = 20
	numPar = 0
	Dimensionar v1[n]
	
	Para i = 0 Hasta n -1 Con Paso 1 Hacer
		Si(calcularPar(numPar)) Entonces
			v1[i] = numPar
			numPar = numPar + 2
		FinSi
	Fin Para
	
	mostrarVector(v1)
FinAlgoritmo
