//Escriba un programa que almacene en un array 10 números enteros aleatorios entre 1 y
//100. Calcular y mostrar la media de los números impares
Funcion numAleatorio<- calcularAleatorio
	DEfinir numAleatorio Como Entero
	
	numAleatorio = Aleatorio(1,100)
	
FinFuncion

Funcion media<- calcularMediaNumerosImpares(v)
	Definir media Como Real
	Definir i, n, cont Como Entero
	n = 10
	media = 0
	cont = 0
	
	Para i = 0 Hasta n-1 Con Paso 1 Hacer
		Si(i %2 <> 0) Entonces
			media = media + v[i]
			cont = cont + 1
		FinSi
	Fin Para
	
	media = media / cont
	
FinFuncion

Funcion mostrarVector(v)
	Definir i, n Como Entero
	n = 10
	
	Para i = 0 Hasta n-1 Con Paso 1 Hacer
		Escribir Sin Saltar "[" v[i] "]"
	Fin Para
	
FinFuncion

Algoritmo ejercicio4
	Definir i, v1, n Como Entero
	Definir media Como REal
	n = 10
	media = 0
	Dimensionar v1[n]
	
	Para i = 0 Hasta n-1 Con paso 1 Hacer
		v1[i] = calcularAleatorio
	FinPara
	
	Escribir "Array sin calcular la media de los numeros impares: "
	mostrarVector(v1)

	
	media = calcularMediaNumerosImpares(v1)
	
	Escribir " "
	
	Escribir "La media de los numeros impares es: " media
FinAlgoritmo
