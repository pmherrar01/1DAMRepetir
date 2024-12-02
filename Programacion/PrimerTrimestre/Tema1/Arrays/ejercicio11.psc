//Crea un vector V con N elementos, donde N sea par.

//Inicialízalo con números aleatorios entre 0 y 100, de tal manera que la mitad sean pares y la otra mitad sean impares.

//No tiene porque haber ningún orden en la colocación de los números en el vector V, la única regla es que la mitad de elementos el vector sean pares y la otra impares.

//Ejemplo:
//Un vector de N = 6 elementos podría quedar así:
	
	//V
	//0	 			1		 2			3			 4			 5
	//2          	3      	 8         	6          	 5         	 7         

Funcion rellenarVector(v,n) 
	Definir i, numAleatorio, pares, impares Como Entero
	i = 0
	pares = 0
	impares = 0
	Repetir
		
		v[i] = azar(100)
		Si(v[i] %2 == 0)
			pares = pares + 1
		SiNo
			impares = impares + 1
		FinSi
		i = i + 1
	Hasta Que pares == n/2 Y impares == n/2 o i == n
	
FinFuncion

Funcion mostrarVector(v,n)
	Definir i Como Entero
	
	Para i = 0 Hasta n-1 Con Paso 1 Hacer
		Escribir  Sin Saltar "[" v[i] "]"
	FinPara
FinFuncion

Algoritmo ejerciccio11
	Definir v1, n Como Entero
	n = 4
	Dimensionar v1[n]
	
	rellenarVector(v1,n)
	mostrarVector(v1,n)
	
FinAlgoritmo
