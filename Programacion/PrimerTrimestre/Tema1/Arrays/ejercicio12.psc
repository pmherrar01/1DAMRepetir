//Crea un vector V y de N elementos, y inicialízalo con números aleatorios entre 0 y 100, de tal manera que la mitad sean pares y la otra mitad sean impares.

//Posteriormente divide el vector V en dos V1 y V2, donde en V1 estarán sólo los números pares y en V2 los números impares.

//Ejemplo:
	
//Un vector V de N = 6 elementos podría quedar así:
	
//	V
//	0	 		1			 2			3			 4			 5
//	2          	3          	8          	6          	 5         	 7          
	
//Los vectores V1 y V2 quedarían así:
//	V1
//	0	 		1			 2
//	2          	8          	6          
	
//	V2
//	0	 		1			 2
//	3          	5          	7
Funcion rellenarVector(v,n) 
	Definir i, numAleatorio, pares, impares Como Entero
	i = 0
	pares = 0
	impares = 0
	
	Mientras i < n Hacer
		
		numAleatorio = azar(100)
		Si(numAleatorio %2 == 0 Y pares < n/2)
			v[i] = numAleatorio
			pares = pares + 1
			i = i + 1
		FinSi
		Si(numAleatorio%2 <> 0 Y impares < n/2 ) Entonces
			v[i] = numAleatorio
			impares = impares + 1
			i = i + 1
		FinSi
	Fin Mientras
FinFuncion

Funcion separarVectoresParesEImpares(v1,v2,v3, n)
	Definir i, p, im Como Entero
	p = 0
	im = 0
	Para i = 0 Hasta n-1 Con Paso 1 Hacer
		Si(v1[i] %2 == 0) Entonces
			v2[p] = v1[i]
			p = p + 1
		SiNo
			v3[im] = v1[i]
			im = im + 1
		FinSi
	FinPara
	
FinFuncion

Funcion mostrarVector(v,n, mensaje)
	Definir i Como Entero
	Escribir mensaje
	Para i = 0 Hasta n-1 Con Paso 1 Hacer
		Escribir  Sin Saltar "[" v[i] "]"
	FinPara
FinFuncion
Algoritmo ejercicio12
	Definir v1,vPares, vImpares, n Como Entero
	n = 4
	Dimensionar v1[n], vPares[n/2], vImpares[n/2]
	
	rellenarVector(v1,n)
	mostrarVector(v1,n, "Vector inicial")
	separarVectoresParesEImpares(v1,vPares,vImpares,n)
	Escribir ""
	mostrarVector(vPares, n/2, "Vector pares")
	Escribir ""
	mostrarVector(vImpares, n/2, "Vector impares")
FinAlgoritmo
