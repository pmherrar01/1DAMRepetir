//Crea un programa que genere 5 números pares aleatorios y los guarde en un vector.
//Genera y guarda también 5 números impares aleatorios.
//Finalmente guarda y muestra  en un vector de 10 elementos esos números de la forma:
//	par	impar	par	impar	par	impar	par	impar	par	impar
Funcion mostrarVector (v)
	Definir i, n  Como Entero
	
	n = 5
	
	Para i = 0 Hasta n-1 Hacer
		Escribir Sin Saltar "[" v[i] "]"
	FinPara
FinFuncion

Funcion n<- generarNumAleatorio
	Definir n Como Entero
	
	n = Aleatorio(0, 500)
	
FinFuncion

Algoritmo ejercicio6
	Definir i, num, vPares, vImpares, numAleatorio, contPares, contImpares, v1 Como Entero
	Dimensionar vPares[5], vImpares[5], v1[10]
	
	num = 5
	contImpares = 5
	contPares = 5
	
	
	Para i = 0 Hasta num-1 Hacer
		Repetir
			numAleatorio = generarNumAleatorio()
		Hasta Que numAleatorio %2 == 0
		vPares[i] = numAleatorio
	FinPara
	
	Para i = 0 Hasta num-1 Hacer
		Repetir
			numAleatorio = generarNumAleatorio()
		Hasta Que numAleatorio %2 <> 0
			vImpares[i] = numAleatorio
	FinPara
	
	Escribir "Vector pares:"
	mostrarVector(vPares)
	
	Escribir " "
	Escribir "Vector impares:"
	mostrarVector(vImpares)
	
	Para i = 0 Hasta  num-1 Hacer
		v1[i*2] = vPares[i]
		v1[(i*2)+1] = vImpares[i]	
	FinPara
	

	Escribir " "
	Escribir "Vector3:"
	Para i = 0 Hasta  (num*2)-1 Hacer
		Escribir Sin Saltar "[" v1[i] "]"
	FinPara
	
FinAlgoritmo
