//Dado un vector de N elementos, (N puede ser el valor que queráis, es decir una variable que guarda el número de elementos del vector), ordenar el vector de menor a mayor.

//Ejemplo:
//SI tenemos un vector inicializado así:

//			3	6	7	8	9	4	2	1	3	6

//	El programa o proceso deberá ordenar el vector anterior y como resultado quedará un vector como sigue:
	
//			1	2	3	3	4	6	6	7	8	9
Funcion rellenarVector(v,n)
	Definir  i Como Entero
	
	Para i = 0 Hasta n-1 Con Paso 1 Hacer
		Leer v[i]
	FinPara
FinFuncion

Funcion ordenarVector(v,n)
	Definir i, j, aux Como Entero
	
	Para i = 0 Hasta n-2 Con Paso 1 Hacer
		Para j = 0 Hasta n-2 Con Paso 1 Hacer
			Si(v[j] > v[j+1]) Entonces
				aux = v[j] 
				v[j] = v[j+1]
				v[j+1] = aux
			FinSi
 		FinPara
	FinPara
FinFuncion

Funcion mostrarVector(v,n)
	Definir  i Como Entero
	
	Para i = 0 Hasta n-1 Con Paso 1 Hacer
		Escribir Sin Saltar "[" v[i] "]"
	FinPara
FinFuncion

Algoritmo ejercicio13
	Definir v1, n Como Entero
	n = 10
	Dimensionar v1[n]
	
	rellenarVector(v1,n)
	ordenarVector(v1,n)
	mostrarVector(v1,n)
FinAlgoritmo
