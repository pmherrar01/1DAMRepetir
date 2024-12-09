//Crea una función que reciba como parámetro un vector V y su número de elementos N y retorne Verdadero o Falso dependiendo de si el Vector V está ya ordenado.

//Nota: Pruébalo con diferentes vectores para comprobar que funciona correctamente.
Funcion rellenarVector(v,n)
	Definir  i Como Entero
	
	Para i = 0 Hasta n-1 Hacer
		Leer v[i]
	FinPara
	
FinFuncion

Funcion mostrarVector(v,n, mensaje)
	Definir i Como Entero
	
	Escribir mensaje
	Para i = 0 Hasta  n-1 Hacer
		Escribir Sin Saltar "[" v[i] "]"
	FinPara
FinFuncion

Funcion ordenado<- comprobarVector(v,n)
	Definir i, j Como Entero
	Definir ordenado Como Logico
	
	ordenado = Verdadero
	
	Para i = 0 Hasta n-2 Hacer
		Para j = 0 Hasta n-2 Hacer
			Si (v[j] > v[j+1])
				ordenado = Falso
			FinSi
		FinPara
	FinPara
	
FinFuncion

Algoritmo ejercicio16
	Definir v1, n Como Entero
	n = 4
	Dimensionar v1[n]
	
	rellenarVector(v1,n)
	mostrarVector(v1,n,"Vector:")
	Si (!comprobarVector(v1,n)) Entonces
		Escribir "El vector no esta ordenado"
	SiNo
		Escribir "El vector si esta ordenado" 
	FinSi
	
FinAlgoritmo
