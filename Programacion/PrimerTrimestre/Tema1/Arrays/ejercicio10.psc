//Dado dos vectores V1 y V2 de N elementos, inicializarlos con números aleatorios entre 0 y 100.

//Finalmente intercambia los elementos de los dos vectores, de tal manera que en V1 queden los elementos de V2 y viceversa  

//Ejemplo:
//SI tenemos dos vectores inicializado así:
		
//		V1
//		0	 		1			2			3
//		2          	8          	9          	4          
		
//		V2
//		0			 1	 		2			3
//		5          	3          	8          	0          
		
//	El programa o proceso deberá intercambiar los vectores  y como resultado quedarán los vectores como sigue:
			
//			V1
//			0	 		1	 		2			3
//			5          	3          	8          	0          
			
//			V2
//			0	 		1	 		2			3
//			2          	8          	9          	4 
Funcion rellenarVector(v,n)
	Definir i Como Entero
	
	Para i = 0 Hasta n-1 Con Paso 1 Hacer
		v[i] = azar(100)
	FinPara
FinFuncion

Funcion mostrarVector(v,n, mensaje)
	Definir i Como Entero
	
	Escribir mensaje
	Para i = 0 Hasta n-1 Con Paso 1 Hacer
		Escribir Sin Saltar "[" v[i] "]"
	FinPara
	
FinFuncion

Funcion intercambiarVector(v1,v2,v3, n)
	Definir i Como Entero
	
	Para i = 0 Hasta n-1 Con Paso 1 Hacer
		v3[i] = v1[i]
		v1[i] = v2[i]
	FinPara
	
FinFuncion

Algoritmo ejercicio10
	Definir v1, v2, v3, n Como Entero
	n = 4
	Dimensionar v1[n], v2[n], v3[n]
	
	rellenarVector(v1, n)
	rellenarVector(v2, n)
	
	mostrarVector(v1,n,"Vector 1 sin modificar")
	Escribir " "
	mostrarVector(v2,n,"Vector 2 sin modificar")
	
	intercambiarVector(v1,v2,v3,n)
	Escribir " "
	mostrarVector(v2,n,"Vector 1 modificado")
	Escribir " "
	mostrarVector(v3,n,"Vector 2 sin modificado")
FinAlgoritmo
