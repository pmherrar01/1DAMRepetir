//Dado dos vectores V1 y V2 de N elementos, inicializarlos con números aleatorios entre 0 y 100.

//Finalmente ordenar todos los elementos de los dos vectores, de tal manera que en V1 queden los números más pequeños ordenados ascendentemente y enV2 queden los N números más grandes también ordenados de mayor a menor.  

//Ejemplo:
//SI tenemos dos vectores inicializado así:

	//	V1
	//	0			1			2			3
	//	2          	8          	9          	4          

	//	V2
	//	0	 		1			2			3
	//	5          	3          	8          	0          
	
	//El programa o proceso deberá ordenar el vector anterior y como resultado quedará un vector como sigue:
	
	//		V1
	//		0			1	 		2			3
	//		0          	2          	3          	4          
	
	//		V2
	//		0	 		1			2			3
	//		5          	8          	8          	9        
Funcion rellenarVector(v,n)
	Definir i Como Entero
	
	Para i = 0 Hasta n-1 Hacer
		v[i] = azar(100)
	FinPara
FinFuncion

Funcion mostrarVector(v,n, mensaje)
	Definir i Como Entero
	
	Escribir mensaje
	Para i = 0 Hasta n-1 Hacer
		Escribir Sin Saltar "[" v[i] "]"
	FinPara
	
FinFuncion

Funcion ordenarVector(v,n)
	Definir i, j, aux Como Entero
	
	Para i = 0 Hasta n-2 Hacer
		Para j = 0 Hasta n-2 Hacer
			Si (v[j] > v[j+1]) Entonces
				aux = v[j]
				v[j] = v[j+1]
				v[j+1] = aux
			FinSi
		FinPara
	FinPara
FinFuncion

Algoritmo ejercicio17
	Definir v1,v2,v3,n Como Entero
	n = 4
	Dimensionar v1[n], v2[n], v3[n*2]
	
	
	rellenarVector(v1,n)
	rellenarVector(v2,n)
	mostrarVector(v1,n,"Vector 1: ")
	Escribir ""
	mostrarVector(v2,n,"Vector 2: ")
	v3[n] = v1[n] + v2[n]
	ordenarVector(v3,n*2)

	Escribir ""
	mostrarVector(v3,n*2,"Vector 3:")
FinAlgoritmo
