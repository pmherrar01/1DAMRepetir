//Rellenar un vector con 20 números aleatorios entre 0 y 10.
//Posteriormente solicitar a un usuario que introduzca un número entre 0 y 10.
//Buscar el  número indicado por el usuario y si lo encuentra decir que lo ha encontrado y en que posición del vector se encuentra.
funcion numAleatorio<- generarNumAleatorio
	Definir numAleatorio Como Entero
	numAleatorio = Aleatorio(0,10)
FinFuncion


funcion rellenarVector(v, n)
	Definir numAle, i Como Entero
	Para i = 0 hasta n-1 Con Paso 1 Hacer
		numAle = generarNumAleatorio()
		v[i] = numAle
	FinPara
FinFuncion

Funcion mostrarVector(v,n) 
	Definir i Como Entero
	Para i = 0 hasta n-1 Con Paso 1 Hacer
		Escribir Sin Saltar "[" v[i] "]"
	FinPara
FinFuncion

Funcion num<- pedirNum(mensaje)
	Definir num Como Entero
	
	Repetir
		Escribir mensaje
		Leer num
		Si(num < 0 o num > 10) Entonces
			Escribir "Error el numero tine que estar entre el o y el 10"
		FinSi
	Hasta Que num >= 0 Y num <= 10
FinFuncion

Funcion buscarNum(v,n,num)
	Definir i Como Entero
	Definir encontrado Como Logico
	
	encontrado = Falso
	
	Para i = 0 Hasta n-1 Con Paso 1 Hacer
		Si(v[i] == num) Entonces
			Escribir "El numero" num " se encuentra dentro del vector en la posicion " i+1
			encontrado = verdadero
		FinSi
	FinPara
	
	Si ( no encontrado) Entonces
		Escribir "el numero " num " no se encuentra dentro del vector" 
	FinSi
FinFuncion

Algoritmo ejercicio7
	Definir v1, n, numUsuario Como Entero
	n = 20
	Dimensionar v1[n]
	
	rellenarVector(v1, n)
	Escribir "Este es el vector relleno:" 
	mostrarVector(v1,n)
	Escribir " "
	numUsuario = pedirNum("Introduce un numero entre el 0 y  el 10")
	
	buscarNum(v1,n,numUsuario)
FinAlgoritmo
