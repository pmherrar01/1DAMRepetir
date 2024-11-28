//Crea un programa que pida al usuario que introduzca su nombre letra a letra y que finalice con el número cero.
//Finalmente mostrar su nombre al revés.
//Ejemplo:
//	> Introduzca su nombre letra a letra. Presione enter en cada letra. Para finalizar pulse 0.
//		> A
//		> n
//		> g
//		> e
//		> l
//		> 0
//		> Su nombre al revés es legnA
Funcion rellenarVector(v)
	Definir i Como Entero
	i = -1
	Escribir "Introduce tu nombre letra a letra y si has terminado introduce un (0)"
	Repetir
		i = i + 1
		Leer v[i]
		
	Hasta Que v[i] == "0"
FinFuncion

Funcion mostrarVectorInvertido(v, n, mensaje)
	Definir i Como Entero
	i = 0
	Escribir mensaje
	Para i = (n-1) Hasta 0 Con Paso  -1 Hacer
		Escribir Sin Saltar v[i]
	FinPara
FinFuncion

Algoritmo ejercicio8
	Definir v1 Como Caracter
	Definir n Como Entero
	n = 80
	Dimensionar v1[n]
	rellenarVector(v1)
	mostrarVectorInvertido(v1,5,"Su nombre invertido es:")
FinAlgoritmo

