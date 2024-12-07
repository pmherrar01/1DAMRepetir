//Crea un vector V de N elementos y inicialízalos con números aleatorios entre 0 y 100.

//Ordena el vector V, de tal manera que en las primeras posiciones queden todos los números pares y después los números impares.

//Ejemplo:
//SI tenemos un vector inicializado así:

//		0        	1          	2          	3         	4             
//		6			7			8			9			0
	
//	El programa o proceso deberá ordenar el vector anterior y como resultado quedará un vector como sigue:
//		0			1			2			3			4
//		6        	8        	0        	7        	9       

Funcion rellenarVector(v,n)
	Definir i Como Entero
	
	Para i = 0 Hasta n-1 Con Paso 1 Hacer
		v[i] = azar(100)
	FinPara
	
FinFuncion

Funcion ordenarVector(v,n)
	Definir i, j, aux Como Entero
	
	Para i = 0 Hasta n - 2 Hacer
		Para j = 0 Hasta n - 2 Hacer
			Si (v[j] %2 <> 0) Entonces
				aux = v[j]
				v[j] = v[j+1]
				v[j+1] = aux
			FinSi
		FinPara
	FinPara
FinFuncion

Funcion mostrarVector(v,n, mensaje)
	Definir i Como Entero
	
	Escribir mensaje
	Para i = 0 Hasta n - 1 Hacer
		Escribir Sin Saltar "[" v[i] "]"
	FinPara
	
FinFuncion

Algoritmo ejercicio14
	Definir v1, n Como Entero
	n = 4
	Dimensionar v1[n]
	
	rellenarVector(v1,n)
	mostrarVector(v1,n, "Vector sin ordenar")
	ordenarVector(v1,n)
	Escribir ""
	mostrarVector(v1,n, "Vector ordenado")
	
FinAlgoritmo
